public class Versandrechner {

    // Standardpaket 4,99 Euro, ueber 5 kg 7,99 Euro.
    // Expressversand kostet 5,00 Euro Aufschlag.
    public double versandkosten(double gewichtKg, boolean express) {
        double kosten = 4.99;
        if (gewichtKg > 5) {
            kosten = 7.99;
        }
        if (express) {
            kosten = kosten + 5.00;
        }
        return kosten;
    }
}
