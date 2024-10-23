/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_brillet;

/**
 *
 * @author baptistebrillet
 */
import java.util.Scanner;
public class TP2_convertisseurObjet_BRILLET {
    public static void main(String[] args) {
        // Création de deux objets Convertisseur
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();
        
        // Affichage du menu
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n--- Menu de Conversion ---");
            System.out.println("1. Celsius vers Kelvin");
            System.out.println("2. Kelvin vers Celsius");
            System.out.println("3. Fahrenheit vers Celsius");
            System.out.println("4. Celsius vers Fahrenheit");
            System.out.println("5. Fahrenheit vers Kelvin");
            System.out.println("6. Kelvin vers Fahrenheit");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            float valeur;

            switch (choix) {
                case 1:
                    System.out.print("Entrez la valeur en Celsius : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur1.CelciusVersKelvin(valeur) + " K");
                    break;

                case 2:
                    System.out.print("Entrez la valeur en Kelvin : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur1.KelvinVersCelcius(valeur) + " °C");
                    break;

                case 3:
                    System.out.print("Entrez la valeur en Fahrenheit : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur2.FarenheitVersCelcius(valeur) + " °C");
                    break;

                case 4:
                    System.out.print("Entrez la valeur en Celsius : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur2.CelciusVersFarenheit(valeur) + " °F");
                    break;

                case 5:
                    System.out.print("Entrez la valeur en Fahrenheit : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur1.FarenheitVersKelvin(valeur) + " K");
                    break;

                case 6:
                    System.out.print("Entrez la valeur en Kelvin : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur2.KelvinVersFarenheit(valeur) + " °F");
                    break;

                case 7:
                    continuer = false;
                    System.out.println("Fermeture du programme...");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
                    break;
            }
        }

        // Affichage du nombre de conversions pour chaque objet
        System.out.println("\nNombre de conversions effectuées par le premier convertisseur : " + convertisseur1);
        System.out.println("Nombre de conversions effectuées par le second convertisseur : " + convertisseur2);
    }
}

