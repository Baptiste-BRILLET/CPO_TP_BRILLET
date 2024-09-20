/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author baptistebrillet
 */
public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        // Affichage du menu et demande de l'opérateur
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        int operateur = scanner.nextInt();  // Récupération de l'opérateur choisi

        // Vérification que l'opérateur est valide (entre 1 et 5 inclus)
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: Invalid operator selected. Please choose between 1 and 5.");
            scanner.close();
            return;  // On arrête le programme si l'opérateur est invalide
        }
        
        // Demande des deux opérandes
        System.out.print("Please enter the first number: ");
        int operande1 = scanner.nextInt();  // Récupération de la première valeur
        
        System.out.print("Please enter the second number: ");
        int operande2 = scanner.nextInt();  // Récupération de la deuxième valeur
        
        // Variable pour stocker le résultat
        int resultat = 0;
        
        // Calcul du résultat en fonction de l'opérateur choisi
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                // Vérification que la division n'est pas par 0
                if (operande2 != 0) {
                    resultat = operande1 / operande2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;  // On quitte si division par 0
                }
                break;
            case 5:
                // Vérification que le modulo n'est pas avec un 0
                if (operande2 != 0) {
                    resultat = operande1 % operande2;
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    scanner.close();
                    return;  // On quitte si modulo par 0
                }
                break;
        }
        
        // Affichage du résultat
        System.out.println("The result is: " + resultat);
        
        // Fermeture du scanner
        scanner.close();
    }
}
    
