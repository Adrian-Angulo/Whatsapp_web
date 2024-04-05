/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class Contacto {
    
    private int Id_Contacto;
    private String numero;
    private String nombre;
    private String descripcion;
    private int Id_Usuario;

    public Contacto() {
    }

    public Contacto(int Id_Contacto, String numero, String nombre, String descripcion, int Id_Usuario) {
        this.Id_Contacto = Id_Contacto;
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Id_Usuario = Id_Usuario;
    }

    public int getId_Contacto() {
        return Id_Contacto;
    }

    public void setId_Contacto(int Id_Contacto) {
        this.Id_Contacto = Id_Contacto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }
    
    
}
