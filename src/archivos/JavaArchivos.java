/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

/**
 *
 * @author SuarezAdmin
 */
public class JavaArchivos {
    
    public void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente\n");
        }catch(IOException ex){
            System.err.println("Erro "+ex);
            ex.printStackTrace();
        };            
    }
    
    public void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Archivo escrito correctamente");
        }catch(IOException ex){
            System.err.println("Erro "+ex);
            ex.printStackTrace();
        };            
    }
    
    public void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null){
                System.out.println("Lectura: "+lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        }catch(IOException ex){
            ex.printStackTrace();
        };
    }
    
    public void anexarArchivo (String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "Anexado informacion al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexado correctamente\n");                                
        }catch(IOException ex){
            
        };
    }
    
    

    
}
