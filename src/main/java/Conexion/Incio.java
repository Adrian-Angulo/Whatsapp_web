/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import DAO.MensajesDAO;
import java.sql.Connection;
import java.util.Scanner;
import Services.SeccionServices;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class Incio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        

        do {
            System.out.println("-------WhatsApp Web-----------");
            System.out.println("1. Iniciar Seccion");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    if (SeccionServices.iniciarSeccion()) {
                        System.out.println("has iniciado seccion");
                    }
                    break;
                case 2:
                    SeccionServices.registrar();
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 3);

       

    }
}
