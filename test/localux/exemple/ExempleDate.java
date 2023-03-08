package localux.exemple;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExempleDate {

    public static void main(String[] args) {
        
        // Date du jour :  LocalDateTime.now()
        LocalDateTime maintenant = LocalDateTime.now();
        System.out.println("Date/heure du jour : " + maintenant);
        
        // création d'une date : LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute)
        LocalDateTime datetime1 = LocalDateTime.of(2023, 1, 15, 10, 34);
        
        // Ajout de 120 jours
        LocalDateTime datetime2 = datetime1.plusDays(120);
        System.out.println("Sortie  brute : " + datetime2);
        
        // Utilisation d'un format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDateTime = datetime2.format(format);
        System.out.println("Sortie formatée : " + formatDateTime);
    }

}
