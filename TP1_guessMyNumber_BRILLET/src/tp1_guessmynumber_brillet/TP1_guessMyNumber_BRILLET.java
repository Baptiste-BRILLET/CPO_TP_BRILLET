/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_brillet;

import java.util.Random;
import java.util.Scanner;

/**
 *Baptiste BRILLET
 * @author baptistebrillet
 */
public class TP1_guessMyNumber_BRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Demande du niveau de difficulté
        try (Scanner scanner = new Scanner(System.in)) {
            // Demande du niveau de difficulté
            System.out.println("Choisissez un niveau de difficulté :");
            System.out.println("1. Facile (0-50, tentatives illimitées)");
            System.out.println("2. Normal (0-100, 10 tentatives)");
            System.out.println("3. Difficile (0-200, 5 tentatives)");
            System.out.print("Votre choix (1, 2, ou 3) : ");
            int choixDifficulte = scanner.nextInt();
            
            // Variables qui changent en fonction de la difficulté choisie
            int maxNombre = 100;
            int maxTentatives = Integer.MAX_VALUE; // Tentatives illimitées par défaut
            
            switch (choixDifficulte) {
                case 1 -> maxNombre = 50; // Intervalle 0-50
                case 2 -> {
                    maxNombre = 100; // Intervalle 0-100
                    maxTentatives = 10; // 10 tentatives
                }
                case 3 -> {
                    maxNombre = 200; // Intervalle 0-200
                    maxTentatives = 5; // 5 tentatives
                }
                default -> System.out.println("Choix invalide, le mode normal est sélectionné par défaut.");
            }
            Random generateurAleat = new Random();
            int nombreAleatoire = generateurAleat.nextInt(maxNombre + 1); // Génère un nombre aléatoire dans l'intervalle choisi
            int userInput = -1; // Initialisation à une valeur en dehors de l'intervalle [0, 100]
            int compteur = 0;
            
            System.out.println("Devinez le nombre aléatoire entre 0 et "+ maxNombre + "!");
            
            while (userInput != nombreAleatoire) {
                // Demande à l'utilisateur de saisir un nombre
                System.out.print("Entrez votre nombre : ");
                userInput = scanner.nextInt();
                compteur ++;
                // Comparaison du nombre saisi avec le nombre aléatoire
                if (userInput < nombreAleatoire) {
                    System.out.println("Trop petit !");
                } else if (userInput > nombreAleatoire) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Gagné !");
                    System.out.println("Vous avez trouvé en " + compteur + " tentatives."); 
                }
                if (compteur == maxTentatives && userInput != nombreAleatoire) {
                    System.out.println("Vous avez épuisé vos " + maxTentatives + " tentatives. Le nombre était " + nombreAleatoire + ".");
                }
            }
        }
        
     }
} 
