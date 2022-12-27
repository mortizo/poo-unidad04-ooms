/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_01.modelo;


import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author morti
 */
public class Persona {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Profesion profesion;

    public Persona(int codigo, String nombre, String apellido, 
            LocalDate fechaNacimiento, Profesion profesion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
    }

    public Persona(int codigo, String nombre, String apellido, 
            LocalDate fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", apellido=" + apellido + ", fechaNacimiento=" + 
                fechaNacimiento.toString() + '}';
    }

}
