/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01.directorios;

import java.io.File;

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
    
    }
    
}
