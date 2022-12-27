/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02.servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p60.u04_02.modelo.Persona;
import p60.u04_02.modelo.Profesion;

/**
 *
 * @author morti
 */
public class PersonaServicio implements IPersonaServicio{

    private static List<Persona> personaList = new ArrayList<>();
    
    @Override
    public Persona crear(Persona persona) { 
        if(this.existeCodigo(persona.getCodigo())){
            throw new RuntimeException("El código de la persona ya existe");
        }else{
            this.personaList.add(persona);
            try {
                this.almacenarEnArchivo("C:/carpeta1/archivoPersona.dat",persona);
            } catch (Exception ex) {
                throw new RuntimeException("No se puede almacenar datos en el archivo "+ex.getMessage());
            }
            return persona;
        }
    }
  
    
    public void almacenarEnArchivo(String ruta,Persona persona) throws Exception{
        ObjectOutputStream salida = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream(new File(ruta),true));
            salida.writeObject(persona);
            salida.close();
        } catch (Exception ex) {
            salida.close();
        } 
    }
    
    private boolean existeCodigo(int codigo)
    {
        var retorno=false;
        for(var persona:this.personaList){
            if(persona.getCodigo()==codigo){
                retorno=true;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Persona> listar() {
        try {
            return this.personaList=this.recuperarDeArchivo("c:/carpeta1/archivoPersona.dat");
        } catch (Exception ex) {
            throw new RuntimeException("No se puede recuperar datos del archivo"+ex.getMessage());
        }
    }
    
    public List<Persona> recuperarDeArchivo(String ruta) throws Exception{
        List<Persona> personaList = new ArrayList<Persona>();
        var fis = new FileInputStream(new File(ruta));
        ObjectInputStream entrada = null;
        try{        
            while(fis.available()>0){
                entrada = new ObjectInputStream(fis);
                Persona persona = (Persona) entrada.readObject();
                personaList.add(persona);
            }
            entrada.close();
        }catch(Exception ex){
            entrada.close();
        }
        return personaList;
    }
       
    @Override
    public Persona buscarPorCodigo(int codigo) {
        for(var persona:this.personaList){
            if(persona.getCodigo()==codigo)
                return(persona);
        }
        throw new RuntimeException("No se encontró el código de la persona");
    }

    @Override
    public Persona eliminar(int codigo) {
        var persona = this.buscarPorCodigo(codigo);
        this.personaList.remove(persona);
        return persona;
    }
    
}
