/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02.servicio;

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
import semana02.modelo.Persona;
import semana02.modelo.Profesion;

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
            this.almacenarEnArchivo("C:/carpeta1/archivoPersona.dat",persona);
            return persona;
        }
    }
  
    
    public static void almacenarEnArchivo(String ruta,Persona persona){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(ruta),true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persona);
            oos.close();
        } catch (Exception ex) {
            Logger.getLogger(PersonaServicio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(PersonaServicio.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        return this.personaList=this.recuperarDeArchivo("c:/carpeta1/archivoPersona.dat");
    }
    
    public static List<Persona> recuperarDeArchivo(String ruta) //throws Exception{
    {
        List<Persona> list = new ArrayList<Persona>();
        try{
            FileInputStream fis = new FileInputStream(new File(ruta));
            ObjectInputStream ois = null;
            while(fis.available()>0){
                ois = new ObjectInputStream(fis);
                Persona persona = (Persona) ois.readObject();
                list.add(persona);
            }
            ois.close();
        }catch(Exception e1){e1.getStackTrace().toString();}
        return list;
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
