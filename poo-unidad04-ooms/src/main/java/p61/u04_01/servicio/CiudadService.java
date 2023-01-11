/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.u04_01.servicio;

import java.util.List;
import p61.u04_01.modelo.Ciudad;


/**
 *
 * @author Mauricio Ortiz
 */
public interface CiudadService {
    
    public void crear(Ciudad ciudad);
    public Ciudad buscarPorCodigo(int codigo);
    public Ciudad buscarPorNombre(String nombre);
    public List<Ciudad> listar();
    
    
}
