/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import Ejemplos.*;
import abstracto.*;
import JavaBean.*;
import colecciones.ManejoColecciones;
import com.sun.beans.editors.EnumEditor;
import java.util.*;
import archivos.*;
import JDBC.*;


/**
 *
 * @author SuarezAdmin
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        /*
        EjemploVarArg varargs = new EjemploVarArg();
        
        varargs.imprimirVarArg(1,2,2,3,5,4);
        varargs.dosArgumentos("Erick ", 1,2,3,45,6);
    */
        /*
        System.out.println("Valor 1: "+ EjemploEnum.LUNES.getHoras());
        System.out.println("Valor 1: "+ EjemploEnum.LUNES);
*/
        
        /*
        FiguraGeometrica circulo = new Circulo("Circulo");
        
        System.out.println(circulo);
        circulo.dibujar();
        */
        
        /*
        personaBean bean =  new personaBean();
        bean.setEdad(27);
        bean.setNombre("Miguel");
        
        System.out.println("Nombre: "+bean.getNombre()+" \nEdad: "+bean.getEdad());
        */
        /*
        ManejoColecciones colect = new ManejoColecciones();
        colect.run();
        */
        //Propiedades sistema
        /*
        Properties propiedades = System.getProperties();
        Enumeration nombre = propiedades.propertyNames();
        while (nombre.hasMoreElements()){
            String nombrePropiedad = (String) nombre.nextElement();
            String valor = propiedades.getProperty(nombrePropiedad);
            System.out.println("Llvave: "+nombrePropiedad+" = "+valor);
        }
        */
        /*
        String ruta = "E:\\Test\\prueba.txt";
        JavaArchivos archivo = new JavaArchivos();
        archivo.crearArchivo(ruta);
        archivo.escribirArchivo(ruta);
        archivo.leerArchivo(ruta);        
        archivo.anexarArchivo(ruta);
        archivo.leerArchivo(ruta);
        */
        
        //JavaDBC db = new JavaDBC();
        
    }
    
}


/*
*Javadoc
*Varargs
*enumerasciones (enum)
*foreach
*Modificadores de acceso
*Sobre escritura de metodos
*Polimorfismo
*tipo instanceof tipo
*Casteo de objetos
*Clase Objet (Equals, hashCode, toString)
*Herencia Extends
*Interface implements public interface
*/