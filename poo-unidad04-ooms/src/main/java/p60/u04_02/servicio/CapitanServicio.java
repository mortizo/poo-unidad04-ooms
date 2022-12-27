/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02.servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p60.u04_02.modelo.Capitan;

/**
 *
 * @author morti
 */
public class CapitanServicio implements ICapitanServicio{

    private static List<Capitan> capitanList = new ArrayList<>();

    @Override
    public Capitan crear(Capitan capitan) {
        var capitanBuscado=this.buscarPorCodigo(capitan.getCodigo());
        if(capitanBuscado==null){
            this.capitanList.add(capitan);
        }else{
            throw new RuntimeException("El código ingresado ya se encuentra "
                    + "asignado al Capitán: "+capitanBuscado.getNombre());
        }
        try {
            this.almacenarEnArchivo(capitan, "C:/carpeta1/archivoCapitan.dat");
        } catch (Exception ex) {
            throw new RuntimeException("No se puede almacenar en archivo"+ex.getMessage());
        }
        return capitan;
    }
    
    public List<Capitan> listar(){
        try {
            this.capitanList=this.recuperarDeArchivo("C:/carpeta1/archivoCapitan.dat");
        } catch (Exception ex) {
            throw new RuntimeException("No se puede recuperar de archivo"+ex.getMessage());
        }
        return this.capitanList;
    }

    @Override
    public Capitan buscarPorCodigo(int codigoCapitan) {
        Capitan capitan=null;
        for(var c:this.capitanList){
            if(codigoCapitan==c.getCodigo()){
                capitan=c;
                break;
            }
        }
        return capitan;
    }

    @Override
    public boolean almacenarEnArchivo(Capitan capitan, String rutaArchivo) throws Exception{
        var retorno = false;
        DataOutputStream salida=null;
        try{
            salida = new DataOutputStream( new FileOutputStream(rutaArchivo,true) );
            salida.writeInt(capitan.getCodigo());
            salida.writeUTF(capitan.getNombre());
            salida.writeUTF(capitan.getPais());
            salida.close();
            retorno=true;
        }catch(IOException e)
        {
            salida.close();
        }
        return retorno;
    }

    @Override
    public List<Capitan> recuperarDeArchivo(String rutaArchivo) throws Exception {
        var capitanList = new ArrayList<Capitan>();
        DataInputStream entrada=null;
        try{
            entrada = new DataInputStream(new FileInputStream(rutaArchivo));
            while(true){
                var codigo=entrada.readInt();
                var nombre=entrada.readUTF();
                var pais=entrada.readUTF();
                var capitan = new Capitan(codigo,nombre,pais);
                capitanList.add(capitan);
            }
        }catch(IOException e){
            entrada.close();
        }
        
        return capitanList;
    }
    
    

}
