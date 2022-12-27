/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p60.u04_01.servicio;

import java.util.List;
import p60.u04_01.modelo.Capitan;

/**
 *
 * @author morti
 */
public interface ICapitanServicio {
    
    public Capitan crear(Capitan capitan);
    public Capitan buscarPorCodigo(int codigoCapitan);
    public List<Capitan> listar();   
    
}
