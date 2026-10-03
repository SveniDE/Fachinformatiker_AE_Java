public abstract class Artikel {
 
    private String artikelnummer;
    private String bezeichnung;
    private double preis;
    private int bestand;
 
    public Artikel(String artikelnummer, String bezeichnung,
                   double preis, int bestand) {
        this.artikelnummer = artikelnummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.bestand = bestand;
    }
 
    public String getArtikelnummer() {
        return this.artikelnummer;
    }
 
    public String getBezeichnung() {
        return this.bezeichnung;
    }
 
    public double getPreis() {
        return this.preis;
    }
 
    public int getBestand() {
        return this.bestand;
    }
 
    public void setBestand(int bestand) {
        if (bestand < 0) {
            throw new IllegalArgumentException("Bestand darf nicht negativ sein");
        }
        this.bestand = bestand;
    }
 
    public abstract String kategorie();
 
    @Override
    public String toString() {
        return this.artikelnummer + " " + this.bezeichnung + " [" + kategorie() + "], "
                + this.bestand + " Stk";
    }
}
 
 