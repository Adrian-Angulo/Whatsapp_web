/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class Conversacion {
    
    private int Id_conversacion;
    private int Id_Usuario;
    private int Id_Mensaje;

    public Conversacion() {
    }

    public Conversacion(int Id_conversacion, int Id_Usuario, int Id_Mensaje) {
        this.Id_conversacion = Id_conversacion;
        this.Id_Usuario = Id_Usuario;
        this.Id_Mensaje = Id_Mensaje;
    }

    public int getId_conversacion() {
        return Id_conversacion;
    }

    public void setId_conversacion(int Id_conversacion) {
        this.Id_conversacion = Id_conversacion;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public int getId_Mensaje() {
        return Id_Mensaje;
    }

    public void setId_Mensaje(int Id_Mensaje) {
        this.Id_Mensaje = Id_Mensaje;
    }
    
    
}
