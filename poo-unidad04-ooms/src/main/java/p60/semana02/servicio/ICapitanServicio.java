/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p60.semana02.servicio;

import java.io.IOException;
import java.util.List;
import p60.semana02.modelo.Capitan;

/**
 *
 * @author morti
 */
public interface ICapitanServicio {
    
    public Capitan crear(Capitan capitan);
    public Capitan buscarPorCodigo(int codigoCapitan);
    public List<Capitan> listar();   
    public boolean almacenarEnArchivo(Capitan capitan, String rutaArchivo) throws IOException;
    public List<Capitan> recuperarDeArchivo(String rutaArchivo) throws IOException;
    
    
}
