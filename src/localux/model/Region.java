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
@Table(name = "region")
@NamedQueries({
    @NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r"),
    @NamedQuery(name = "Region.findByCodeRegion", query = "SELECT r FROM Region r WHERE r.codeRegion = :codeRegion"),
    @NamedQuery(name = "Region.findByNomRegion", query = "SELECT r FROM Region r WHERE r.nomRegion = :nomRegion")})
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Code_Region")
    private String codeRegion;
    @Basic(optional = false)
    @Column(name = "Nom_Region")
    private String nomRegion;

    public Region() {
    }

    public Region(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public Region(String codeRegion, String nomRegion) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeRegion != null ? codeRegion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Region)) {
            return false;
        }
        Region other = (Region) object;
        if ((this.codeRegion == null && other.codeRegion != null) || (this.codeRegion != null && !this.codeRegion.equals(other.codeRegion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "localux.model.Region[ codeRegion=" + codeRegion + " ]";
    }
    
}
