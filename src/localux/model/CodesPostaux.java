/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author b.bailly
 */
@Entity
@Table(name = "codes_postaux")
@NamedQueries({
    @NamedQuery(name = "CodesPostaux.findAll", query = "SELECT c FROM CodesPostaux c"),
    @NamedQuery(name = "CodesPostaux.findByCodePostal", query = "SELECT c FROM CodesPostaux c WHERE c.codesPostauxPK.codePostal = :codePostal"),
    @NamedQuery(name = "CodesPostaux.findByNumPostal", query = "SELECT c FROM CodesPostaux c WHERE c.codesPostauxPK.numPostal = :numPostal"),
    @NamedQuery(name = "CodesPostaux.findByNomCommune", query = "SELECT c FROM CodesPostaux c WHERE c.nomCommune = :nomCommune")})
public class CodesPostaux implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CodesPostauxPK codesPostauxPK;
    @Column(name = "Nom_Commune")
    private String nomCommune;

    public CodesPostaux() {
    }

    public CodesPostaux(CodesPostauxPK codesPostauxPK) {
        this.codesPostauxPK = codesPostauxPK;
    }

    public CodesPostaux(String codePostal, String numPostal) {
        this.codesPostauxPK = new CodesPostauxPK(codePostal, numPostal);
    }

    public CodesPostauxPK getCodesPostauxPK() {
        return codesPostauxPK;
    }

    public void setCodesPostauxPK(CodesPostauxPK codesPostauxPK) {
        this.codesPostauxPK = codesPostauxPK;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codesPostauxPK != null ? codesPostauxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodesPostaux)) {
            return false;
        }
        CodesPostaux other = (CodesPostaux) object;
        if ((this.codesPostauxPK == null && other.codesPostauxPK != null) || (this.codesPostauxPK != null && !this.codesPostauxPK.equals(other.codesPostauxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "localux.model.CodesPostaux[ codesPostauxPK=" + codesPostauxPK + " ]";
    }
    
}
