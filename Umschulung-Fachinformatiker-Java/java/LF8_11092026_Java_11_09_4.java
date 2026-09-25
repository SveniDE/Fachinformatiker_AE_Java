import java.util.Scanner;

public class LF8_11092026_Java_11_09_4 {
    
//------------------------
    public static void main(String[] args) {

Scanner eingabe = new Scanner(System.in);

System.out.println("Nennen Sie den Preis: ");
        double preis = eingabe.nextDouble();

System.out.println("Nennen sie die Menge");
        double menge = eingabe.nextDouble();
    
    double gesamt = rechnung(preis,menge);
    double versand = 4.95;
    
    System.out.println("Der Wert beträgt: " + gesamt);
    
    if(gesamt > 50){
        System.out.println("Versand frei");
        System.out.println("Der zu zahlende Betrag: " + gesamt);
    } else {
        System.out.println("Der Versand beträgt: " + versand);
        System.out.println("Der zu zahlende Betrag:" + (gesamt +versand));
    }
eingabe.close();
    }    

public static double rechnung(double preis, double menge){
    return preis * menge;
    }
}
