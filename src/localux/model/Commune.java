
package localux.model;

public class Commune {
    private String Code_Postal, Num_Postal, Nom_Commune;

    public Commune(String Code_Postal, String Num_Postal, String Nom_Commune) {
        this.Code_Postal = Code_Postal;
        this.Num_Postal = Num_Postal;
        this.Nom_Commune = Nom_Commune;
    }
    public Commune() {
    }
    public String getCode_Postal() {
        return Code_Postal;
    }
    public String getNum_Postal() {
        return Num_Postal;
    }
    public String getNom_Commune() {
        return Nom_Commune;
    }
    public void setCode_Postal(String Code_Postal) {
        this.Code_Postal = Code_Postal;
    }
    public void setNum_Postal(String Num_Postal) {
        this.Num_Postal = Num_Postal;
    }
    public void setNom_Commune(String Nom_Commune) {
        this.Nom_Commune = Nom_Commune;
    }
    
}
