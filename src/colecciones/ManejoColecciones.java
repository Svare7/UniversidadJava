/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.*;

/**
 *
 * @author SuarezAdmin
 */
public class ManejoColecciones {
    List miLista;
    Set miSet;
    Map miMapa;

    public ManejoColecciones() {
        this.miLista = new ArrayList();
        this.miSet = new HashSet();
        this.miMapa = new HashMap();
        
        miLista.add("1");
        miLista.add("7");
        miLista.add("4");
        miLista.add("2");
        miLista.add("4"); 
        
        miSet.add("10");
        miSet.add("20");
        miSet.add("30");
        miSet.add("10");
        
        miMapa.put("1", "Juan");
        miMapa.put("2", "Miguel");
        miMapa.put("3", "Maria");
        
    }
    
    public void run(){
        imprimir(miLista);
        imprimir(miSet);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
                
    }
    
    private void imprimir(Collection colleccion){
        
        for(Object elemento : colleccion){
            System.out.print(elemento+" ");
        }
        System.out.println("");
        
    }
    
    
}
