/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import localux.model.Rapport;
import localux.technic.ConnectDB;

/**
 *
 * @author b.bailly
 */
public class RapportDAO {
    
    public static Rapport getRapport(int numRap) {

        Rapport rap = new Rapport();
        /*try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM util_vue WHERE utpseudo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numRap);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                rap.setUtPseudo(rs.getString("utpseudo").strip());
                rap.setUtNom(rs.getString("utnom"));
                rap.setUtPrenom(rs.getString("utprenom"));
                rap.setUtMp(rs.getString("utmp"));
                rap.setUtMail(rs.getString("utmail"));
                rap.setUtPhrase(rs.getString("utphrase"));
                rap.setUtAdr1(rs.getString("utadr1"));
                rap.setUtAdr2(rs.getString("utadr2"));
                rap.utCommune.setCode_Postal(rs.getString("utcdpost"));
                rap.utCommune.setNum_Postal(rs.getString("utnumpost"));
                rap.utCommune.setNom_Commune(rs.getString("nom_commune"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors du chargement de l'utilisateur");
        }*/
        return rap;
    }
}
