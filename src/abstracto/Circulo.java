/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

/**
 *
 * @author SuarezAdmin
 */
public class Circulo extends FiguraGeometrica{

    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Aquí deberia dibujar: "+this.getClass().getSimpleName());
    }
    
}
