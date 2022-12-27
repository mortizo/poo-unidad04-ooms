/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_01.servicio;

import java.util.ArrayList;
import java.util.List;
import p60.u04_01.modelo.Barco;

/**
 *
 * @author morti
 */
public class BarcoServicio implements IBarcoServicio{
    
    private static List<Barco> barcoList = new ArrayList<>();

    @Override
    public Barco crear(Barco barco) {
        this.barcoList.add(barco);
        return barco;
    }

    @Override
    public Barco modificar(int codigoBarco, Barco barcoNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoBarco));
        this.listar().get(posicion).setColor(barcoNuevo.getColor());
        this.listar().get(posicion).setNombre(barcoNuevo.getNombre());
        this.listar().get(posicion).setPlaca(barcoNuevo.getPlaca());
        this.listar().get(posicion).setCapitan(barcoNuevo.getCapitan());
        return barcoNuevo;
    }

    @Override
    public Barco eliminar(int codigoBarco) {
        Barco barco=this.buscarPorCodigo(codigoBarco);
        var posicion=this.buscarPosicion(barco);
        this.listar().remove(posicion);
        return barco;
    }

    @Override
    public Barco buscarPorCodigo(int codigoBarco) {
        Barco barco=null;
        for(var b:this.barcoList){
            if(codigoBarco==b.getCodigo()){
                barco=b;
                break;
            }
        }
        return barco;
    }

    @Override
    public List<Barco> listar() {
        return this.barcoList;
    }

    @Override
    public int buscarPosicion(Barco barco) {
        int posicion=-1;
        for(var b:this.barcoList){
            posicion++;
            if(b.getCodigo()==barco.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}
