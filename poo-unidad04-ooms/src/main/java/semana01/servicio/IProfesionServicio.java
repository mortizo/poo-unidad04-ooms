/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package semana01.servicio;

import java.util.List;
import semana01.modelo.Profesion;

/**
 *
 * @author morti
 */
public interface IProfesionServicio {
    
    public Profesion crear(Profesion profesion);
    public List<Profesion> listar();
    public Profesion buscarPorCodigo(int codigo);
    public Profesion eliminar(int codigo);
    
    
}
