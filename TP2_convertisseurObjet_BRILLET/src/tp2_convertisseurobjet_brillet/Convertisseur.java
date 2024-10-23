package tp2_convertisseurobjet_brillet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author baptistebrillet
 */
public class Convertisseur {
    // Attribut pour compter le nombre de conversions
    private int nbConversions;

    // Constructeur qui initialise nbConversions à 0
    public Convertisseur() {
        nbConversions = 0;
    }

    // Méthode de conversion de Celsius vers Kelvin
    public float CelciusVersKelvin(float celsius) {
        nbConversions++; // Incrémenter le compteur de conversions
        return celsius + 273.15f;
    }

    // Méthode de conversion de Kelvin vers Celsius
    public float KelvinVersCelcius(float kelvin) {
        nbConversions++; // Incrémenter le compteur de conversions
        return kelvin - 273.15f;
    }

    // Méthode de conversion de Fahrenheit vers Celsius
    public float FarenheitVersCelcius(float fahrenheit) {
        nbConversions++; // Incrémenter le compteur de conversions
        return (fahrenheit - 32) * 5 / 9;
    }

    // Méthode de conversion de Celsius vers Fahrenheit
    public float CelciusVersFarenheit(float celsius) {
        nbConversions++; // Incrémenter le compteur de conversions
        return (celsius * 9 / 5) + 32;
    }

    // Méthode de conversion de Fahrenheit vers Kelvin
    public float FarenheitVersKelvin(float fahrenheit) {
        nbConversions++; // Incrémenter le compteur de conversions
        // Convertir Fahrenheit en Celsius puis en Kelvin
        return CelciusVersKelvin(FarenheitVersCelcius(fahrenheit));
    }

    // Méthode de conversion de Kelvin vers Fahrenheit
    public float KelvinVersFarenheit(float kelvin) {
        nbConversions++; // Incrémenter le compteur de conversions
        // Convertir Kelvin en Celsius puis en Fahrenheit
        return CelciusVersFarenheit(KelvinVersCelcius(kelvin));
    }

    // Méthode toString qui retourne le nombre de conversions effectuées
    @Override
    public String toString() {
        return "Nombre de conversions : " + nbConversions;
    }
}
