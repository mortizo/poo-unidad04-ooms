/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p60.u04_01.servicio;

import java.util.List;
import p60.u04_01.modelo.Persona;

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

