/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String [] args){
        
        try
        {
            var archivoEscritura = new FileWriter("c:/carpeta1/archivoTexto.txt", true);
            var escritura = new BufferedWriter(archivoEscritura);
            escritura.append("Hola Mundo"+'\n');
            escritura.newLine();
            escritura.close(); 
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("No se encontró el archivo");
        }
        catch(IOException e1)
        {
            System.out.println("Error General");
        }
        
        try
        {
            var archivoLectura = new FileReader("c:/carpeta1/archivoTexto.txt");
            var lectura = new BufferedReader(archivoLectura);
            var linea="";
            while(linea!=null){
                linea=lectura.readLine();
                System.out.println(linea);
            }
            lectura.close();
        }
        catch(FileNotFoundException e){
            System.out.println("No existe el archivo que desea leer");
        }
        catch(Exception e1){
            System.out.println("Error General"+e1.getMessage()+e1.toString());
        }    

    }
    
}
