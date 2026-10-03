public class Elektroartikel extends Artikel {
 
    public Elektroartikel(String artikelnummer, String bezeichnung,
                          double preis, int bestand) {
        super(artikelnummer, bezeichnung, preis, bestand);
    }
 
    @Override
    public String kategorie() {
        return "Elektro";
    }
}