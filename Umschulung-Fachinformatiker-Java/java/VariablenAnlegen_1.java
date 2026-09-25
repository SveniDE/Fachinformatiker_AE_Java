public class VariablenAnlegen_1 {
public static void main(String[] args) {
    
final double MWST_SATZ = 0.19;

    int bestellnummer = 2010;
    String titel = "Java ueben";
    int stueckzahl = 3;
    double einzelpreis = 24.99;
    char kategorie = 'F';
    boolean lieferung = true;

    double netto = stueckzahl * einzelpreis;
    double steuer = netto * MWST_SATZ;
    double brutto = netto + steuer;

    System.out.println("BEstellung " + bestellnummer );
    System.out.println("Titel: " + titel);
    System.out.println("Kategorie: " + kategorie);
    System.out.println("Stueckzahl: " + stueckzahl);
    System.out.println("Einzelpreis: " + einzelpreis);
    System.out.println("Lieferung: " + lieferung);
    System.out.println("Netto: " + netto);
    System.out.println("19 % MwSt: " + steuer + " Euro");
    System.out.println("Brutto: " + brutto + " Euro");
}   
}
