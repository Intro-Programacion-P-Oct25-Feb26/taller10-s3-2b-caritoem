/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema06 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double numero;
        double[][] original = new double[5][6];
        double[][] m_resultante = new double[5][6];

        String reporte = "";

        System.out.println("Ingrese un número entero o real: ");
        numero = entrada.nextDouble();

        System.out.println("\nIngrese los valores de la matriz (5x6):");
        for (int i = 0; i < 5; i++) {
            for (int c = 0; c < 6; c++) {
                System.out.printf("Valor [%d][%d]: ", i, c);
                original[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int c = 0; c < 6; c++) {
                m_resultante[i][c] = original[i][c] * numero;
            }
        }

        reporte = String.format("%s\nMatriz Original:\n", reporte);
        for (int i = 0; i < 5; i++) {
            for (int c = 0; c < 6; c++) {
                reporte = String.format("%s%.2f ", reporte, 
                        original[i][c]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMatriz Resultante (multiplicada "
                + "por %.2f):\n",
                reporte, numero);

        for (int i = 0; i < 5; i++) {
            for (int c = 0; c < 6; c++) {
                reporte = String.format("%s%.2f ", reporte, 
                        m_resultante[i][c]);
            }
            reporte = String.format("%s\n", reporte);
        }

        System.out.println(reporte);
    }
}


}
