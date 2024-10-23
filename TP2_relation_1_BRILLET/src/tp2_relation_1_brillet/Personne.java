/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_brillet;

/**
 *
 * @author baptistebrillet
 */
public class Personne {
    private String prenom;
    private String nom;
    private int nbVoitures;  // Compteur pour le nombre de voitures possédées
    private Voiture[] liste_voitures;  // Tableau de 3 voitures maximum

    // Constructeur
    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.nbVoitures = 0;  // Initialisation du nombre de voitures possédées à 0
        this.liste_voitures = new Voiture[3];  // Réservation de la mémoire pour un tableau de 3 voitures
    }

    // Méthode pour ajouter une voiture à une personne
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérification si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.getProprietaire() != null) {
            System.out.println("Impossible d'ajouter la voiture : elle appartient déjà à " + voiture_a_ajouter.getProprietaire());
            return false;
        }

        // Vérification si la personne possède déjà 3 voitures
        if (nbVoitures >= 3) {
            System.out.println("Impossible d'ajouter la voiture : déjà 3 voitures.");
            return false;
        }

        // Ajout de la voiture
        liste_voitures[nbVoitures] = voiture_a_ajouter;  // Ajoute la voiture dans la prochaine case disponible
        nbVoitures++;  // Incrémente le compteur de voitures
        voiture_a_ajouter.setProprietaire(this);  // Définit le propriétaire de la voiture à l'objet Personne actuel (this)

        return true;
    }

    // Méthode pour afficher les voitures de la personne
    public String listerVoitures() {
        StringBuilder liste = new StringBuilder();
        for (int i = 0; i < nbVoitures; i++) {
            liste.append(liste_voitures[i].toString()).append("\n");
        }
        return liste.toString();
    }

    // Méthode toString() pour afficher la personne
    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }
}