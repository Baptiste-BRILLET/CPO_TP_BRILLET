/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_brillet;

import java.util.Random;
import java.util.Scanner;

/**
 *BRILLET Baptiste
 * @author baptistebrillet
 */
public class TP1_stats_BRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] facesDes = new int[6]; // Le tableau est initialisé à 0 par défaut pour chaque élément
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez le nombre de lancers de dés : ");
        int m = scanner.nextInt();
        Random generateurAleat = new Random();
        for (int i = 0; i < m; i++) {
            int resultat = generateurAleat.nextInt(6); 
            facesDes[resultat]++; 
        }
        System.out.println("Résultats des lancers de dés (nombre de fois) :");
        for (int i = 0; i < facesDes.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + facesDes[i] + " fois");
        }
        System.out.println("\nRésultats des lancers de dés (pourcentages) :");
        for (int i = 0; i < facesDes.length; i++) {
            double pourcentage = (double) facesDes[i] / m * 100; 
            System.out.printf("Face %d : %.2f%%\n", i + 1, pourcentage);
        }
        scanner.close();
    }
    
}
