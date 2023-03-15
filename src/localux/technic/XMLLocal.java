/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.technic;

import java.io.File; // Gérer les fichiers et répertoires
import java.io.FileWriter; // Ecrire dans un fichier
import java.nio.file.Paths; // Obtenir le chemin
import org.jdom2.Document; // Document sous forme d'arbre XML
import localux.DAO.ConfigDAO; // pour Appel de la création 
import org.jdom2.input.SAXBuilder; // creer le DOM
import org.jdom2.output.XMLOutputter; // Prépare le flux de sortie
import org.jdom2.output.Format; // Formate les données 

public class XMLLocal {
    private static final String leRepertoire = ".jcrud";
    /* Les méthodes pouvant lever des exceptions doivent inclure une clause throws nom_exception dans leur en-tête.
   Double objectif : la méthode pourra lever l'exception, charge à la méthode appellante de traiter cette exception (propagation).*/

    public static Document getDocument() throws Exception {
        Document docXML;
        String path;
        String homePath = System.getProperty("user.home");
        // repertoire des paramétres 
        File fichier = new File(Paths.get(homePath,leRepertoire).toString());
        if (!fichier.exists()) {
            fichier.mkdir();
        }
        path = Paths.get(homePath, leRepertoire, "config.xml").toString();
        fichier = new File(path);
        if (!fichier.exists()) {
            ConfigDAO.initXMLFile();
        }
        SAXBuilder builder = new SAXBuilder();
        docXML = builder.build(new File(path));
        return docXML;
    }

    public static void saveDocument(Document docXML) throws Exception {
        // obtenir le chemin du fichier de configuration
        String path = Paths.get(System.getProperty("user.home"), leRepertoire, "config.xml").toString();
        //File fichier = new File(path);
        // Enregistrer le fichier
        XMLOutputter xml = new XMLOutputter();
        xml.setFormat(Format.getPrettyFormat());
        xml.output(docXML, new FileWriter(path));
    }
}