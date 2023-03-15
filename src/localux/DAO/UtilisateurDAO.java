/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.DAO;

import localux.model.Utilisateur;
import localux.technic.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class UtilisateurDAO implements UtilisateurDAOInterface {

    public void create(Utilisateur utilisateur) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO utilisateur (utpseudo, utnom, utprenom, utmp, utmail, utphrase, utadr1, utadr2, utcdpost, utnumpost) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, utilisateur.getUtPseudo());
            ps.setString(2, utilisateur.getUtNom());
            ps.setString(3, utilisateur.getUtPrenom());
            ps.setString(4, utilisateur.getUtMp());
            ps.setString(5, utilisateur.getUtMail());
            ps.setString(6, utilisateur.getUtPhrase());
            ps.setString(7, utilisateur.getUtAdr1());
            ps.setString(8, utilisateur.getUtAdr2());
            
            ps.setString(9, utilisateur.utCommune.getCode_Postal());
            ps.setString(10, utilisateur.utCommune.getNum_Postal());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }

    public void update(Utilisateur utilisateur) {

        try {

            Connection con = ConnectDB.getConnect();
            String sql = "UPDATE utilisateur SET utnom=?, utprenom=?, utmp=?, utmail=?, utphrase=?, utadr1=?, utadr2=?, utcdpost=?, utnumpost=? WHERE utpseudo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, utilisateur.getUtNom());
            ps.setString(2, utilisateur.getUtPrenom());
            ps.setString(3, utilisateur.getUtMp());
            ps.setString(4, utilisateur.getUtMail());
            ps.setString(5, utilisateur.getUtPhrase());
            ps.setString(6, utilisateur.getUtAdr1());
            ps.setString(7, utilisateur.getUtAdr2());
            ps.setString(8, utilisateur.utCommune.getCode_Postal());
            ps.setString(9, utilisateur.utCommune.getNum_Postal());
            ps.setString(10, utilisateur.getUtPseudo());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "DB : Enregistrement mis à jour !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la mise à jour de l'utilisateur");
        }

    }

    public static void delete(String pseudo) {
        try {

            Connection con = ConnectDB.getConnect();
            String sql = "delete from utilisateur  WHERE utpseudo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pseudo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement supprimé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la suppression de l'utilisateur");
        }
    }

    public static Utilisateur loginUtilisateur(String pseudo, char[] pass) {
        Utilisateur ut = getLUtilisateur(pseudo);
        if (ut.getUtPseudo() != null) {
            if (!ut.verifPass(pass)) {
                ut = new Utilisateur();
            }
        }
        return ut;

    }

    public static Utilisateur getLUtilisateur(String pseudo) {

        Utilisateur ut = new Utilisateur();
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM util_vue WHERE utpseudo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pseudo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ut.setUtPseudo(rs.getString("utpseudo").strip());
                ut.setUtNom(rs.getString("utnom"));
                ut.setUtPrenom(rs.getString("utprenom"));
                ut.setUtMp(rs.getString("utmp"));
                ut.setUtMail(rs.getString("utmail"));
                ut.setUtPhrase(rs.getString("utphrase"));
                ut.setUtAdr1(rs.getString("utadr1"));
                ut.setUtAdr2(rs.getString("utadr2"));
                ut.utCommune.setCode_Postal(rs.getString("utcdpost"));
                ut.utCommune.setNum_Postal(rs.getString("utnumpost"));
                ut.utCommune.setNom_Commune(rs.getString("nom_commune"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors du chargement de l'utilisateur");
        }
        return ut;
    }

    public static TreeMap<String, Utilisateur> getLesUtilisateurs() {

        TreeMap<String, Utilisateur> list = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM util_vue ORDER BY utpseudo;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Utilisateur ut = new Utilisateur();
                ut.setUtPseudo(rs.getString("utpseudo").strip());
                ut.setUtNom(rs.getString("utnom"));
                ut.setUtPrenom(rs.getString("utprenom"));
                ut.setUtMp(rs.getString("utmp"));
                ut.setUtMail(rs.getString("utmail"));
                ut.setUtPhrase(rs.getString("utphrase"));
                ut.setUtAdr1(rs.getString("utadr1"));
                ut.setUtAdr2(rs.getString("utadr2"));
                ut.utCommune.setCode_Postal(rs.getString("utcdpost"));
                ut.utCommune.setNum_Postal(rs.getString("utnumpost"));
                ut.utCommune.setNom_Commune(rs.getString("nom_commune"));

                list.put(ut.getUtPseudo(), ut);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors du chargement des utilisateurs");
        }
        return list;
    }

}
