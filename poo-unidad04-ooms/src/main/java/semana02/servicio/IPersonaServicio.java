/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package semana02.servicio;

import java.util.List;
import semana02.modelo.Persona;

/**
 *
 * @author morti
 */
public interface IPersonaServicio {
    
    public Persona crear(Persona persona);
    public List<Persona> listar();
    public Persona buscarPorCodigo(int codigo);
    public Persona eliminar(int codigo);
    
    
}

