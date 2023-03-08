/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package localux.model;

import org.junit.Test;
import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
//import org.junit.jupiter.api.Assertions;

/**
 *
 * @author patrick
 */
public class LocationSansChauffeurTest {

    /**
     * Test of GetMontantDepasForfait method, of class LocationSansChauffeur.
     */
    @Test
    public void testGetMontantDepasForfait() {

        System.out.println("TEST : GetMontantDepasForfait");

        // création d'une instance de modèle
        Modele leModele = new Modele(1, "Renault Espace", 3);

        // création d'une instance de Vehicule
        Vehicule leVehicule = new Vehicule("LA-039-LP", LocalDateTime.of(2016, 12, 28, 0, 0), leModele);

        // création d'une instance de FormuleSansChauffeur
        FormuleSansChauffeur laFormule = new FormuleSansChauffeur(1, "Forfait 24h", 24, 300);

        // création d'une instance de LocationAvecChauffeur
        //LocationSansChauffeur(double nbKmDepart, double nbKmRetour, FormuleSansChauffeur laFormuleSansChauffeur, int numLocation, LocalDateTime dateLocation, double montantRegle, Vehicule leVehicule)
        LocationSansChauffeur laLocation = new LocationSansChauffeur(1, LocalDateTime.of(2018, 2, 15, 0, 0), 240, 25000, leVehicule, laFormule);
        /* La classe Assert contient différentes méthodes statiques permettant de savoir si le test unitaire a réussi ou non.
           Elle contient la méthode AreEqual dont voici la signature a utiliser ici : 

            public static void assertEquals(double résultatAttendu, double résultatCalculé ,double margeDErreur)

            résultatAttendu : valeur de type double contenant la valeur attendue
            résultatCalculé : valeur de type double contenant la valeur obtenue
            margeDErreur : écart acceptable en les deux nombres
        */
        
        double resultatAttendu = 1.0;
        double ecartAccepte = .01;
        //double result = laLocation.GetMontantDepasForfait();
        Assert.assertEquals(resultatAttendu, laLocation.GetMontantDepasForfait() ,0.0);

    }

}
