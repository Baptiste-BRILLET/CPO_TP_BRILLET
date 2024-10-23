/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_brillet;

/**
 *
 * @author baptistebrillet
 */
public class TP2_manip_BRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un tableau de 10 références de Moussaka
        Moussaka[] moussakaArray = new Moussaka[10];

        // Création de 10 objets de type Moussaka
        for (int i = 0; i < moussakaArray.length; i++) {
            moussakaArray[i] = new Moussaka(100 + i * 50); // Exemple avec des calories différentes
        }

        // Affichage du nombre de calories pour chaque objet Moussaka
        for (int i = 0; i < moussakaArray.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " a " + moussakaArray[i].nbCalories + " calories.");
        }
    }
}
