/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author b.bailly
 */
@Entity
@Table(name = "util_avatar")
@NamedQueries({
    @NamedQuery(name = "UtilAvatar.findAll", query = "SELECT u FROM UtilAvatar u"),
    @NamedQuery(name = "UtilAvatar.findByUtPseudo", query = "SELECT u FROM UtilAvatar u WHERE u.utPseudo = :utPseudo")})
public class UtilAvatar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "utPseudo")
    private String utPseudo;
    @Lob
    @Column(name = "utAvatar")
    private byte[] utAvatar;

    public UtilAvatar() {
    }

    public String getUtPseudo() {
        return utPseudo;
    }

    public void setUtPseudo(String utPseudo) {
        this.utPseudo = utPseudo;
    }

    public byte[] getUtAvatar() {
        return utAvatar;
    }

    public void setUtAvatar(byte[] utAvatar) {
        this.utAvatar = utAvatar;
    }
    
}
