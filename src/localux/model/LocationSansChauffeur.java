package localux.model;

import java.time.LocalDateTime;

public class LocationSansChauffeur extends Location {

    //Attributs privés
    private int nbKmDepart; // kilométrage au compteur lors du retrait du véhicule
    private int nbKmRetour; // kilométrage au compteur lors de la restitution 
    private Formule laFormule;

    //LocationSansChauffeur(1, LocalDateTime.of(2018,2,15,0,0), 240, 25000, leVehicule, laFormule);
    public LocationSansChauffeur(int numLocation, LocalDateTime dateLocation,int nbKmDepart, double montantRegle, Vehicule leVehicule, Formule laFormule) {
        super(numLocation, dateLocation, montantRegle, leVehicule);
        this.nbKmDepart = nbKmDepart;
        this.nbKmRetour = nbKmDepart;
        this.laFormule = laFormule;
    }

    public int getNbKmDepart() {
        return nbKmDepart;
    }

    public void setNbKmDepart(int nbKmDepart) {
        this.nbKmDepart = nbKmDepart;
    }

    public int getNbKmRetour() {
        return nbKmRetour;
    }

    public void setNbKmRetour(int nbKmRetour) {
        this.nbKmRetour = nbKmRetour;
    }

    public Formule getLaFormule() {
        return laFormule;
    }

    public void setLaFormule(Formule laFormule) {
        this.laFormule = laFormule;
    }

    public double GetMontantDepasForfait() {
        
        // *********************************************** À modifier et à compléter
        double montant = 0.0;
        return montant;
    }
}
