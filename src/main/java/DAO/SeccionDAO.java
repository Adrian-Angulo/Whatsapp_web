/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Clases.Usuario;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ADRIAN CASTILLO
 */
public class SeccionDAO {

    public static List<Usuario> leerUsuariosDB() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        Conexion db_connect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection conexion = db_connect.get_Connection()) {
            String query = "SELECT * FROM usuario";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                usuario.setId_Usuario(rs.getInt("Id_Usuario"));
//                usuario.setNombre(rs.getString("nombre"));
//                usuario.setNumero(rs.getString("Ncelular"));
//                usuario.setDescripcion(rs.getString("descripcion"));
                usuarios.add(new Usuario(rs.getString("Ncelular"), rs.getString("nombre"), rs.getString("descripcion")));
                
            }
        } catch (SQLException ex) {
            
            System.out.println("no se pudo traer la informacion");
        }
        return usuarios;
    }
    
    public static void registrarDB(Usuario usuario){
        Conexion db_connect = new Conexion();
        
        try (Connection conexion = db_connect.get_Connection()){
            PreparedStatement ps=null;
            try {
                String query = "INSERT INTO usuario (nombre,Ncelular,descripcion) VALUES (?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,usuario.getNombre());
                ps.setString(2,usuario.getNumero());
                ps.setString(3,usuario.getDescripcion());
                ps.executeUpdate();
                System.out.println("Usuario Registrado");
            } catch (SQLException ex) {
                System.out.println(ex + "el usuario no se puedo resigrar");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    
}
