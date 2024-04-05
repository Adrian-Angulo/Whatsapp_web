/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class Mensaje {
    
    private int Id_Mensaje;
    private String fecha_envio;
    private String descripcion;
    private int Id_Contacto;

    public Mensaje() {
    }

    public Mensaje(int Id_Mensaje, String fecha_envio, String descripcion, int Id_Contacto) {
        this.Id_Mensaje = Id_Mensaje;
        this.fecha_envio = fecha_envio;
        this.descripcion = descripcion;
        this.Id_Contacto = Id_Contacto;
    }

    public int getId_Mensaje() {
        return Id_Mensaje;
    }

    public void setId_Mensaje(int Id_Mensaje) {
        this.Id_Mensaje = Id_Mensaje;
    }

    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_Contacto() {
        return Id_Contacto;
    }

    public void setId_Contacto(int Id_Contacto) {
        this.Id_Contacto = Id_Contacto;
    }
    
    
}
