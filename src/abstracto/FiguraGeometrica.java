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
public abstract class FiguraGeometrica {
    
    protected String tipoFigura;
    
    protected FiguraGeometrica (String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    public abstract void dibujar();
    
    public String getTipoFigura(){
        return tipoFigura;
    }
    
    public void setTipoFigura(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    public String toString(){
        return "Tipo de figura: "+ this.tipoFigura;
    }
            
    
}
