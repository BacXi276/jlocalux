package localux.model;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.InputStream;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.awt.Rectangle;
//import java.net.URI;
import java.io.File;
//import java.nio.file.Paths;
import java.nio.file.Path;
import javax.swing.JOptionPane;
import localux.technic.GestionImg;
//import java.awt.image.CropImageFilter;
//import javax.swing.JLabel;


public class Photo {

    public BufferedImage image;
    public BufferedImage miniature;
    private boolean imported;
    private String format;
    private Path path;
    private int lumi, cont;
    private Rectangle sel;
    public final int[] IMG_SIZE = {420, 495};//{420, 495},{280, 310},{140, 165}
    public final int[] MIN_SIZE = {140, 165};
    public final String DEFAULT_IMG = "/ressources/user-tie-max.jpg";
    public final String DEFAULT_MIN = "/ressources/user-tie-min.jpg";

    public Photo() {
        sel = new Rectangle(0,0,IMG_SIZE[0], IMG_SIZE[1]);
        try {
            path = Path.of(getClass().getResource(DEFAULT_IMG).toURI());
            image = ImageIO.read(getClass().getResourceAsStream(DEFAULT_IMG));
            miniature = ImageIO.read(getClass().getResourceAsStream(DEFAULT_MIN));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "IMG Photo() : Erreur à l'initialisation de l'image : \n" + ex);
        }
        imported = true;
        format = "jpg";
        lumi = 10;
        cont = 1;
    }

    public Photo(Path chemin) {
        File inputFile = chemin.toFile();
        try {
            path = Path.of(inputFile.toURI());
            image = ImageIO.read(inputFile);
            format = inputFile.getName().substring(inputFile.getName().lastIndexOf('.') + 1).toLowerCase();
            imported = true;
            lumi = 0;
            cont = 0;
           

        } catch (Exception ex) {
            image = null;
            JOptionPane.showMessageDialog(null, "IMG BI : Erreur à l'importation de l'image : \n" + ex);
        }
        if (image != null && imported) {

            try {
                image = GestionImg.resizeImg(image, IMG_SIZE[0], IMG_SIZE[1]);
                miniature = GestionImg.resizeImg(image, MIN_SIZE[0], MIN_SIZE[1]);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "IMG BI : Erreur au redimentionnement de l'image\n" + ex);
            }

        } else {
            try {
                path = Path.of(getClass().getResource(DEFAULT_IMG).toURI());
                image = ImageIO.read(getClass().getResourceAsStream(DEFAULT_IMG));
                miniature = ImageIO.read(getClass().getResourceAsStream(DEFAULT_MIN));
            } catch (Exception ex) {
            }
        }
        sel = new Rectangle(0,0,image.getWidth(), image.getHeight());
    }

    public BufferedImage getImage() {
        return image;
    }

    public BufferedImage getMiniature() {
        return miniature;
    }

    public ImageIcon getImageIcon() {
        return new ImageIcon(image);
    }

    public ImageIcon getMiniatureIcon() {
        return new ImageIcon(miniature);
    }

    public ImageIcon getMiniatureIconFromImage(Rectangle rectangle) {
        if (image.getWidth() < IMG_SIZE[0]) {
            rectangle.x -= Math.round((IMG_SIZE[0] - image.getWidth()) / 2);
            if (rectangle.x < 0) {
                rectangle.x = 0;
            }
            if ((rectangle.x + rectangle.width) > image.getWidth()) {
                rectangle.width = image.getWidth() - rectangle.x;
            }
        }
        if (image.getHeight() < IMG_SIZE[1]) {
            rectangle.y -= Math.round((IMG_SIZE[1] - image.getHeight()) / 2);
            if (rectangle.y < 0) {
                rectangle.y = 0;
            }
            if ((rectangle.y + rectangle.height) > image.getHeight()) {
                rectangle.height = image.getHeight() - rectangle.y;
            }
        }
        sel = rectangle;
        miniature = GestionImg.resizeImg(image.getSubimage(rectangle.x, rectangle.y, rectangle.width, rectangle.height),MIN_SIZE[0], MIN_SIZE[1]);
        return new ImageIcon(miniature);
    }

    /*
    public Graphics getGraphics() {

        BufferedImage imageOut = new BufferedImage(image.getWidth(),image.getHeight(), image.getType());
        Graphics bGr = imageOut.createGraphics();
        bGr.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
        return bGr;
    }
     */
    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setImage(InputStream inputStream) throws IOException {
        this.image = ImageIO.read(inputStream);
    }

    public void setMiniature(BufferedImage avatar) {
        this.miniature = avatar;
    }

    public void setMiniature(ImageIcon avatar) {
        this.miniature = (BufferedImage) avatar.getImage();
    }

    public void setMiniature(InputStream inputStream) throws IOException {
        
        this.miniature = ImageIO.read(inputStream);
       
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String Format) {
        this.format = Format;
    }

    public boolean isNull() {
        return (this.image == null);
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public float getLumi() {
        return lumi;
    }

    public void setLumi(int lumi) {
        this.lumi = lumi;
    }

    public float getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    public void flip(int w, int h) {
        image = GestionImg.flipImg(image, w, h);
        miniature = GestionImg.resizeImg(image, MIN_SIZE[0], MIN_SIZE[1]);
        
    }
    public void rotate(int rad) {
        image = GestionImg.rotateImg(image, rad);
        image = GestionImg.resizeImg(image, IMG_SIZE[0], IMG_SIZE[1]);
        miniature = GestionImg.resizeImg(image, MIN_SIZE[0], MIN_SIZE[1]);
        
    }
    public ImageIcon rescaleMin(int lum, int con) {
        float scale = 1+(lum/100.0f);
        float offset = (con/100.0f);
        miniature = GestionImg.resizeImg(image.getSubimage(sel.x, sel.y, sel.width, sel.height),MIN_SIZE[0], MIN_SIZE[1]);
        miniature = GestionImg.rescaleOpImg(miniature, scale, offset);
        /*ImageIcon icon = new ImageIcon(miniature);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label);*/
        return new ImageIcon(miniature);
    }
}
