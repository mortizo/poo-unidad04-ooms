/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_03.modelo;

/**
 *
 * @author morti
 */
public class Matematica {
    
    private double valor1;
    private double valor2;
    private double valor3;

    public Matematica(double valor1, double valor2, double valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }
    
    
    public double calcularSuma(){
        return valor1+valor2+valor3;
    }
    
    public double calcularResta(){
        return valor1-valor2-valor3;
    }
    
    public double calcularMultiplicacion(){
        return valor1*valor2*valor3;
    }
    
    public double calcularDivision(){
        return valor1/valor2/valor3;
    }
    
    
    
}
