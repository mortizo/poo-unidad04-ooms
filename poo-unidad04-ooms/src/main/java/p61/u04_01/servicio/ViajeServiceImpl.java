/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u04_01.servicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p61.u04_01.modelo.Viaje;

/**
 *
 * @author Mauricio Ortiz
 */
public class ViajeServiceImpl implements ViajeService {

    private static List<Viaje> viajeList = new ArrayList<>();

    @Override
    public void crear(Viaje viaje) {

        this.viajeList.add(viaje);
        this.almacenarArchivo(viaje, "C:/Netbeans1/viaje.dat");
    }

    @Override
    public List<Viaje> listar() {
        return this.viajeList;
    }

    @Override
    public void almacenarArchivo(Viaje viaje, String ruta) {

        ObjectOutputStream salida = null;

        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta, true));
            salida.writeObject(viaje);
            salida.close();

        } catch (Exception ex) {
            Logger.getLogger(ViajeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Viaje> recuperarArchivo(String ruta) {

        var viajeList = new ArrayList<Viaje>();
        ObjectInputStream entrada = null;

        try {
            var fis = new FileInputStream(new File(ruta));
            while (fis.available() > 0) {
                entrada = new ObjectInputStream(fis);
                Viaje viaje = (Viaje) entrada.readObject();
                viajeList.add(viaje);
            }
            entrada.close();
        } catch (Exception ex) {
            try {
                entrada.close();
            } catch (IOException ex1) {
                Logger.getLogger(ViajeServiceImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return viajeList;
    }

    public List<Viaje> getViajeList() {
        return viajeList;
    }

    public void setViajeList(List<Viaje> viajeList) {
        ViajeServiceImpl.viajeList = viajeList;
    }

}
