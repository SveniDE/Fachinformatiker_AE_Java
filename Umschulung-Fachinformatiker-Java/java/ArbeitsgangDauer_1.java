import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ArbeitsgangDauer_1 {
    public static void main(String[] args) {
        // Auftragsdatum festlegen
        LocalDateTime AStart = LocalDateTime.of(2026, 9,8, 6,35);
        
        // 1. Start- und Endzeitpunkt festlegen (Jahr, Monat, Tag, Stunde, Minute)
        LocalDateTime start = LocalDateTime.of(2026, 9, 9, 8, 15);  // 08:15 Uhr
        LocalDateTime ende  = LocalDateTime.of(2026, 9, 10, 14, 45); // 14:45 Uhr
        //1.1 DatumFormat bestimmen
    DateTimeFormatter muster_1 = DateTimeFormatter.ofPattern("dd.MM.yyy HH:mm 'Uhr'");
    System.out.println(AStart.format(muster_1));


        System.out.println("Auftragserteilung: " + AStart + "  " + AStart.format(muster_1));
        System.out.println("Bearbeitung begonnen: " + start);
        System.out.println("Bearbeitung abgeschlossen: " + ende);
        // Alternativ bei Echtzeitmessung:
        // LocalDateTime start = LocalDateTime.now();
        // ... Arbeitsgang läuft ...
        // LocalDateTime ende = LocalDateTime.now();

        // 2. Dauer berechnen
        Duration dauer = Duration.between(start, ende);

        // 3. Gesamte Einheiten abrufen
        long gesamtMinuten = dauer.toMinutes();
        System.out.println("Gesamtdauer in Minuten: " + gesamtMinuten); // 390 Minuten

        // 4. Lesbar aufteilen in Stunden und verbleibende Restminuten
        long stunden = dauer.toHours();
        long restMinuten = dauer.toMinutesPart(); // Restminuten nach den vollen Stunden

        System.out.printf("Der Arbeitsgang dauerte: %d Stunden und %d Minuten%n", stunden, restMinuten);
    }
}