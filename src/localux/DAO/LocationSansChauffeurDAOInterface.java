/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.DAO;
import localux.model.LocationSansChauffeur;
import java.util.TreeMap;

/**
 *
 * @author patrick DUPRE
 */
public interface LocationSansChauffeurDAOInterface {
    public static void create(LocationSansChauffeur locationSC) {}
    public static void update(LocationSansChauffeur locationSC) {}
    public static void delete(String numLoc) {}
    public static LocationSansChauffeur getLSC(String numLoc) {
        LocationSansChauffeur loc = new LocationSansChauffeur();
        // code à implémenter
        return loc;
    }
    public static TreeMap<String, LocationSansChauffeur> getLesLocSansChauffeur() {
        TreeMap<String, LocationSansChauffeur> lesUt = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        return lesUt;
    }
            
 
}
    
