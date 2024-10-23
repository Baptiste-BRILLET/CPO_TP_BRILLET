/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_brillet;

/**
 *
 * @author baptistebrillet
 */
public class TP2_relation_1_BRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des objets Voiture avec puissance en CV
        Voiture uneClio = new Voiture("Clio", "Renault", 90);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 90);
        Voiture une2008 = new Voiture("2008", "Peugeot", 110);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 80);

        // Création des objets Personne
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Bob tente d'ajouter deux voitures
        bob.ajouter_voiture(uneClio);     // Ajoute la Clio à Bob
        bob.ajouter_voiture(uneMicra);    // Ajoute la Micra à Bob

        // Reno tente d'ajouter deux voitures
        reno.ajouter_voiture(une2008);    // Ajoute la 2008 à Reno
        reno.ajouter_voiture(uneAutreClio); // Ajoute l'autre Clio à Reno

        // Test d'ajouter une voiture déjà possédée par Bob à Reno
        reno.ajouter_voiture(uneClio);  // Doit échouer car la Clio appartient déjà à Bob

        // Affichage des voitures de Bob
        System.out.println("Voitures de Bob:");
        System.out.println(bob.listerVoitures());

        // Affichage des voitures de Reno
        System.out.println("Voitures de Reno:");
        System.out.println(reno.listerVoitures());

        // Affichage des voitures avec leur propriétaire
        System.out.println("Détails des voitures:");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);
    }
}

