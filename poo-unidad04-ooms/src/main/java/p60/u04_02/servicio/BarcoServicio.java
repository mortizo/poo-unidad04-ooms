/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02.servicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p60.u04_02.modelo.Barco;
import p60.u04_02.modelo.Persona;

/**
 *
 * @author morti
 */
public class BarcoServicio implements IBarcoServicio{
    
    private static List<Barco> barcoList = new ArrayList<>();

    @Override
    public Barco crear(Barco barco) {
        this.barcoList.add(barco);
        try {
            this.almacenarEnArchivo(barco, "C:/carpeta1/archivoBarco.obj");
        } catch (Exception ex) {
            throw new RuntimeException("El barco no se pudo almacenar en el "
                    + "archivo de objetos"+ex.getMessage());
        }
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
        try {
            this.barcoList=this.recuperarDeArchivo("C:/carpeta1/archivoBarco.obj");
        } catch (Exception ex) {
            Logger.getLogger(BarcoServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    @Override
    public boolean almacenarEnArchivo(Barco barco, String rutaArchivo) throws Exception {
        ObjectOutputStream salida=null;
        var retorno=false;
        try{
            salida = new ObjectOutputStream(new FileOutputStream(new File(rutaArchivo),true));
            salida.writeObject(barco);
            salida.close();
            retorno=true;
        }catch(Exception e1){
            System.out.println(e1.toString());
            salida.close();
        }
        return retorno;
    }

    @Override
    public List<Barco> recuperarDeArchivo(String rutaArchivo) throws Exception {
        
        var barcoList = new ArrayList<Barco>();
        var fis = new FileInputStream(new File(rutaArchivo));
        ObjectInputStream entrada = null;
        try{        
            while(fis.available()>0){
                entrada = new ObjectInputStream(fis);
                Barco barco = (Barco) entrada.readObject();
                barcoList.add(barco);
            }
            entrada.close();
        }catch(Exception ex){
            entrada.close();
        }
        return barcoList;
        
    }
    
}
