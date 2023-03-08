package localux.model;

import java.time.LocalDateTime;

public abstract class Location {
    
       // Attributs privés
	private  int  numLocation ;		// numéro de la location
	private  LocalDateTime dateLocation ;
	private  double montantRegle ;	// montant total réglé pour la location
	private  Vehicule  leVehicule ;

    public Location(int numLocation, LocalDateTime dateLocation, double montantRegle, Vehicule leVehicule) {
        this.numLocation = numLocation;
        this.dateLocation = dateLocation;
        this.montantRegle = montantRegle;
        this.leVehicule = leVehicule;
    }

    public int getNumLocation() {
        return numLocation;
    }

    public void setNumLocation(int numLocation) {
        this.numLocation = numLocation;
    }

    public LocalDateTime getDateLocation() {
        return dateLocation;
    }

    public void setDateLocation(LocalDateTime dateLocation) {
        this.dateLocation = dateLocation;
    }

    public double getMontantRegle() {
        return montantRegle;
    }

    public void setMontantRegle(double montantRegle) {
        this.montantRegle = montantRegle;
    }

    public Vehicule getLeVehicule() {
        return leVehicule;
    }

    public void setLeVehicule(Vehicule leVehicule) {
        this.leVehicule = leVehicule;
    }
    
}
