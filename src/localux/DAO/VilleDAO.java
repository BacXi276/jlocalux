package localux.DAO;

import localux.technic.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import localux.model.Commune;

public class VilleDAO implements VilleDAOInterface {


    public static HashMap<Integer, Commune> villesPourCp(String codePostal) {
        HashMap<Integer, Commune> listVilles = new HashMap<>();
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM codes_postaux WHERE code_postal= ? ORDER BY nom_commune;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codePostal);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Commune uneVille = new Commune(codePostal, rs.getString("num_postal"), rs.getString("nom_commune"));
                listVilles.put(rs.getInt("num_postal"), uneVille);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DB : Erreur lors du chargement des communes");
        }
        return listVilles;

    }
}
