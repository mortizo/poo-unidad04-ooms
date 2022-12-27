/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_01.servicio;

import java.util.List;
import java.util.ArrayList;
import p60.u04_01.modelo.Profesion;

/**
 *
 * @author morti
 */
public class ProfesionServicio implements IProfesionServicio{

    private static List<Profesion> profesionList = new ArrayList<>();
    
    @Override
    public Profesion crear(Profesion profesion) {
        if(this.existeCodigo(profesion.getCodigo())){
            throw new RuntimeException("El código de la profesión ya existe"); 
        }
        this.profesionList.add(profesion);
        return profesion;
    }
    
    private boolean existeCodigo(int codigo)
    {
        var retorno=false;
        for(var profesion:this.profesionList){
            if(profesion.getCodigo()==codigo){
                retorno=true;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Profesion> listar() {
        return this.profesionList;
    }

   
    @Override
    public Profesion buscarPorCodigo(int codigo){
        for(var profesion:this.profesionList){
            if(profesion.getCodigo()==codigo)
                return profesion;
        }
        throw new RuntimeException("No se encontró el código de la profesión");
    }

    @Override
    public Profesion eliminar(int codigo) {
        var profesion = this.buscarPorCodigo(codigo);
        this.profesionList.remove(profesion);
        return profesion;
    }
    
}
