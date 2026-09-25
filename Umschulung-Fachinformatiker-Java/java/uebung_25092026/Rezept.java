import java.util.ArrayList;

public class Rezept {
    //Attribute
    private String name;
    private int anzahlPortionen;
    private ArrayList<Zutat> zutaten;

    //Konstruktor
    public Rezept(  String name, 
                    int anzahlPortionen, 
                    ArrayList<Zutat> zutaten){
        this.name = name;
        this.anzahlPortionen = anzahlPortionen;
        this.zutaten = new ArrayList<>();
    }
//getter
    public String getName() {
        return this.name;
    }
    public int getAnzahlPortionen() {
        return this.anzahlPortionen;
    }
    public ArrayList<Zutat> getZutatenListe() {
        return this.zutaten;
    }
//methoden
    public void hinzufuegen(Zutat zutat){
        this.zutaten.add(zutat);
    }
    public void ausgeben(){
        System.out.println("-".repeat(30));
        System.out.println("Rezept: " + this.name + " / " + this.anzahlPortionen + " Portionen");
        System.out.println("Zutaten:");
        for (Zutat zutat : this.zutaten) {
            System.out.println(zutat);
        }
        System.out.println("-".repeat(30));
    }
public boolean enthaelt(String zutatName) {
        for (Zutat z : zutaten) {
            if (z.getName().equalsIgnoreCase(zutatName)) {
                return true;
            }
        }
        return false;
    }

    // 4. Methode: Rechnet alle Zutatenmengen auf eine neue Portionszahl um
    public void umrechnen(int neuePortionen) {
        if (neuePortionen <= 0) {
            System.out.println("Portionen müssen größer als 0 sein!");
            return;
        }

        // Faktor: z. B. 6 / 4 = 1.5
        double faktor = (double) neuePortionen / this.anzahlPortionen;

        for (Zutat z : zutaten) {
            double neueMenge = z.getMenge() * faktor;
            z.setMenge(neueMenge);
        }

        // Portionsanzahl des Rezepts aktualisieren
        this.anzahlPortionen = neuePortionen;
    }

    


    public static void main(String[] args) {
       Rezept Pfannkuchen = new Rezept("Pfannkuchen", 4, new ArrayList<>());
       Pfannkuchen.ausgeben();
 
        Pfannkuchen.hinzufuegen(new Zutat("Mehl", 250, 1));
       Pfannkuchen.hinzufuegen(new Zutat("Milch", 400, 2));
        Pfannkuchen.hinzufuegen(new Zutat("Eier", 3, 3));
        Pfannkuchen.ausgeben();
    // 1. Rezept ausgeben
        Pfannkuchen.ausgeben();

        // 2. Prüfung mit enthaelt()
        System.out.println("Enthält Mehl? " + Pfannkuchen.enthaelt("Mehl"));     // true
        System.out.println("Enthält Zucker? " + Pfannkuchen.enthaelt("Zucker")); // false
        System.out.println();

        // 3. Umrechnen von 4 auf 6 Portionen
        System.out.println("--> Rechne um auf 6 Portionen...\n");
        Pfannkuchen.umrechnen(6);

        // Rezept erneut ausgeben (Mehl ist nun 375 g)
        Pfannkuchen.ausgeben();
    }
}