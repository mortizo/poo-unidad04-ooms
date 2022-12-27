/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02.servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p60.u04_02.modelo.Profesion;

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
        try {
            this.almacenarEnArchivo(profesion, "C:/carpeta1/archivoProfesion.dat");
        } catch (Exception ex) {
            throw new RuntimeException("No se puede almacenar en archivo"+ex.getMessage());
        }
        return profesion;
    }

    private void almacenarEnArchivo(Profesion profesion, String ruta) throws Exception{
        DataOutputStream salida=null;
        try{
            salida = new DataOutputStream(new FileOutputStream(ruta,true));
            salida.writeInt(profesion.getCodigo());
            salida.writeUTF(profesion.getDescripcion());
            salida.close();
        }
        catch(Exception e1){
            salida.close();
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
        try {
            this.profesionList=this.recuperarDeArchivo("c:/carpeta1/archivoProfesion.dat");
        } catch (Exception ex) {
            throw new RuntimeException("No se puede recuperar datos del archivo"+ex.getMessage());
        }
        return this.profesionList;
    }
    
    private List<Profesion> recuperarDeArchivo(String ruta) throws Exception{
        List<Profesion> profesionList = new ArrayList<>();
        DataInputStream entrada=null;
        try{
            entrada = new DataInputStream(new FileInputStream(ruta));
            while(true)
            {
                var codigo=entrada.readInt();
                var descripcion=entrada.readUTF();
                Profesion profesion= new Profesion(codigo,descripcion);
                profesionList.add(profesion);
            }
        }
        catch(Exception e1){
          entrada.close();
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
