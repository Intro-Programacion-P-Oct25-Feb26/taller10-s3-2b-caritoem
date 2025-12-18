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

        int totalMenores = 0;

        for (int i = 0; i < edades.length; i++) {
            int adultosFamilia = 0;
            System.out.println("Familia " + (i + 1) + ":");
            for (int c = 0; c < edades[i].length; c++) {
                int edad = edades[i][c];
                String categoria;
                if (edad < 18) {
                    categoria = "Menor de edad";
                    totalMenores = totalMenores + 1;
                } else {
                    categoria = "Adulto";
                    adultosFamilia = adultosFamilia + 1;
                }
                System.out.println(" Integrante " + (c + 1) + ", Edad: " + edad
                        + " (" + categoria + ")");
            }
            System.out.println("Adultos en esta familia:"
                    + adultosFamilia + "\n");
        }
        System.out.println("Total de menores de edad en todas las familias: "
                + totalMenores);
    }
}
