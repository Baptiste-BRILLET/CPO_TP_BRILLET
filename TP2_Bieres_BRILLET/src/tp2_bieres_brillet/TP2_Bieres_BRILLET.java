/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_brillet;

/**
 *Baptiste BRILLET TDC
 * @author baptistebrillet
 */
public class TP2_Bieres_BRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Création Cuvée des Trolls
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0f, "Dubuisson");
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Kronenbourg", 5.3f, "Brasserie Kronenbourg");  
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Heineken", 5.0f, "Schiltigheim");
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Desperados", 9.0f, "Alken-Maes");
        
         // Décapsuler la première et la deuxième bières
        uneBiere.Decapsuler();
        deuxiemeBiere.Decapsuler();

        // Utiliser System.out.println() pour afficher les bières avec la méthode toString()
        System.out.println(uneBiere);       // Bière Cuvée des Trolls devrait être affichée comme ouverte
        System.out.println(deuxiemeBiere);  // Bière Leffe devrait être affichée comme ouverte
        System.out.println(troisiemeBiere); // Bière Kronenbourg devrait être affichée comme fermée
        System.out.println(quatriemeBiere); // Bière Heineken devrait être affichée comme fermée
        System.out.println(cinquiemeBiere); // Bière Desperados devrait être affichée comme fermée
    }
}
