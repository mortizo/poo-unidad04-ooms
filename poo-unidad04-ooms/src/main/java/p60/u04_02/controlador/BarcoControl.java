/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02.controlador;

import java.util.List;
import p60.u04_02.modelo.Barco;
import p60.u04_02.modelo.Capitan;
import p60.u04_02.servicio.BarcoServicio;
import p60.u04_02.servicio.CapitanServicio;

/**
 *
 * @author morti
 */
public class BarcoControl {
    
    private final BarcoServicio barcoServicio = new BarcoServicio();
    private final CapitanServicio capitanServicio = new CapitanServicio();
    
    public Barco crear(String [] args){
        Capitan capitan = this.capitanServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Barco barco = new Barco(Integer.valueOf(args[0]),args[1],args[2],args[3],capitan);
        this.barcoServicio.crear(barco);
        return barco;
    }
    
    public Barco buscarBarco(String arg){
        return this.barcoServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Barco eliminar(String arg)
    {
        return this.barcoServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Barco modificar(String [] args){
        Capitan capitan = this.capitanServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Barco barcoNuevo = new Barco(Integer.valueOf(args[0]),args[1],args[2],args[3],capitan);
        this.barcoServicio.modificar(Integer.valueOf(args[0]), barcoNuevo);
        return barcoNuevo;
    }
    
    public List<Barco> listar(){
        return this.barcoServicio.listar();
    }
    
}
