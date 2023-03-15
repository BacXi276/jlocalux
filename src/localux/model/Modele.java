package localux.model;

public class Modele {
    // Attributs privés
private  int id;
private  String libelle;
private  double tarifKmSupplementaire;  // représente le tarif du km supplémentaire

   // Constructeur de la classe Modèle
public Modele(int unId, String unLibelle, double unTarifKmSupp) 
{
	this.id =  unId ;
	this.libelle = unLibelle;
	this.tarifKmSupplementaire = unTarifKmSupp ; 
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

    public double getTarifKmSupplementaire() {
        return tarifKmSupplementaire;
    }

    public void setTarifKmSupplementaire(double tarifKmSupplementaire) {
        this.tarifKmSupplementaire = tarifKmSupplementaire;
    }

}
