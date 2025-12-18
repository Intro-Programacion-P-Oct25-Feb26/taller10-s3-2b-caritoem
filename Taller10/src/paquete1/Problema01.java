/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
                boolean[][] asistencia = {
                    {true, true, false, true, true},
                    {true, false, false, true, false},
                    {true, true, true, true, true},
                    {false, true, true, false, true}};
                String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
                String dias [] ={"Lunes", "Martes","Miercoles","Jueves","Viernes"};
                 for (int i = 0; i < estudiantes.length; i++) {
            int contador = 0;
            System.out.println("Estudiante:" + estudiantes[i]);

            for (int c = 0; c < dias.length; c++) {
                String estado = "";

                if (asistencia[i][c] == true) {
                    estado = "Presente";
                    contador = contador + 1;
                } else {
                    estado = "No presente";
                }
                System.out.println(""+ dias[c]+ ":" + estado);
            }
            System.out.println("Asistencias totales:"+ contador + "dias\n");
                 }
    }
}
