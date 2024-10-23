/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_brillet;

/**
 *BRILLET BAPTISTE TDC
 * @author baptistebrillet
 */
public class BouteilleBiere {

    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte; 

 
public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
}

    // Méthode lireEtiquette
public void lireEtiquette() {
    System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie); 
}
public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("Bouteille de " + nom + " décapsulée.");
            return true;  // La méthode renvoie true si la bouteille est décapsulée avec succès
        } else {
            System.out.println("Erreur : bière déjà ouverte.");
            return false;  // La méthode renvoie false si la bouteille était déjà ouverte
        }
}
 @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) - Brasserie : " + brasserie + " - Ouverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}

