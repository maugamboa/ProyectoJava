/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medallas;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Medallas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // El numero 3 representa el tamaño de la lista, 
            String[] nombresPaises = new String[3];
            int[] numeroOro = new int[3];
            int[] numeroPlata = new int[3];
            int[] numeroBronce = new int[3];
            int[] sumaPais = new int[3];
            
            // Ciclo for para recorrer la lista y pedir los datos, se le suma uno por que los arreglos empiezan en 0
            for (int i = 0; i < 3; i++) {
                System.out.print("\nNombre del país " + (i + 1) + ": \n");
                nombresPaises[i] = sc.nextLine();
                
                System.out.print("\nNúmero de medallas de oro: \n");
                numeroOro[i] = sc.nextInt();
                
                System.out.print("\nNúmero de medallas de plata: \n");
                numeroPlata[i] = sc.nextInt();
                
                System.out.print("\nNúmero de medallas de bronce: \n");
                numeroBronce[i] = sc.nextInt();
                
                sc.nextLine(); 
            }
            
           // Calculo de los puntajes por pais
           // Valor por Oro = 3; Valor por Plata = 2; Valor por Bronce = 1;
            for (int i = 0; i < 3; i++) {
                sumaPais[i] = (numeroOro[i]*3) + (numeroPlata[i]*2) + numeroBronce[i];
            }
            
            // Calcular el país con mayor puntaje
            int indiceMaxPuntaje = 0;
            boolean empate = false;

            for (int i = 1; i < 3; i++) {
                if (sumaPais[i] > sumaPais[indiceMaxPuntaje]) {
                    indiceMaxPuntaje = i;
                    empate = false;
                }
                else if (sumaPais[i] == sumaPais[indiceMaxPuntaje]) {
                    empate = true;
                }
            }
            
            // Imprimir los puntajes totales
            for (int i = 0; i < 3; i++) {
                System.out.println("\nEl puntaje total de " + nombresPaises[i] + " es: " + sumaPais[i] + "\n");
            }
            
           // Pais con mejores puntos
            if (empate) {
                System.out.println("\nHay un empate\n");
            } else {
                System.out.println("\nEl país que obtuvo mayor puntaje es: " + nombresPaises[indiceMaxPuntaje]+ "\n");
            }
        }
    }
}
