package museum;

public class Besucherzaehler {
    
    //Instanz der Klasse - leer
    private static Besucherzaehler instanz;

    //Attribut
    //private int anzahl = 0;
    private int anzahlHaupt = 0;
    private int anzahlSeite = 0; 
    private int gesamtBesucher = 0;


    //privater Konstruktor: niemand kann "new" aufrufen, von aussen
    private Besucherzaehler(){
        System.out.println("Zaehler gestartet");
    }
    

    //methode
        //einlass(int zaehler);
    public static Besucherzaehler getInstanz() {     
        if (instanz == null) {                      //prüft ob es schon eine gibt
            instanz = new Besucherzaehler();          //wenn wert null wird eine erzeugt
        }
        return instanz;                             //bei jedem Aufruf wird dieselbe referenz zurück gegeben
    }

    //getter
    public int getAnzahlHaupt(){        //gibt die Anzahl f. Haupteingang
        return this.anzahlHaupt;
    }
    public int getAnzahlSeite(){        //gibt die Anzahl f- Seiteneingang
        return this.anzahlSeite;
    }
    public int getgesamtBesucher(){     //getter f . gesamtanzahl
        return this.gesamtBesucher;
    }

    //besucherzahler Haupt
    public void einlassHaupteingang(int personen){ //zählt die Im Haupteingang eingetrettenen Personen
        this.anzahlHaupt += personen;
    }
    //besucher seite
    public void einlassSeiteneingang(int personen){ //zählt die Im Seiteneingang eingetrettenen Personen
        this.anzahlSeite += personen;
    }

    //aktuelle anzahl
    public int getAnzahl() {
        gesamtBesucher = this.anzahlHaupt + this.anzahlSeite; //Zählt alle besucher zusammen
        return gesamtBesucher;
    }

    public int auslass(int personen){   
        try { 
            int aktuell = getgesamtBesucher();
                    if(personen > aktuell){
            throw new ArithmeticException(
                "Ungültige Anzahl an gehenden Personen"+personen);
        }
            this.gesamtBesucher -= personen;
    } catch(ArithmeticException e) {
        System.out.println("Fehler abgefangen: " + e.getMessage());
    }   
    return getAnzahl();      
    }
}