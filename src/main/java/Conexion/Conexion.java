/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ADRIAN CASTILLO
 */
public class Conexion {
    
    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/whatsapp_web", "root", "admin");
            if(conection !=null){
                System.out.println("conexion exitosa");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return conection;
    }
}
