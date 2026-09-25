public class LF8_11092026_Java_11_09_1 {
  //------------------------------------------------------------------------
    public static void main(String[] args) {
    //    double stueck = 250;
    //    double preis = 4.80;
        double satz = 1.19;

    double netto_1 = netto_a(250, 4.80);
    double brutto_1 = brutto_a(satz, netto_1);
    System.out.println("Zeile 2 - Netto " + netto_1 + "Brutto: " + brutto_1);

    double netto_2 = netto_a(80, 12.50);
    double brutto_2 = brutto_a(satz, netto_2);
    System.out.println("Zeile 2 - Netto " + netto_2 + "Brutto: " + brutto_2);
    }
//----------------------------------------------------------------------------------
public static double netto_a(double stueck, double preis){
           double netto = stueck * preis;
           return netto;
}
//----------------------------------------------------------------------------------
public static double brutto_a(double satz, double netto){
            double brutto = satz * netto;
            return brutto;
}       
//----------------------------------------------------------------------------------
}
