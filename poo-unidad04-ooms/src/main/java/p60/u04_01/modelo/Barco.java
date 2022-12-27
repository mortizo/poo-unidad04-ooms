/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_01.modelo;


/**
 *
 * @author morti
 */
public class Barco {
    
    private int codigo;
    private String nombre;
    private String color;
    private String placa;
    private Capitan capitan;

    public Barco(int codigo, String nombre, String color, String placa, 
            Capitan capitan) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.placa = placa;
        this.capitan = capitan;
    }

    public Barco(int codigo, String nombre, String color, String placa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.placa = placa;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    @Override
    public String toString() {
        return "Barco{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", color=" + color + ", placa=" + placa + ", capitan=" + 
                capitan.toString() + '}';
    }
    
    
    
    
}
