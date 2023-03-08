package localux.model;

public abstract class Formule {
    // Attributs privés

    private int id;
    private String libelle;

    // Constructeur de la classe Formule
    public Formule(int unId, String unLibelle) {
        this.id = unId;
        this.libelle = unLibelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}
