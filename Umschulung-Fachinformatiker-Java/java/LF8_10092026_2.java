public class LF8_10092026_2 {
    
    public static void main(String[] args) {
        
        double betrag =1000;
        double wachstum = 1.03;
        int endbetrag = 1500;
        //int zwischensumme = betrag;
        int Jahr = 0;

        while(betrag < endbetrag) {
            betrag *= wachstum;
            Jahr++;
            System.out.println("Jahr: " + Jahr + " | Zwischensumme:  " +  String.format("%.2f", betrag) + " in Euro");
            
        }
System.out.println("Anzahl der Jahre ist: " + Jahr);
    }
}
