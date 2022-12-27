/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02.controlador;


import java.time.LocalDate;
import java.util.List;
import p60.u04_02.modelo.Persona;
import p60.u04_02.servicio.PersonaServicio;
import p60.u04_02.servicio.ProfesionServicio;

/**
 *
 * @author morti
 */
public class PersonaControl {
    
    private final PersonaServicio personaServicio = new PersonaServicio();
    private final ProfesionServicio profesionServicio = new ProfesionServicio();
    
    public Persona crear(String [] params) {
        var fechaNacimiento = LocalDate.of(this.convertirEntero(params[3]),
                this.convertirEntero(params[4]), 
                this.convertirEntero(params[5]));  
        var profesion = this.profesionServicio.buscarPorCodigo(this.convertirEntero(params[6]));
        var persona = new Persona(this.convertirEntero(params[0]),params[1],
                params[2],fechaNacimiento,profesion);
        this.personaServicio.crear(persona);
        return persona;
    }
    
    private int convertirEntero(String numero)
    {
        try{
            return Integer.valueOf(numero);
        }catch(NumberFormatException e1){
            throw new RuntimeException("Valor ingresado no es un número entero"); 
        }catch(Exception e1){
            throw new RuntimeException("Error inesperado"); 
        }
    }
    
    private double convertirDecimal(String numero)
    {
        try{
            return Double.valueOf(numero);
        }catch(NumberFormatException e1){
            throw new RuntimeException("Valor ingresado no es un número entero"); 
        }catch(Exception e1){
            throw new RuntimeException("Error inesperado"); 
            
        }
    }
    
    public List<Persona> listar() {
        return this.personaServicio.listar();
    }

}
