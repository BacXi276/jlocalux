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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author b.bailly
 */
@Entity
@Table(name = "utilisateur")
@NamedQueries({
    @NamedQuery(name = "Utilisateur_1.findAll", query = "SELECT u FROM Utilisateur_1 u"),
    @NamedQuery(name = "Utilisateur_1.findByUtPseudo", query = "SELECT u FROM Utilisateur_1 u WHERE u.utPseudo = :utPseudo"),
    @NamedQuery(name = "Utilisateur_1.findByUtNom", query = "SELECT u FROM Utilisateur_1 u WHERE u.utNom = :utNom"),
    @NamedQuery(name = "Utilisateur_1.findByUtPrenom", query = "SELECT u FROM Utilisateur_1 u WHERE u.utPrenom = :utPrenom"),
    @NamedQuery(name = "Utilisateur_1.findByUtMp", query = "SELECT u FROM Utilisateur_1 u WHERE u.utMp = :utMp"),
    @NamedQuery(name = "Utilisateur_1.findByUtMail", query = "SELECT u FROM Utilisateur_1 u WHERE u.utMail = :utMail"),
    @NamedQuery(name = "Utilisateur_1.findByUtPhrase", query = "SELECT u FROM Utilisateur_1 u WHERE u.utPhrase = :utPhrase"),
    @NamedQuery(name = "Utilisateur_1.findByUtAdr1", query = "SELECT u FROM Utilisateur_1 u WHERE u.utAdr1 = :utAdr1"),
    @NamedQuery(name = "Utilisateur_1.findByUtAdr2", query = "SELECT u FROM Utilisateur_1 u WHERE u.utAdr2 = :utAdr2"),
    @NamedQuery(name = "Utilisateur_1.findByUtCdpost", query = "SELECT u FROM Utilisateur_1 u WHERE u.utCdpost = :utCdpost"),
    @NamedQuery(name = "Utilisateur_1.findByUtNumpost", query = "SELECT u FROM Utilisateur_1 u WHERE u.utNumpost = :utNumpost")})
public class Utilisateur_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "utPseudo")
    private String utPseudo;
    @Column(name = "utNom")
    private String utNom;
    @Column(name = "utPrenom")
    private String utPrenom;
    @Basic(optional = false)
    @Column(name = "utMp")
    private String utMp;
    @Basic(optional = false)
    @Column(name = "utMail")
    private String utMail;
    @Basic(optional = false)
    @Column(name = "utPhrase")
    private String utPhrase;
    @Column(name = "utAdr1")
    private String utAdr1;
    @Column(name = "utAdr2")
    private String utAdr2;
    @Column(name = "utCdpost")
    private String utCdpost;
    @Column(name = "utNumpost")
    private String utNumpost;
    @Lob
    @Column(name = "utAvatar")
    private byte[] utAvatar;

    public Utilisateur_1() {
    }

    public Utilisateur_1(String utPseudo) {
        this.utPseudo = utPseudo;
    }

    public Utilisateur_1(String utPseudo, String utMp, String utMail, String utPhrase) {
        this.utPseudo = utPseudo;
        this.utMp = utMp;
        this.utMail = utMail;
        this.utPhrase = utPhrase;
    }

    public String getUtPseudo() {
        return utPseudo;
    }

    public void setUtPseudo(String utPseudo) {
        this.utPseudo = utPseudo;
    }

    public String getUtNom() {
        return utNom;
    }

    public void setUtNom(String utNom) {
        this.utNom = utNom;
    }

    public String getUtPrenom() {
        return utPrenom;
    }

    public void setUtPrenom(String utPrenom) {
        this.utPrenom = utPrenom;
    }

    public String getUtMp() {
        return utMp;
    }

    public void setUtMp(String utMp) {
        this.utMp = utMp;
    }

    public String getUtMail() {
        return utMail;
    }

    public void setUtMail(String utMail) {
        this.utMail = utMail;
    }

    public String getUtPhrase() {
        return utPhrase;
    }

    public void setUtPhrase(String utPhrase) {
        this.utPhrase = utPhrase;
    }

    public String getUtAdr1() {
        return utAdr1;
    }

    public void setUtAdr1(String utAdr1) {
        this.utAdr1 = utAdr1;
    }

    public String getUtAdr2() {
        return utAdr2;
    }

    public void setUtAdr2(String utAdr2) {
        this.utAdr2 = utAdr2;
    }

    public String getUtCdpost() {
        return utCdpost;
    }

    public void setUtCdpost(String utCdpost) {
        this.utCdpost = utCdpost;
    }

    public String getUtNumpost() {
        return utNumpost;
    }

    public void setUtNumpost(String utNumpost) {
        this.utNumpost = utNumpost;
    }

    public byte[] getUtAvatar() {
        return utAvatar;
    }

    public void setUtAvatar(byte[] utAvatar) {
        this.utAvatar = utAvatar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (utPseudo != null ? utPseudo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur_1)) {
            return false;
        }
        Utilisateur_1 other = (Utilisateur_1) object;
        if ((this.utPseudo == null && other.utPseudo != null) || (this.utPseudo != null && !this.utPseudo.equals(other.utPseudo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "localux.model.Utilisateur_1[ utPseudo=" + utPseudo + " ]";
    }
    
}
