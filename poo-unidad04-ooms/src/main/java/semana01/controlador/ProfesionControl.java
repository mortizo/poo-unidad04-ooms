/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01.controlador;

import java.util.List;
import semana01.modelo.Profesion;
import semana01.servicio.ProfesionServicio;

/**
 *
 * @author morti
 */
public class ProfesionControl {
    
    
    private final ProfesionServicio personaServicio = new ProfesionServicio();
    
    public Profesion crear(String [] params) {
        var profesion = new Profesion(Integer.valueOf(params[0]),params[1]);
        this.personaServicio.crear(profesion);
        return profesion;
    }
    
    public List<Profesion> listar() {
        return this.personaServicio.listar();
    }

}
