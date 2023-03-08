package localux.model;

public class FormuleAvecChauffeur extends Formule {
    // Attributs privés
	private String lieu;
	private double tarif;

    public FormuleAvecChauffeur(String lieu, double tarif, int unId, String unLibelle) {
        super(unId, unLibelle);
        this.lieu = lieu;
        this.tarif = tarif;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
        
        
}
