/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localux.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author patrick
 */
public class Utilisateur {

    private String utPseudo, utNom, utPrenom, utMp, utMail, utPhrase, utAdr1, utAdr2;
    public Commune utCommune;

    public Utilisateur(String utPseudo, String utNom, String utPrenom, String utMp, String utMail, String utPhrase, String utAdr1, String utAdr2, Commune utCommune) {
        this.utPseudo = utPseudo;
        this.utNom = utNom;
        this.utPrenom = utPrenom;
        this.utMp = utMp;
        this.utMail = utMail;
        this.utPhrase = utPhrase;
        this.utAdr1 = utAdr1;
        this.utAdr2 = utAdr2;
        this.utCommune = utCommune;
    }
public void updateUtMp(String utMp) {
        if (utMp != this.utMp) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion.$2B, 12);
            this.utMp = utMp;
            this.utPhrase = encoder.encode(utMp);
        }
    }

    public Utilisateur() {
        this.utCommune = new Commune();
        this.utPseudo = null;
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

    public Commune getUtCommune() {
        return utCommune;
    }

    public void setUtCommune(Commune utCommune) {
        this.utCommune = utCommune;
    }
    public boolean verifPass(char[] pass) {
        String pwd = new String(pass);
        BCryptPasswordEncoder passwordEcorder = new BCryptPasswordEncoder();
        return passwordEcorder.matches(pwd, this.utPhrase);
    }
}
