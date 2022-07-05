/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana01;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String [] args){
        
        System.out.println("Inicia el programa");
        var x=0;
        try{
            x= Integer.valueOf("1");
            x=x/10;
        }
        catch(NumberFormatException e1){
            System.out.println("Por favor vuelva a ingresar ya que el formato debe ser entero");
        }
        catch(ArithmeticException e1){
            System.out.println("No se puede realizar una división para cero.");
        }
        catch(RuntimeException e1){
            System.out.println("Se generó un error en tiempo de ejecución");
        }
        catch(Exception e1){
            System.out.println("Se generó un error inesperado");
        }
        finally{
            System.out.println("Finalizó el bloque de captura de excepciones");
        }
        
        System.out.println("Finaliza el programa con el valor de x en: "+x);
        
    }
    
}
