/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Carolina Mazón
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] dato_uno = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato_dos = {{10, 1, 2}, {10, 9, 1}};

        double[][] resultado = new double[2][3];
        resultado[0][0] = dato_uno[0][0]; 
        resultado[0][1] = dato_dos[0][1]; 
        resultado[0][2] = dato_dos[0][2]; 

        resultado[1][0] = dato_uno[1][0]; 
        resultado[1][1] = dato_uno[1][1]; 
        resultado[1][2] = dato_dos[1][2]; 

        System.out.println("Matriz resultado:");
        for (int i = 0; i < resultado.length; i++) {
            for (int c = 0; c < resultado[i].length; c++) {
                System.out.print((int)resultado[i][c] + "\t");
            }
            System.out.println();
        }
    }
}

    
}
