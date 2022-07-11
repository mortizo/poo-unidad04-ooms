/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String [] args){
        try
        {
            FileWriter archivoEscritura = new FileWriter("c:/carpeta1/archivoTexto.txt", true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            escritura.append("Hola mundo"+'\n');
            escritura.close();
        }
        catch(Exception e1)
        {
            System.out.println("Error General");
        }
        
        try
        {
            String ruta="c:/carpeta1/archivoTexto.txt";
            FileReader archivoLectura = new FileReader(ruta);
            BufferedReader lectura = new BufferedReader(archivoLectura);
            String linea="";
            while(linea!=null)
            {
                linea=lectura.readLine();
                System.out.println(linea);
            }
            lectura.close();
        }
        catch(Exception e1)
        {
            System.out.println("Error General");
        }      
    }
    
}
