/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02.modelo;

import java.io.Serializable;


/**
 *
 * @author morti
 */
public class Capitan implements Serializable{
    
    private int codigo;
    private String nombre;
    private String pais;

    public Capitan(int codigo, String nombre, String pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Capitan{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", pais=" + pais + '}';
    }

}
