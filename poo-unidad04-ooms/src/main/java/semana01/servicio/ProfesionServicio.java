/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01.servicio;

import java.util.List;
import java.util.ArrayList;
import semana01.modelo.Profesion;

/**
 *
 * @author morti
 */
public class ProfesionServicio implements IProfesionServicio{

    private static List<Profesion> profesionList = new ArrayList<>();
    
    @Override
    public Profesion crear(Profesion profesion) {
        this.profesionList.add(profesion);
        return profesion;
    }

    @Override
    public List<Profesion> listar() {
        return this.profesionList;
    }

   
    @Override
    public Profesion buscarPorCodigo(int codigo) {
        var profesion = new Profesion(codigo,"Ningún Resultado");
        for(Profesion pro:this.profesionList){
            if(pro.getCodigo()==codigo){
                profesion=pro;
                break;
            }
        }
        return profesion;}

    @Override
    public Profesion eliminar(int codigo) {
        var profesion = this.buscarPorCodigo(codigo);
        this.profesionList.remove(profesion);
        return profesion;
    }
    
}
