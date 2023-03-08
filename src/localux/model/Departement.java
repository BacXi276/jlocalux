/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author b.bailly
 */
@Entity
@Table(name = "departement")
@NamedQueries({
    @NamedQuery(name = "Departement.findAll", query = "SELECT d FROM Departement d"),
    @NamedQuery(name = "Departement.findByDepCode", query = "SELECT d FROM Departement d WHERE d.depCode = :depCode"),
    @NamedQuery(name = "Departement.findByDepNom", query = "SELECT d FROM Departement d WHERE d.depNom = :depNom"),
    @NamedQuery(name = "Departement.findByCodeRegion", query = "SELECT d FROM Departement d WHERE d.codeRegion = :codeRegion")})
public class Departement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dep_code")
    private String depCode;
    @Basic(optional = false)
    @Column(name = "dep_nom")
    private String depNom;
    @Basic(optional = false)
    @Column(name = "Code_Region")
    private String codeRegion;

    public Departement() {
    }

    public Departement(String depCode) {
        this.depCode = depCode;
    }

    public Departement(String depCode, String depNom, String codeRegion) {
        this.depCode = depCode;
        this.depNom = depNom;
        this.codeRegion = codeRegion;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepNom() {
        return depNom;
    }

    public void setDepNom(String depNom) {
        this.depNom = depNom;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depCode != null ? depCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departement)) {
            return false;
        }
        Departement other = (Departement) object;
        if ((this.depCode == null && other.depCode != null) || (this.depCode != null && !this.depCode.equals(other.depCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "localux.model.Departement[ depCode=" + depCode + " ]";
    }
    
}
