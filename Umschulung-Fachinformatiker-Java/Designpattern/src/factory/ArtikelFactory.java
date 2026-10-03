public class ArtikelFactory {
    
    private static int laufendeNummer = 1;

    public static Artikel erzeugen(String art, String bezeichnung, double preis, int bestand){

        Artikel neu;
        if(art.equals("buch")){
            neu = new Buch("B-" + laufendeNummer, bezeichnung, preis, bestand);
        } else if (art.equals("elektro")){
            neu = new Elektroartikel("E-" + laufendeNummer, bezeichnung, preis, bestand);
        }
        else{
                throw new IllegalArgumentException("Unbekannte Artikelart: " + art);
        }
        laufendeNummer = laufendeNummer +1;
        return neu;
        }
}

