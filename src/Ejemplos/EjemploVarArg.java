/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author SuarezAdmin
 */
public class EjemploVarArg {
    
    public void imprimirVarArg(int... numeros){
        for(int numero : numeros)
            System.out.println("Numero: "+numero);        
    }
    
    public void dosArgumentos(String nombre, int... numeros){
        System.out.println("Los numeros de "+nombre+" son:");
        
        for(int numero : numeros)
            System.out.println("Numero: "+numero);                
    }
}
