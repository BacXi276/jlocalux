/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.technic;

import java.awt.Graphics2D;
import java.awt.Color;
import java.nio.file.Paths;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.WritableRaster;


/**
 *
 * @author patrick DUPRE
 */
public class GestionImg {

    public static BufferedImage readImg(Paths chemin) throws IOException {
        File input_file = new File(chemin.toString());
        BufferedImage image = ImageIO.read(input_file);
        return image;
    }

    /*
    public static void writeImg(BufferedImage image, Paths chemin) throws IOException {
        ImageIO.write(image, "jpeg", new File(chemin.toString()));
    }
     */
    public static BufferedImage resizeImg(BufferedImage image, int largeurCible, int hauteurCible) {
        int hauteur = image.getHeight();
        int largeur = image.getWidth();
        int hauteurOut = hauteurCible;
        int largeurOut = largeurCible;
        int typeInt = image.getType();
        float ratioIn = (float) hauteur / (float) largeur;
        float ratioCible = (float) hauteurCible / (float) largeurCible;
        if (ratioIn > ratioCible) {
            largeurOut = largeur * hauteurCible / hauteur;
        } else {
            hauteurOut = hauteur * largeurCible / largeur;
        }
        BufferedImage imageOut = new BufferedImage(largeurOut, hauteurOut, typeInt);
        Graphics2D bGr = imageOut.createGraphics();
        bGr.drawImage(image, 0, 0, largeurOut, hauteurOut, null);
        bGr.dispose();
        return imageOut;
    }

    public static BufferedImage rotateImg(BufferedImage image, int rad) {
        int hauteur = image.getHeight();
        int largeur = image.getWidth();
        int typeInt = image.getType();

        BufferedImage imageOut = new BufferedImage(hauteur, largeur, typeInt);
        Graphics2D bGr = imageOut.createGraphics();
        bGr.translate((hauteur - largeur) / 2, (largeur - hauteur) / 2);
        bGr.rotate(Math.toRadians(rad), largeur / 2, hauteur / 2);
        bGr.drawRenderedImage(image, null);
        bGr.dispose();
        return imageOut;
    }

    public static BufferedImage flipImg(BufferedImage image, int w, int h) {
        int hauteur = image.getHeight();
        int largeur = image.getWidth();
        int typeInt = image.getType();
        int x = 0;
        int y = 0;
        if (w == -1) {
            x = largeur;
        }
        if (h == -1) {
            y = hauteur;
        }
        BufferedImage imageOut = new BufferedImage(largeur, hauteur, typeInt);
        Graphics2D bGr = imageOut.createGraphics();
        bGr.drawImage(image, x, y, largeur * w, hauteur * h, null);
        bGr.dispose();
        return imageOut;
    }

