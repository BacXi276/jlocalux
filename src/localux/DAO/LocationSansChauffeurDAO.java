/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.DAO;

import localux.model.LocationSansChauffeur;
import localux.technic.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class LocationSansChauffeurDAO implements LocationSansChauffeurDAOInterface {

    public void create(LocationSansChauffeur locSansChauffeur) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO LocationSansChauffeur (numLocation, nbKmDepart, nbKMRetour,CoutEstimeReparations, idAssuranceComp) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(locSansChauffeur.getNumLocation()));
            ps.setString(2, Integer.toString(locSansChauffeur.getNbKmDepart()));
            ps.setString(3, Integer.toString(locSansChauffeur.getNbKmRetour()));
            ps.setString(4, "0");
            ps.setString(5, "0");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }

    public void update(LocationSansChauffeur locSansChauffeur) {

        try {

            Connection con = ConnectDB.getConnect();
            String sql = "UPDATE LocationSansChauffeur SET nbKmDepart=?, nbKmRetour=?, CoutEstimeReparations=?, idAssuranceComp=? WHERE numLocation=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(locSansChauffeur.getNbKmDepart()));
            ps.setString(2, Integer.toString(locSansChauffeur.getNbKmDepart()));
            ps.setString(3, "0");
            ps.setString(4, "0");
            ps.setString(5, Integer.toString(locSansChauffeur.getNumLocation()));
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "DB : Enregistrement mis à jour !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la mise à jour de l'utilisateur");
        }

    }

    public static void delete(String numLocation) {
        try {

            Connection con = ConnectDB.getConnect();
            String sql = "delete from LocationSansChauffeur  WHERE numLocation=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, numLocation);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement supprimé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la suppression de l'utilisateur");
        }
    }

    /*public static Utilisateur loginUtilisateur(String pseudo, char[] pass) {
        Utilisateur ut = getLUtilisateur(pseudo);
        if (ut.getUtPseudo() != null) {
            if (!ut.verifPass(pass)) {
                ut = new Utilisateur();
            }
        }
        return ut;

    }*/

    public static LocationSansChauffeur getLSC(String numLoc) {

        LocationSansChauffeur loc = new LocationSansChauffeur();
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM LocationSansChauffeur WHERE numLocation=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, numLoc);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                loc.setNumLocation(Integer.parseInt(rs.getString("numLocation").strip()));
                loc.setNbKmDepart(Integer.parseInt(rs.getString("nbKmDepart")));
                loc.setNbKmRetour(Integer.parseInt(rs.getString("nbKmRetour")));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors du chargement de l'utilisateur");
        }
        return loc;
    }

    public static TreeMap<String, LocationSansChauffeur> getLesLocSansChauffeur() {

        TreeMap<String, LocationSansChauffeur> list = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM LocationSansChauffeur ORDER BY numLocation;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LocationSansChauffeur loc = new LocationSansChauffeur();
                loc.setNumLocation(Integer.parseInt(rs.getString("numLocation").strip()));
                loc.setNbKmDepart(Integer.parseInt(rs.getString("nbKmDepart")));
                loc.setNbKmRetour(Integer.parseInt(rs.getString("nbKmRetour")));

                list.put(Integer.toString(loc.getNumLocation()), loc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors du chargement des utilisateurs");
        }
        return list;
    }

}
