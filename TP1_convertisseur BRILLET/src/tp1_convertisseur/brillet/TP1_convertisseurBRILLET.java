/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur.brillet;

import java.util.Scanner;
import static tp1_convertisseur.brillet.TP1_convertisseurBRILLET.CelciusVersKelvin;

/**
 *
 * @author baptistebrillet
 */
public class TP1_convertisseurBRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demande à l'utilisateur de saisir une valeur
        System.out.print("Bonjour, saisissez une valeur : ");
        double valeur = scanner.nextDouble();

        // Affichage du menu de conversion
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        int choix = scanner.nextInt();
    
        // Traitement selon le choix de l'utilisateur
    switch (choix) {
            case 1 -> {
                double kelvin = CelciusVersKelvin(valeur);
                System.out.println(valeur + " degrés Celsius est égal à " + kelvin + " degrés Kelvin.");
            }
            case 2 -> {
                double celsius = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degrés Kelvin est égal à " + celsius + " degrés Celsius.");
            }
            case 3 -> {
                double FarenheitVersCelcius = FarenheitVersCelcius(valeur);
                System.out.println(valeur + " degrés Celsius est égal à " + FarenheitVersCelcius + " degrés Fahrenheit.");
            }
            case 4 -> {
                double CelciusVersFarenheit = CelciusVersFarenheit(valeur);
                System.out.println(valeur + " degrés Fahrenheit est égal à " + CelciusVersFarenheit + " degrés Celsius.");
            }
            case 5 -> {
                double FarenheitVersKelvin = FarenheitVersKelvin(valeur);
                System.out.println(valeur + " degrés Kelvin est égal à " + FarenheitVersKelvin + " degrés Fahrenheit.");
            }
            case 6 -> {
                double KelvinVersFarenheit = KelvinVersFarenheit(valeur);
                System.out.println(valeur + " degrés Fahrenheit est égal à " + KelvinVersFarenheit + " degrés Kelvin.");
            }
            default -> System.out.println("Choix non valide.");
        }
    }
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15; // Conversion en Kelvin
    }
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15; // Conversion en Celcius
    }
    public static double FarenheitVersCelcius(double tFarenheit) {
        return tFarenheit*1.8 +32 ; // Conversion en Celcius
    }
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius/1.8)-32 ; // Conversion en Farenheit
    }
    public static double KelvinVersFarenheit(double tKelvin) {
        return (tKelvin*1.8)-241.15 ; // Conversion en Farenheit
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        return tFarenheit +241.15 ; // Conversion en Kelvin
    }
}