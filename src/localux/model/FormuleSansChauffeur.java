package localux.model;

public class FormuleSansChauffeur extends Formule {

    // Attributs privés
    private int duree; // durée de la location en heures
    private double nbKmInclus; // forfait kilométrique
    //private 

    public FormuleSansChauffeur(int unId, String unLibelle, int duree, double nbKmInclus ) {
        super(unId, unLibelle);
        this.duree = duree;
        this.nbKmInclus = nbKmInclus;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public double getNbKmInclus() {
        return nbKmInclus;
    }

    public void setNbKmInclus(double nbKmInclus) {
        this.nbKmInclus = nbKmInclus;
    }

    public double GetTarif(Modele unModele) {
        double leTarif = 0.0;
        // retourne le tarif de la formule sans chauffeur
        // pour le modèle de véhicule passé en paramètre}
        return leTarif;
    }
}
