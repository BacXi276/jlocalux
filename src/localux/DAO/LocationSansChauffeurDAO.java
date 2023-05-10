/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.DAO;

import localux.model.LocationSansChauffeur;
import localux.technic.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LocationSansChauffeurDAO implements LocationSansChauffeurDAOInterface {

    public void create(LocationSansChauffeur locSansChauffeur) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO Location (numLocation, dateLocation, montantRegle,dateHreDepartPrevu, dateHreDepartReel,dateHreRetourPrevu,dateHreRetourReel) VALUES (?,?,?,?,?);"
                        + "INSERT INTO LocationSansChauffeur (numLocation, nbKmDepart, nbKMRetour,CoutEstimeReparations, idAssuranceComp) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            //Location
            ps.setString(1, Integer.toString(locSansChauffeur.getNumLocation()));
            ps.setString(2, null);
            ps.setString(3, null);
            ps.setString(4, null);
            ps.setString(5, null);
            ps.setString(6, null);
            ps.setString(7, null);
            //Location Sans chauffeur
            ps.setString(8, Integer.toString(locSansChauffeur.getNumLocation()));
            ps.setString(9, Integer.toString(locSansChauffeur.getNbKmDepart()));
            ps.setString(10, Integer.toString(locSansChauffeur.getNbKmRetour()));
            ps.setString(11, Integer.toString(locSansChauffeur.getCoutRepa()));
            ps.setString(12, Integer.toString(locSansChauffeur.getAssuranceComp()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de location");
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
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la mise à jour de location");
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
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la suppression de location");
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
            JOptionPane.showMessageDialog(null, "DB : Erreur lors du chargement de la location");
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
            ResultSetMetaData rsmd=rs.getMetaData();
            //DefaultTableModel modelDefault=(DefaultTableModel) tbLocationSansChauffeur.getModel();
            //ERREUR CAR tbLocationSansChauffeur n'est pas sur cette page c'est le tableau de ListLocation
            //Nom des colonnes
            int cols=rsmd.getColumnCount();
            String[] colName=new String[cols];
            for(int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
            //model.setColumnIdentifiers(colName);
            while (rs.next()) {
                LocationSansChauffeur loc = new LocationSansChauffeur();
                loc.setNumLocation(Integer.parseInt(rs.getString("numLocation")));
                loc.setNbKmDepart(Integer.parseInt(rs.getString("nbKmDepart")));
                loc.setNbKmRetour(Integer.parseInt(rs.getString("nbKmRetour")));

                list.put(Integer.toString(loc.getNumLocation()), loc);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors du chargement des locations");
        }
        return list;
    }
        public static void showDataOnTable() {
        /*try {

            Connection con = ConnectDB.getConnect();
            String sql = "delete from LocationSansChauffeur  WHERE numLocation=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, numLocation);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement supprimé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la suppression de location");
        }*/
    }

}
