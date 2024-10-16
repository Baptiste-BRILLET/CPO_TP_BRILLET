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
}




  

