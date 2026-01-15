/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    
    public static String obtenerNombreEmpresa(){
        Scanner entrada = new Scanner (System.in);
        String nombre;
        System.out.println("Ingrese el nombre de la empresa");
        nombre = entrada.nextLine();
        return nombre;
    }
    public static String obtenerDireccionEmpresa(){
        Scanner entrada = new Scanner (System.in);
        String direccion;
        System.out.println("Ingrese la dirección de la empresa");
        direccion = entrada.nextLine();
        return direccion;
    }
    // método que permita preguntar al usuario el nombre de la empresa
    
    // método que permita preguntar al usuario la dirección de la empresa
}
