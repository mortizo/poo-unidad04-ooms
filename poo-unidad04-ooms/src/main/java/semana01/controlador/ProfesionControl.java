/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01.controlador;

import java.util.InputMismatchException;
import java.util.List;
import semana01.modelo.Profesion;
import semana01.servicio.ProfesionServicio;

/**
 *
 * @author morti
 */
public class ProfesionControl {
    
    
    private final ProfesionServicio personaServicio = new ProfesionServicio();
    
    public Profesion crear(String [] params) throws InputMismatchException, RuntimeException{
        var profesion = new Profesion(Integer.valueOf(params[0]),params[1]);
        this.personaServicio.crear(profesion);
        return profesion;
    }
    
    public Profesion eliminar(String param) throws Exception{
        return this.personaServicio.eliminar(Integer.valueOf(param));
    }
    
    public List<Profesion> listar() {
        return this.personaServicio.listar();
    }

}
