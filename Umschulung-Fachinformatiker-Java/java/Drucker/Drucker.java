package Drucker;
// eine leere Klasse, davon lässt sich aber schon ein Objekt erzeugen.
public class Drucker {
    //Attribute
    private String  inventarnummer;
    private String  standort;
    private double  tonnerProzent;
    private int     gedruckteseiten;

    //Konstrukor
    public Drucker(String inventarnummer, String standort) {
        this.inventarnummer = inventarnummer;
        this.standort = standort;
        this.tonnerProzent  =100;
        this.gedruckteseiten= 0;
    }
public Drucker(String inventarnummer) {
        this.inventarnummer = inventarnummer;
        this.standort = "Nicht zugewiesen";
        this.tonnerProzent  =100;
        this.gedruckteseiten= 0;
    }

    // Setter

    public void setstandort(String neuerStandort) {
            this.standort = neuerStandort;
    }

    
    //getter
    public String getStandort() {
        return this.standort;
    }

    public double gettonnerProzent(){
        return this.tonnerProzent;
    }

    public int gedruckteseiten(){
        return this.gedruckteseiten;
    }

    //Methode
    public void ausgeben() {
        System.out.println("-".repeat(30 ));
        System.out.println( inventarnummer + " / " + standort + " / "
                            + tonnerProzent + " % " + " / "
                            + gedruckteseiten + " Seiten");      
    }
    // 10 Seiten drucken, ziehen 1 % vom Toner ab
    public void drucken(int seiten) {
        if (seiten <= 0) {
            System.out.println("Abgelehnt " + seiten + "Seiten ist kein gueltiger Wert");
            return;
        }
        double verbrauch = seiten / 10.0;
        if (verbrauch > this.tonnerProzent) {
            System.out.println("Abgelehnt Tonerstand nicht hoch genug!");
        return;
        }
        this.gedruckteseiten = this.gedruckteseiten + seiten;
        this.tonnerProzent = this.tonnerProzent - verbrauch;
    }
    public  void drucken(int seiten, int exemplare){
    if (exemplare <= 0) {
        System.out.println("Abgelehnt: " + exemplare + "nicht gültig!");
        return;
        }
        drucken(seiten * exemplare);
    }



    public void tonerWechseln () {
        this.tonnerProzent = 100;
        System.out.println(this.inventarnummer + ": Toner gewechselt");
        }
    public boolean istTonnerNiedrig() {
        return this.tonnerProzent < 20;
    }

    }

