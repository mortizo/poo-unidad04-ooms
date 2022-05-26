/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01.servicio;

import java.util.List;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import semana01.modelo.Persona;

/**
 *
 * @author morti
 */
public class PersonaServicio implements IPersonaServicio{

    private static List<Persona> personaList = new ArrayList<>();
    
    @Override
    public Persona crear(Persona persona) { 
        if(this.buscarCodigo(persona.getCodigo())==false){
            this.personaList.add(persona);
            return persona;
        }else
            throw new RuntimeException("El código de la persona ya existe");
        
    }
    
    private boolean buscarCodigo(int codigo)
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
        return this.personaList;
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
