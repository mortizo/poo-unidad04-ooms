/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01.servicio;

import java.util.List;
import java.util.ArrayList;
import semana01.modelo.Persona;

/**
 *
 * @author morti
 */
public class PersonaServicio implements IPersonaServicio{

    private static List<Persona> personaList = new ArrayList<>();
    
    @Override
    public Persona crear(Persona persona) {
        this.personaList.add(persona);
        return persona;
    }

    @Override
    public List<Persona> listar() {
        return this.personaList;
    }

   
    @Override
    public Persona buscarPorCodigo(int i) {
        var persona = new Persona();
        for(Persona per:this.personaList){
            if(per.getCodigo()==i){
                persona=per;
                break;
            }
        }
        return persona;}

    @Override
    public Persona eliminar(int codigo) {
        var persona = this.buscarPorCodigo(codigo);
        this.personaList.remove(persona);
        return persona;
    }
    
}
