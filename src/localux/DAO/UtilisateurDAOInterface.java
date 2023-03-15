/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.DAO;
import localux.model.Utilisateur;
import java.util.TreeMap;

/**
 *
 * @author patrick DUPRE
 */
public interface UtilisateurDAOInterface {
    public static void create(Utilisateur utilisateur) {}
    public static void update(Utilisateur utilisateur) {}
    public static void delete(String pseudo) {}
    public static Utilisateur getLUtilisateur(String pseudo) {
        Utilisateur ut = new Utilisateur();
        // code à implémenter
        return ut;
    }
    public static TreeMap<String, Utilisateur> getLesUtilisateurs() {
        TreeMap<String, Utilisateur> lesUt = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        return lesUt;
    }
            
 
}
    
