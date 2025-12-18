/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Familia" + (i + 1) + ":");
            for (int c = 0; c < edades.length; c++) {
                int edad = edades[i][c];
                String categoria;
                if (edad < 12) {
                    categoria = "ninño";
                } else if (edad < 18) {
                    categoria = "adolescente";
                } else {
                    categoria = "Adulto";
                }
                System.out.println("Integrante " + (c + 1) + " edad:" + edad +
                        "(" + categoria + ")");
            }
        }
    }

}
