/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.progra1.determinarnumero;

/**
 *
 * @author kmdes
 */
import java.util.Scanner;
public class DeterminarNumero {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingresa un numero: ");
            double numero = entrada.nextDouble();
            
            if (numero > 0) {
                System.out.println("El numero es positivo.");
            } else if (numero < 0) {
                System.out.println("El numero es negativo.");
            } else {
                System.out.println("El numero es cero.");
            }
        }
    }
}