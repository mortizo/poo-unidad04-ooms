/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u04_01.servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p61.u04_01.modelo.Ciudad;

/**
 *
 * @author Mauricio Ortiz
 */
public class CiudadServiceImpl implements CiudadService {

    private static List<Ciudad> ciudadList = new ArrayList<>();

    @Override
    public void crear(Ciudad ciudad) {
        this.ciudadList.add(ciudad);
        this.almacenarArchivo(ciudad, "C:/Netbeans1/ciudad.dat");
    }

    @Override
    public Ciudad buscarPorCodigo(int codigo) {
        Ciudad retorno = null;
        for (var ciudad : this.ciudadList) {
            if (codigo == ciudad.getCodigo()) {
                retorno = ciudad;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Ciudad> listar() {

        return this.ciudadList;
    }

    @Override
    public Ciudad buscarPorNombre(String nombre) {
        Ciudad retorno = null;

        for (var ciudad : this.ciudadList) {
            if (nombre.equals(ciudad.getNombre())) {
                retorno = ciudad;
                break;
            }
        }

        return retorno;
    }

    @Override
    public void almacenarArchivo(Ciudad ciudad, String ruta) {
        DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, true));
            salida.writeInt(ciudad.getCodigo());
            salida.writeUTF(ciudad.getNombre());
            salida.writeUTF(ciudad.getPais());
            salida.writeInt(ciudad.getPoblacion());

        } catch (IOException ex) {
            Logger.getLogger(CiudadServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Ciudad> recuperarArchivo(String ruta) {
        var ciudadList = new ArrayList<Ciudad>();
        DataInputStream entrada = null;
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                var codigo = entrada.readInt();
                var nombre = entrada.readUTF();
                var pais = entrada.readUTF();
                var poblacion = entrada.readInt();
                var ciudad = new Ciudad(codigo, nombre, pais, poblacion);
                ciudadList.add(ciudad);
            }
        } catch (IOException e) {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(CiudadServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ciudadList;
    }

    public    List<Ciudad> getCiudadList() {
        return ciudadList;
    }

    public   void setCiudadList(List<Ciudad> ciudadList) {
        CiudadServiceImpl.ciudadList = ciudadList;
    }

}
