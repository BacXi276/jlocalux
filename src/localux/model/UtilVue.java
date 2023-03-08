/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author b.bailly
 */
@Entity
@Table(name = "util_vue")
@NamedQueries({
    @NamedQuery(name = "UtilVue.findAll", query = "SELECT u FROM UtilVue u"),
    @NamedQuery(name = "UtilVue.findByUtpseudo", query = "SELECT u FROM UtilVue u WHERE u.utpseudo = :utpseudo"),
    @NamedQuery(name = "UtilVue.findByUtnom", query = "SELECT u FROM UtilVue u WHERE u.utnom = :utnom"),
    @NamedQuery(name = "UtilVue.findByUtprenom", query = "SELECT u FROM UtilVue u WHERE u.utprenom = :utprenom"),
    @NamedQuery(name = "UtilVue.findByUtmp", query = "SELECT u FROM UtilVue u WHERE u.utmp = :utmp"),
    @NamedQuery(name = "UtilVue.findByUtmail", query = "SELECT u FROM UtilVue u WHERE u.utmail = :utmail"),
    @NamedQuery(name = "UtilVue.findByUtphrase", query = "SELECT u FROM UtilVue u WHERE u.utphrase = :utphrase"),
    @NamedQuery(name = "UtilVue.findByUtadr1", query = "SELECT u FROM UtilVue u WHERE u.utadr1 = :utadr1"),
    @NamedQuery(name = "UtilVue.findByUtadr2", query = "SELECT u FROM UtilVue u WHERE u.utadr2 = :utadr2"),
    @NamedQuery(name = "UtilVue.findByUtcdpost", query = "SELECT u FROM UtilVue u WHERE u.utcdpost = :utcdpost"),
    @NamedQuery(name = "UtilVue.findByUtnumpost", query = "SELECT u FROM UtilVue u WHERE u.utnumpost = :utnumpost"),
    @NamedQuery(name = "UtilVue.findByNomCommune", query = "SELECT u FROM UtilVue u WHERE u.nomCommune = :nomCommune")})
public class UtilVue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "utpseudo")
    private String utpseudo;
    @Column(name = "utnom")
    private String utnom;
    @Column(name = "utprenom")
    private String utprenom;
    @Basic(optional = false)
    @Column(name = "utmp")
    private String utmp;
    @Basic(optional = false)
    @Column(name = "utmail")
    private String utmail;
    @Basic(optional = false)
    @Column(name = "utphrase")
    private String utphrase;
    @Column(name = "utadr1")
    private String utadr1;
    @Column(name = "utadr2")
    private String utadr2;
    @Column(name = "utcdpost")
    private String utcdpost;
    @Column(name = "utnumpost")
    private String utnumpost;
    @Column(name = "Nom_Commune")
    private String nomCommune;

    public UtilVue() {
    }

    public String getUtpseudo() {
        return utpseudo;
    }

    public void setUtpseudo(String utpseudo) {
        this.utpseudo = utpseudo;
    }

    public String getUtnom() {
        return utnom;
    }

    public void setUtnom(String utnom) {
        this.utnom = utnom;
    }

    public String getUtprenom() {
        return utprenom;
    }

    public void setUtprenom(String utprenom) {
        this.utprenom = utprenom;
    }

    public String getUtmp() {
        return utmp;
    }

    public void setUtmp(String utmp) {
        this.utmp = utmp;
    }

    public String getUtmail() {
        return utmail;
    }

    public void setUtmail(String utmail) {
        this.utmail = utmail;
    }

    public String getUtphrase() {
        return utphrase;
    }

    public void setUtphrase(String utphrase) {
        this.utphrase = utphrase;
    }

    public String getUtadr1() {
        return utadr1;
    }

    public void setUtadr1(String utadr1) {
        this.utadr1 = utadr1;
    }

    public String getUtadr2() {
        return utadr2;
    }

    public void setUtadr2(String utadr2) {
        this.utadr2 = utadr2;
    }

    public String getUtcdpost() {
        return utcdpost;
    }

    public void setUtcdpost(String utcdpost) {
        this.utcdpost = utcdpost;
    }

    public String getUtnumpost() {
        return utnumpost;
    }

    public void setUtnumpost(String utnumpost) {
        this.utnumpost = utnumpost;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }
    
}
