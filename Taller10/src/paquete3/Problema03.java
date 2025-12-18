/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
         boolean[][] sensores = {
            {true, true, true, true, true, true},       
            {true, false, true, false, true, false},    
            {false, false, false, false, false, false}, 
            {true, true, false, true, true, false}      
        };

        int zonasNoFallos= 0;
        System.out.println("Análisis de Sensores\n");
        for (int i = 0; i < sensores.length; i++) {
            boolean tieneFallo = false;
            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j] == false) {
                    tieneFallo = true;
                }
            }
            if (tieneFallo == false) { zonasNoFallos = zonasNoFallos + 1; } 
            else { System.out.println("Zona " + (i + 1) +
                    " si presenta al menos un fallo.");
            } 
        } 
         System.out.printf("Zonas que funcionan sin fallos: %s\n ", 
                 zonasNoFallos); 
}
    }

