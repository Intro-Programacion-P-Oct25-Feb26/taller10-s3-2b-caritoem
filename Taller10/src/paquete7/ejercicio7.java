/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Carolina Mazón
 */
public class ejercicio7 {
         public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int[][] X = new int[3][3]; 
         int[][] B = new int[3][3]; 
        int[][] A = new int[3][3]; 
        System.out.println("Ingrese los valores para  X (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("X[" + i + "][" + c + "] = ");
                X[i][c] = entrada.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                int x = X[i][c];
                A[i][c] = (x + 1) * (x + 1);
                B[i][c] = (x * x) + (2 * x) + 1;
            }
        }
        boolean identidadSiCumple = true;
        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                if (A[i][c] != B[i][c]) {
                    identidadSiCumple = false;
                    break;
                }
            }
        }
        System.out.println("\nMatriz A ( (x+1)*(x+1) ):");
        mostrarMatriz(A);

        System.out.println("\nMatriz B ( x*x + 2*x + 1 ):");
        mostrarMatriz(B);

        // Mensaje final
        if (identidadSiCumple) {
            System.out.println("\nLa identidad se cumple en todas las posiciones");
        } else {
            System.out.println("\nLa identidad no se cumple en todas las posiciones.");
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int c = 0; c < matriz[i].length; c++) {
                System.out.printf("%5d", matriz[i][c]);
            }
        }
    }
}
