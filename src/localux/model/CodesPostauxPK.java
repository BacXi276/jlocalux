/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author b.bailly
 */
@Embeddable
public class CodesPostauxPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Code_Postal")
    private String codePostal;
    @Basic(optional = false)
    @Column(name = "Num_Postal")
    private String numPostal;

    public CodesPostauxPK() {
    }

    public CodesPostauxPK(String codePostal, String numPostal) {
        this.codePostal = codePostal;
        this.numPostal = numPostal;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNumPostal() {
        return numPostal;
    }

    public void setNumPostal(String numPostal) {
        this.numPostal = numPostal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePostal != null ? codePostal.hashCode() : 0);
        hash += (numPostal != null ? numPostal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodesPostauxPK)) {
            return false;
        }
        CodesPostauxPK other = (CodesPostauxPK) object;
        if ((this.codePostal == null && other.codePostal != null) || (this.codePostal != null && !this.codePostal.equals(other.codePostal))) {
            return false;
        }
        if ((this.numPostal == null && other.numPostal != null) || (this.numPostal != null && !this.numPostal.equals(other.numPostal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "localux.model.CodesPostauxPK[ codePostal=" + codePostal + ", numPostal=" + numPostal + " ]";
    }
    
}
