/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;
/**
 *
 * @author SuarezAdmin
 */
public class JavaDBC {
    
    String url;
    
    public JavaDBC(){
        this.url = "jdbc:mysql://localhost:3306/newcronos?useSSL=false";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection(url, "root", "");
            Statement instruccion = conexion.createStatement();
            String sql = "Select idusuarios, nomb_us from usuarios";
            ResultSet result = instruccion.executeQuery(sql);
            while(result.next()){
                System.out.print("id:" + result.getInt(1));
                System.out.println(" Nombre:" + result.getString(2));
            }
            result.close();
            instruccion.close();
            conexion.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

/*
Statement
PreparedStatemen
CalleblaStatement

executeQuery (SELECT)
execurteUpdate (Actualizar)
execute (String)

SQLException
SQLWarning
DaraTRuncationException

*/