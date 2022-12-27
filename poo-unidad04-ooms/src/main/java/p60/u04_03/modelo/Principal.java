/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_03.modelo;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String [] args){
    
        var mate = new Matematica(10,20,30);
        System.out.println(mate.calcularSuma()==60);
        System.out.println(mate.calcularResta()==-40);
        System.out.println(mate.calcularMultiplicacion()==6000);
        
        
    }
    
}
