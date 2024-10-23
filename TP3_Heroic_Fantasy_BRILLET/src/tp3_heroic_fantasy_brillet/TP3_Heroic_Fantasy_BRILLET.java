/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_brillet;

/**
 *
 * @author baptistebrillet
 */
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import java.util.ArrayList;
public class TP3_Heroic_Fantasy_BRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Création d'une liste dynamique pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Création de 2 épées avec des paramètres différents
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        // Ajout des épées à la liste
        armes.add(epee1);
        armes.add(epee2);

        // Création de 2 bâtons avec des paramètres différents
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Ajout des bâtons à la liste
        armes.add(baton1);
        armes.add(baton2);

        // Affichage des détails de toutes les armes dans la liste
        System.out.println("Liste des armes :");
        for (int i = 0; i < armes.size(); i++) {
            // Utilisation de get() pour obtenir l'arme à l'indice i
            System.out.println(armes.get(i));
        }
        ArrayList<Personnage> personnages = new ArrayList<>();

        Magicien magicien1 = new Magicien("Gandalf", 65, true);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);
        personnages.add(magicien1);
        personnages.add(magicien2);

        Guerrier guerrier1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);
        personnages.add(guerrier1);
        personnages.add(guerrier2);

        System.out.println("Liste des personnages :");
        for (Personnage personnage : personnages) {
            System.out.println(personnage);
        }
    }
}



