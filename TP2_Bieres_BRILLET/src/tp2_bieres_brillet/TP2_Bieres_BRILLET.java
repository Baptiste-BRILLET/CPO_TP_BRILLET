/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_brillet;

/**
 *
 * @author baptistebrillet
 */
public class TP2_Bieres_BRILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Création Cuvée des Trolls
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0 ,"Dubuisson") ;

        uneBiere.lireEtiquette();
        // Création Leffe
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", (float) 6.6 ,"Abbaye de Leffe");
     
        deuxiemeBiere.lireEtiquette();
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Kronenbourg", (float) 5.3 ,"Brasserie Kronenbourg") ;

        troisiemeBiere.lireEtiquette();
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Heineken", (float) 5.0 ,"Schiltigheim") ;

        quatriemeBiere.lireEtiquette();
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Desperados", (float) 9.0 ,"Alken-Maes") ;

        cinquiemeBiere.lireEtiquette();
    }
    
}
