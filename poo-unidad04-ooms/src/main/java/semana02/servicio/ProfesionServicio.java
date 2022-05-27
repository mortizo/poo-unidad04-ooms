/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02.servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import semana02.modelo.Profesion;

/**
 *
 * @author morti
 */
public class ProfesionServicio implements IProfesionServicio{

    private static List<Profesion> profesionList = new ArrayList<>();
    
    @Override
    public Profesion crear(Profesion profesion) {
        if(this.existeCodigo(profesion.getCodigo())){
            throw new RuntimeException("El código de la profesión ya existe"); 
        }
        this.profesionList.add(profesion);
        this.almacenarEnArchivo(profesion, "C:/carpeta1/archivoProfesion.dat");
        return profesion;
    }

    private void almacenarEnArchivo(Profesion profesion, String ruta){
        try{
            var salida = new DataOutputStream(new FileOutputStream(ruta,true));
            salida.writeInt(profesion.getCodigo());
            salida.writeUTF(profesion.getDescripcion());
            salida.close();
        }
        catch(Exception e1){
        //    System.out.println("Error General al almacenar Profesión"+e1.toString());
        }
    }
    
    private boolean existeCodigo(int codigo)
    {
        var retorno=false;
        for(var profesion:this.profesionList){
            if(profesion.getCodigo()==codigo){
                retorno=true;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Profesion> listar() {
        return this.profesionList=this.recuperarDeArchivo("c:/carpeta1/archivoProfesion.dat");
    }
    
    private List<Profesion> recuperarDeArchivo(String ruta){
        List<Profesion> profesionList = new ArrayList<>();
        try{
            var entrada = new DataInputStream(new FileInputStream(ruta));
            while(true)
            {
                var codigo=entrada.readInt();
                var descripcion=entrada.readUTF();
                Profesion profesion= new Profesion(codigo,descripcion);
                profesionList.add(profesion);
            }
        }
        catch(Exception e1){
          //  System.out.println("Error General al recuperar Profesión"+e1.toString());
        } 
        return profesionList;
    }

    @Override
    public Profesion buscarPorCodigo(int codigo){
        for(var profesion:this.profesionList){
            if(profesion.getCodigo()==codigo)
                return profesion;
        }
        throw new RuntimeException("No se encontró el código de la profesión");
    }

    @Override
    public Profesion eliminar(int codigo) {
        var profesion = this.buscarPorCodigo(codigo);
        this.profesionList.remove(profesion);
        return profesion;
    }
    
}
