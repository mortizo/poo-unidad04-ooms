/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61u04_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author morti
 */
public class Principal {

    public static void main(String[] args) {
        /*
        var finaliza = false;
        while (finaliza == false) {
            try {
                int vector[] = new int[20];
                System.out.println("Ingrese un número");
                var numero = new Scanner(System.in).nextInt();
                vector[numero]=numero;
                System.out.println("numero = " + 100 / numero);
                finaliza = true;
            } catch (InputMismatchException e1) {
                System.out.println("Error en el ingreso" + e1.toString());
            } catch (ArithmeticException e1) {
                System.out.println("Error en el valor ya que es una división para Cero " + e1.toString());
            }catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("El índice no es el adecuado" + e1.toString());
            }
        }
         */
        var raiz = new File("C:/Netbeans1/");
        var lista = raiz.listFiles();

        for (var nivel1 : raiz.listFiles()) {
            if (nivel1.isDirectory()) {
                for (var nivel2 : nivel1.listFiles()) {

                    if (nivel2.isFile()) {
                        System.out.println(nivel2.toString());
                    }
                }
            } else {
                System.out.println(nivel1.toString());
            }
        }

        var archivo = new File("C:/Netbeans1/dos.txt");
        var mensaje = "Hola Mundo";

        try {
            var escritura = new BufferedWriter(new FileWriter(archivo, true));

            for (var i = 30; i < 50; i++) {
                escritura.append(mensaje + i);
                escritura.newLine();
            }
            escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            var archivoLectura = new FileReader(archivo);
            var lectura = new BufferedReader(archivoLectura);
            var linea = "";
            while (linea!=null) {
                linea = lectura.readLine();
                System.out.println("linea = " + linea);
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

}
