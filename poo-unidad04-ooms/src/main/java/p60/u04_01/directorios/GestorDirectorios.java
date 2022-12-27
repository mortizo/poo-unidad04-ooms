/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_01.directorios;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author morti
 */
public class GestorDirectorios {
    
    public static void main(String [] args){
        
        var raiz = new File("C:/");       
        for (var elemento : raiz.listFiles())
        {
            if(elemento.isFile()){
                System.out.println("Archivo: "+elemento.getAbsolutePath());
            }
            if(elemento.isDirectory()){
                System.out.println("Carpeta: "+elemento.getAbsolutePath());
            }
        }
        
        var ruta = new File("C:/carpeta1");
        if (ruta.exists()==false)
        {
            ruta.mkdir();
        }
        var archivo = new File("C:/carpeta1/hola.txt");
        try {
            archivo.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error al crear el archivo: "+ex.getMessage());
        }
    
    }
    
}
