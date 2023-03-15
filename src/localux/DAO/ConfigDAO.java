package localux.DAO;

import localux.technic.XMLLocal;
import localux.technic.CryptageRSA;
import localux.model.Configuration;
import javax.swing.JOptionPane;

import org.jdom2.Document;
import org.jdom2.Element;
import java.util.List;

/**
 *
 * @author patrick
 */
public class ConfigDAO implements ConfigDAOInterface {

    public static Configuration getConfiguration() {
        Configuration c = new Configuration();
        try {
            CryptageRSA crypt = new CryptageRSA();
            crypt.loadPrivateKey("/ressources/key.priv.pem");
            String passSMTP = "";
            String passDB = "";
            Document docXML = XMLLocal.getDocument();

            Element docRoot = docXML.getRootElement();
            List<Element> lesParamsMail = docRoot.getChildren("mail");
            // Element paramMail = lesParamsMail.get(0);
            for (Element paramMail : lesParamsMail) {
                c.setMailProtocol(paramMail.getChildText("protocol"));
                c.setMailHost(paramMail.getChildText("host"));
                c.setMailPort(paramMail.getChildText("port"));
                c.setMailUser(paramMail.getChildText("user"));
                passSMTP = paramMail.getChildText("password");
            }
            List<Element> lesParamsSgbd = docRoot.getChildren("sgbd");
            // Element paramSgbd = lesParamsSgbd.get(0);
            for (Element paramSgbd : lesParamsSgbd) {
                c.setSgbdSys(paramSgbd.getChildText("system"));
                c.setSgbdHost(paramSgbd.getChildText("host"));
                c.setSgbdPort(paramSgbd.getChildText("port"));
                c.setSgbdDb(paramSgbd.getChildText("database"));
                c.setSgbdUser(paramSgbd.getChildText("user"));
                passDB = paramSgbd.getChildText("password");
            }
            c.setMailPass(crypt.decode(passSMTP, "PRIV"));
            c.setSgbdPass(crypt.decode(passDB, "PRIV"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Config : Erreur lors de l'initialisation du parametrage ");
        }
        return c;
    }

    /**
     * Création d'un fichier XML au chemin + nom = path *
     */
    public static void initXMLFile() {
            Configuration c = new Configuration();
            c.setMailProtocol("smtp");
            c.setMailHost("mail.st2msi.net");
            c.setMailPort("465");
            c.setMailUser("mailflex@st2msi.net");
            c.setMailPass("uOBtCU5pdL!Y");
            c.setSgbdSys("mysql");//postgresql
            c.setSgbdHost("localhost");
            c.setSgbdPort("3306");
            c.setSgbdDb("gestion_utilisateur");
            c.setSgbdUser("mysql");//pgsql
            c.setSgbdPass("azerty");
            saveXMLFile(c);
    }

    public static void saveXMLFile(Configuration c) {
        try {
            
            CryptageRSA crypt = new CryptageRSA();
            crypt.loadPublicKey("/ressources/key.pub.pem");
            String passSMTP = crypt.encode(c.getMailPass(), "PUB");
            String passDB = crypt.encode(c.getSgbdPass(), "PUB");
            
            Element config = new Element("configuration");

            Document docXML = new Document(config);
            Element mail = new Element("mail");
            mail.addContent(new Element("protocol").setText(c.getMailProtocol()));
            mail.addContent(new Element("host").setText(c.getMailHost()));
            mail.addContent(new Element("port").setText(c.getMailPort()));
            mail.addContent(new Element("user").setText(c.getMailUser()));
            mail.addContent(new Element("password").setText(passSMTP));
            docXML.getRootElement().addContent(mail);
            Element sgbd = new Element("sgbd");
            sgbd.addContent(new Element("system").setText(c.getSgbdSys()));
            sgbd.addContent(new Element("host").setText(c.getSgbdHost()));
            sgbd.addContent(new Element("port").setText(c.getSgbdPort()));
            sgbd.addContent(new Element("database").setText(c.getSgbdDb()));
            sgbd.addContent(new Element("user").setText(c.getSgbdUser()));
            sgbd.addContent(new Element("password").setText(passDB));
            docXML.getRootElement().addContent(sgbd);
            XMLLocal.saveDocument(docXML);
            JOptionPane.showMessageDialog(null, "Config : Configuration sauvegardée");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Config : Erreur sauvegarde config.xml");
        }
    }

}
