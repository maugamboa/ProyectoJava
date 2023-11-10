/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medallas;

import java.util.Scanner;
import java.util.ArrayList;

public class Medallas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de países del torneo: ");
        int numPaises = sc.nextInt();
        sc.nextLine(); 

        String[] nombresPaises = new String[numPaises];
        int[] numeroOro = new int[numPaises];
        int[] numeroPlata = new int[numPaises];
        int[] numeroBronce = new int[numPaises];
        int[] sumaPais = new int[numPaises];

        for (int i = 0; i < numPaises; i++) {
            System.out.print("\nNombre del país " + (i + 1) + ": ");
            nombresPaises[i] = sc.nextLine();

            System.out.print("Número de medallas de oro: ");
            numeroOro[i] = sc.nextInt();

            System.out.print("Número de medallas de plata: ");
            numeroPlata[i] = sc.nextInt();

            System.out.print("Número de medallas de bronce: ");
            numeroBronce[i] = sc.nextInt();

            sc.nextLine(); 

           
            sumaPais[i] = (numeroOro[i] * 3) + (numeroPlata[i] * 2) + numeroBronce[i];
            System.out.println("El puntaje total de " + nombresPaises[i] + " es: " + sumaPais[i]);
        }

       
        int maxPuntaje = sumaPais[0];
        ArrayList<Integer> indicesMaxPuntaje = new ArrayList<>();
        indicesMaxPuntaje.add(0);

        // Logica para determinar empates
        for (int i = 1; i < sumaPais.length; i++) {
            if (sumaPais[i] > maxPuntaje) {
                maxPuntaje = sumaPais[i];
                indicesMaxPuntaje.clear();
                indicesMaxPuntaje.add(i);
            } else if (sumaPais[i] == maxPuntaje) {
                indicesMaxPuntaje.add(i);
            }
        }

        
        if (indicesMaxPuntaje.size() == 1) {
            System.out.println("\nEl país con mayor puntaje total es: " + nombresPaises[indicesMaxPuntaje.get(0)]);
        } else {
            System.out.println("\nHay un empate para el mayor puntaje entre los siguientes países:");
            for (int indice : indicesMaxPuntaje) {
                System.out.println(nombresPaises[indice] + " con un puntaje de " + maxPuntaje);
            }
        }

        sc.close();
    }
}
