/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02.servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
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
            this.almacenarEnArchivo(this.personaList, "C:/carpeta1/archivoPersona.dat");
            return persona;
        }
    }
    private void almacenarEnArchivo(List<Persona> personaList, String ruta){
        try{
            var fichero = new File(ruta);
            fichero.delete();
            var salida = new ObjectOutputStream(new FileOutputStream(ruta,true));
            salida.writeObject(personaList);
            salida.close();
        }
        catch(Exception e1){
            System.out.println("Error al guardar"+e1.toString());
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
        this.personaList=this.recuperarDeArchivo("c:/carpeta1/archivoPersona.dat");   
        return this.personaList;
    }
    
    private List<Persona> recuperarDeArchivo(String ruta){
        List<Persona> personaList = new ArrayList<>();
        try{
            var entrada = new ObjectInputStream(new FileInputStream(ruta));
            personaList=(ArrayList<Persona>)entrada.readObject();
        }
        catch(Exception e1){
            System.out.println("Error General al recuperar"+e1.toString());
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
