/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02.controlador;


import java.time.LocalDate;
import java.util.List;
import semana02.modelo.Persona;
import semana02.servicio.PersonaServicio;
import semana02.servicio.ProfesionServicio;

/**
 *
 * @author morti
 */
public class PersonaControl {
    
    private final PersonaServicio personaServicio = new PersonaServicio();
    private final ProfesionServicio profesionServicio = new ProfesionServicio();
    
    public Persona crear(String [] params) {
        var fechaNacimiento = LocalDate.of(Integer.valueOf(params[3]),
                Integer.valueOf(params[4]), 
                Integer.valueOf(params[5]));  
        var profesion = this.profesionServicio.buscarPorCodigo(Integer.valueOf(params[6]));
        var persona = new Persona(Integer.valueOf(params[0]),params[1],
                params[2],fechaNacimiento,profesion);
        this.personaServicio.crear(persona);
        return persona;
    }
    
    public List<Persona> listar() {
        return this.personaServicio.listar();
    }

}
