/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author Usuario iTC
 */
public class Informe {

    public static void imprimir(String nombre, String apellido,
            String ciudad, double promedio, String empresa, String direccion, double[] notasEs) {
        String notas= "";
        for (int i = 0;i<notasEs.length; i++){
            notas = notas + "\t" + notasEs[i];
        }
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Empresa: %s\n"
                + "Dirección de la Empresa: %s\n"
                + "Notas: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellido,
                ciudad,
                empresa,
                direccion,
                notas,
                promedio);
    }
}
