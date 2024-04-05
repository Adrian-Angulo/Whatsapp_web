/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Clases.Usuario;
import java.util.Scanner;
import DAO.SeccionDAO;
import java.util.List;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class SeccionServices {

    public static void registrar() {

        Scanner sc = new Scanner(System.in);
        System.out.print("cual es tu Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("cual es tu numero de telefono: ");
        String numero = sc.nextLine();
        System.out.print("cual es tu descripcion: ");
        String descripcion = sc.nextLine();
        SeccionDAO.registrarDB(new Usuario(numero, nombre, descripcion));
    }

    public static boolean iniciarSeccion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        String numero = sc.nextLine();
        List<Usuario> listaUsuario = SeccionDAO.leerUsuariosDB();

        for (Usuario usuario : listaUsuario) {
            if (usuario.getNumero().equalsIgnoreCase(numero)) {
                System.out.println("Bienvenido "+usuario.getNombre());
                return true;
            }
        }
        System.out.println("no se encontro el usuario");
        return false;
    }
}
