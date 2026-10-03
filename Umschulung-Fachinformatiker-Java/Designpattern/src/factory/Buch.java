public class Buch extends Artikel {
 
    public Buch(String artikelnummer, String bezeichnung,
                double preis, int bestand) {
        super(artikelnummer, bezeichnung, preis, bestand);
    }
 
    @Override
    public String kategorie() {
        return "Buch";
    }
}
 