    public static BufferedImage alterImage(BufferedImage imageIn, float lumi, float cont) {
        // conservé pour info, inutilisé.

        int width = imageIn.getWidth();
        int height = imageIn.getHeight();
        int[][][] pixDim3 = new int[width][height][4];
        int pixelCntr = 0;
        long accum = 0;

        int mean;
        boolean isAlpha = false;
        WritableRaster raster = imageIn.getAlphaRaster();
        if (raster != null) {
            isAlpha = true;
        }
        //BufferedImage imageOut = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        BufferedImage imageOut = new BufferedImage(width, height, imageIn.getType());

        Graphics2D bGr = imageOut.createGraphics();
        bGr.drawImage(imageIn, 0, 0, width, height, null);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color color = new Color(imageOut.getRGB(i, j));
                if (isAlpha) {
                    pixDim3[i][j] = raster.getPixel(i, j, pixDim3[i][j]);
                } else {
                    pixDim3[i][j][0] = color.getAlpha();
                }
                pixDim3[i][j][1] = color.getRed();
                pixDim3[i][j][2] = color.getGreen();
                pixDim3[i][j][3] = color.getBlue();
                accum += pixDim3[i][j][1] + pixDim3[i][j][2] + pixDim3[i][j][3];
                pixelCntr += 3;
            }
        }

        mean = (int) accum / pixelCntr;
        int delta = (int) ((lumi - cont) * mean);
        for (int i = 0; i < width; i++) {

            for (int j = 0; j < height; j++) {
                for (int k = 1; k < 4; k++) {
                    pixDim3[i][j][k] = (int) (((pixDim3[i][j][k] - mean) * cont) + lumi * mean);
                    pixDim3[i][j][k] = (int) ((pixDim3[i][j][k] * cont) + delta);
                    if (pixDim3[i][j][k] < 0) {
                        pixDim3[i][j][k] = 0;
                    } else if (pixDim3[i][j][k] > 255) {
                        pixDim3[i][j][k] = 255;
                    }
                }

                imageOut.setRGB(i, j, (((pixDim3[i][j][0] << 24) & 0xFF000000)
                        | ((pixDim3[i][j][1] << 16) & 0x00FF0000)
                        | ((pixDim3[i][j][2] << 8) & 0x0000FF00)
                        | ((pixDim3[i][j][3]) & 0x000000FF)));
            }
        }
        return imageOut;
    }
    public static BufferedImage rescaleOpImg(BufferedImage image, float lumi, float cont) {
        int hauteur = image.getHeight();
        int largeur = image.getWidth();
        int typeInt = image.getType();
        int pixelCntr = 0;
        long accum = 0;
        int mean;

        //BufferedImage imageOut = new BufferedImage(largeur, hauteur, typeInt);
        //Graphics2D bGr = imageOut.createGraphics();
        //bGr.drawImage(image, 0, 0, largeur, hauteur, null);
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < hauteur; j++) {
                Color color = new Color(image.getRGB(i, j));
                accum += color.getRed()+ color.getGreen()+color.getBlue();
                pixelCntr += 3;
            }
        }
        /* Example we will be setting contrast for a picture using a single scale factor and offset.
        * The following code will reduce the brightness by 25% and darker the pixel by a factor of 3.6 :
        *   RescaleOp rop = new RescaleOp(.75f, 3.6f, null);
        */
        mean = (int) accum / pixelCntr;
        float offset = cont*mean;
        //System.out.println("mean="+mean+ " lum="+lumi+" con="+cont+ " offset="+ offset);
        RescaleOp op = new RescaleOp( lumi, offset, null);
        image = op.filter(image, null);
        
        return image;
    }

    public static String imageType(int type) {
        String libType = "";
        switch (type) {
            case BufferedImage.TYPE_INT_RGB:
                libType = "TYPE_INT_RGB";
                break;
            case BufferedImage.TYPE_INT_ARGB:
                libType = "TYPE_INT_ARGB";
                break;
            case BufferedImage.TYPE_INT_ARGB_PRE:
                libType = "TYPE_INT_ARGB_PRE";
                break;
            case BufferedImage.TYPE_INT_BGR:
                libType = "TYPE_INT_BGR";
                break;
            case BufferedImage.TYPE_3BYTE_BGR:
                libType = "TYPE_3BYTE_BGR";
                break;
            case BufferedImage.TYPE_4BYTE_ABGR:
                libType = "TYPE_4BYTE_ABGR";
                break;
            case BufferedImage.TYPE_4BYTE_ABGR_PRE:
                libType = "TYPE_4BYTE_ABGR_PRE";
                break;
            case BufferedImage.TYPE_BYTE_GRAY:
                libType = "TYPE_BYTE_GRAY";
                break;
            case BufferedImage.TYPE_BYTE_BINARY:
                libType = "TYPE_BYTE_BINARY";
                break;
            case BufferedImage.TYPE_BYTE_INDEXED:
                libType = "TYPE_BYTE_INDEXED";
                break;
            case BufferedImage.TYPE_USHORT_GRAY:
                libType = "TYPE_USHORT_GRAY";
                break;
            case BufferedImage.TYPE_USHORT_565_RGB:
                libType = "TYPE_USHORT_565_RGB";
                break;
            case BufferedImage.TYPE_USHORT_555_RGB:
                libType = "TYPE_USHORT_555_RGB";
                break;
            case BufferedImage.TYPE_CUSTOM:
                libType = "TYPE_CUSTOM";
                break;
            default:
                libType = "Type inconnu !!!!";
        }
        return libType;
    }

}
