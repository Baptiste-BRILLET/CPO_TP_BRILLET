/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_brillet;

import java.util.Scanner;

/**
 *BRILLET Baptiste TDC
 * @author baptistebrillet
 */
public class TP1_manipNombresInt_BRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande de saisir le premier entier
        System.out.print("Entrez le premier entier : ");
        int entier1 = scanner.nextInt();

        // Demande de saisir le deuxième entier
        System.out.print("Entrez le deuxième entier : ");
        int entier2 = scanner.nextInt();

        // Calcul de la somme, de la différence et du produit
        int somme = entier1 + entier2;
        int difference = entier1 - entier2;
        int produit = entier1 * entier2;

        // Affichage des résultats
        System.out.println("Vous avez saisi : " + entier1 + " et " + entier2);
        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);

        // Calcul et affichage du quotient entier et du reste de la division euclidienne
        if (entier2 != 0) {
            int quotient = entier1 / entier2;
            int reste = entier1 % entier2;
            System.out.println("Le quotient de la division entière est : " + quotient);
            System.out.println("Le reste de la division euclidienne est : " + reste);
        } else {
            System.out.println("La division par zéro n'est pas possible.");
        }
    }
}
