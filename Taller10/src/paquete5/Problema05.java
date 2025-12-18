/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String acumulador = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int c = 0; c < estudiantes[i].length; c++) {

                String nombre = estudiantes[i][c];
                char letra = Character.toLowerCase(nombre.charAt(0));

                switch (letra) {
                    case 's':
                    case 'p':
                    case 't':
                        acumulador = acumulador + nombre + "\n";
                        break;
                }
            }

        }
        System.out.printf("Estudiantes con  la inicial S, P o T: \n%s\n", acumulador);
    }
}
}
}

