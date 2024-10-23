/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_brillet;

/**
 *
 * @author baptistebrillet
 */

    // Constructeur
public class Voiture {
    private String modele;
    private String marque;
    private int puissanceCV;  // Puissance en (CV)
    private Personne proprietaire;  // Référence vers le propriétaire

    // Constructeur
    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null;  // Initialisation du propriétaire à null
    }

    //obtenir le propriétaire
    public Personne getProprietaire() {
        return proprietaire;
    }

    //Définir le propriétaire
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    // Méthode toString() pour afficher la voiture
    @Override
    public String toString() {
        String proprietaireStr = (proprietaire != null) ? proprietaire.toString() : "Pas de propriétaire";
        return "Voiture: " + marque + " " + modele + " avec une puissance de " + puissanceCV + " CV, Propriétaire: " + proprietaireStr;
    }
}
