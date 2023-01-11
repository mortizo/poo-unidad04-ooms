/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u04_01.modelo;

import java.time.LocalDate;

/**
 *
 * @author Mauricio Ortiz
 */
public class Viaje {
    
    private int codigo;
    private Ciudad origen;
    private Ciudad destino;
    private LocalDate fecha;

    public Viaje(int codigo, Ciudad origen, Ciudad destino, LocalDate fecha) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Viaje{" + "codigo=" + codigo + ", origen=" + origen.toString()
                + ", destino=" + destino.getNombre() + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
