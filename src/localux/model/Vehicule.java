package localux.model;

import java.time.LocalDateTime;

public class Vehicule {
    // Attributs privés

    private String immatriculation;
    private LocalDateTime dateAchat;
    private Modele leModele;

    // Constructeur de la classe Vehicule
    public Vehicule(String uneImmat, LocalDateTime uneDate, Modele unModele) {
        this.immatriculation = uneImmat;
        this.dateAchat = uneDate;
        this.leModele = unModele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public LocalDateTime getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDateTime dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Modele getLeModele() {
        return leModele;
    }

    public void setLeModele(Modele leModele) {
        this.leModele = leModele;
    }

}
