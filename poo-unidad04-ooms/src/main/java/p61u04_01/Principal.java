/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61u04_01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author morti
 */
public class Principal {

    public static void main(String[] args) {

        try {
            System.out.println("Ingrese un número");
            var numero = new Scanner(System.in).nextInt();
            if (numero > 10) {

            } else {

            }
            System.out.println("numero = " + 100 / numero);
        }catch(InputMismatchException e1){
            System.out.println("Error en el ingreso"+e1.toString());
        }catch(ArithmeticException e1){
            System.out.println("Error en el valor ya que es una división para Cero "+e1.toString());
        }
    }

}
