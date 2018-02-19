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
public enum EjemploEnum {
    
    LUNES(2), MARTES(5), MIERCOLES(4), JUEVES(5), SABADO(1), DOMINGO(0);
    
    private final int horas;

    private EjemploEnum(int horas) {
        this.horas = horas;
    }
    
    public int getHoras(){
        return horas;
    }
    
    
}
