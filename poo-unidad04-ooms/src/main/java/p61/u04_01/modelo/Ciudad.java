/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u04_01.modelo;



/**
 *
 * @author Mauricio Ortiz
 */
public class Ciudad {
    
    private int codigo;
    private String nombre;
    private String pais;
    private int poblacion;

    public Ciudad(int codigo, String nombre, String pais, int poblacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.poblacion = poblacion;
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

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", pais=" + pais + ", poblacion=" + poblacion + '}';
    }
    
    
    
}
