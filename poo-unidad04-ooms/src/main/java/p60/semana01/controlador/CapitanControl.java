/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana01.controlador;

import java.util.List;
import p60.semana01.modelo.Capitan;
import p60.semana01.servicio.CapitanServicio;

/**
 *
 * @author morti
 */
public class CapitanControl {
    
    private final CapitanServicio capitanServicio = new CapitanServicio();
    
    public Capitan crear(String [] args) throws RuntimeException{
        var capitan= new Capitan(Integer.valueOf(args[0]),args[1],args[2]);
        this.capitanServicio.crear(capitan);
        return capitan;
    }
    
    public List<Capitan> listar(){
        return this.capitanServicio.listar();
    }
    
}
