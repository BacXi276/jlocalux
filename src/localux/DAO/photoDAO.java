/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.DAO;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import localux.technic.ConnectDB;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import localux.model.Photo;

/**
 *
 * @author patrick
 */
public class photoDAO {

    public static void getUtIcon(String pseudo, Photo photo) {
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM util_avatar WHERE utpseudo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pseudo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                photo.setMiniature(rs.getBinaryStream("utavatar"));
            }
            if (photo.isNull()) {
                photo.setMiniature(photo.getClass().getResourceAsStream(photo.DEFAULT_MIN));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Image : Erreur à la lecture de l'image\n" + ex);
        }
    }

        public static void setUtImage(String pseudo, Photo photo) {
        try {
            if (photo.isImported()) {
                ByteArrayOutputStream img = new ByteArrayOutputStream();
                ImageIO.write(photo.getMiniature(), photo.getFormat(), img);
                InputStream outImg = new ByteArrayInputStream(img.toByteArray());
                
                Connection con = ConnectDB.getConnect();
                String sql = "UPDATE utilisateur SET utavatar=? WHERE utpseudo=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setBinaryStream(1, outImg);
                ps.setString(2, pseudo);
                ps.executeUpdate();
                /*ImageIcon icon = new ImageIcon(photo.miniature);
                JLabel label = new JLabel(icon);*/
                JOptionPane.showMessageDialog(null, "IMG II: Image enregitrée au format " + photo.getFormat()+" !");
            } else {
                JOptionPane.showMessageDialog(null, "IMG II: Aucune image importée !");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Image : Erreur à la modification de l'image\n" + ex);
                    //RescaleOp rescale;
        }
    }
}
