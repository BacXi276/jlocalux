/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.model;

import java.time.LocalDateTime;

/**
 *
 * @author patrick
 */
public class LocationAvecChauffeur extends Location {

    //Attribut privé
    private FormuleAvecChauffeur laFormuleAvecChauffeur;

    public LocationAvecChauffeur(FormuleAvecChauffeur laFormuleAvecChauffeur, int numLocation, LocalDateTime dateLocation, double montantRegle, Vehicule leVehicule) {
        super(numLocation, dateLocation, montantRegle, leVehicule);
        this.laFormuleAvecChauffeur = laFormuleAvecChauffeur;
    }

}
