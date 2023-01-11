/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u04_01.controlador;

import java.util.List;
import p61.u04_01.modelo.Ciudad;
import p61.u04_01.servicio.CiudadServiceImpl;

/**
 *
 * @author Mauricio Ortiz
 */
public class CiudadControl {

    private CiudadServiceImpl ciudadServiceImpl = new CiudadServiceImpl();

    public void crear(String[] data) throws Exception{
        try {
            var codigo = Integer.valueOf(data[0]);
            var nombre = data[1];
            var pais = data[2];
            var poblacion = Integer.valueOf(data[3]);
            var ciudad = new Ciudad(codigo, nombre, pais, poblacion);
            if (this.codigoExiste(codigo)) {
                throw new RuntimeException("Código existe");
            } else {
                this.ciudadServiceImpl.crear(ciudad);
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }

    }

    public boolean codigoExiste(int codigoActual) {
        var retorno = false;

        return retorno;
    }

    public List<Ciudad> listar() {
        return this.ciudadServiceImpl.listar();
    }

}
