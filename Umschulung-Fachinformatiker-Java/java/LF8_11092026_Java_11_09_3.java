import java.util.Scanner;

public class LF8_11092026_Java_11_09_3 {
    

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        double summe = 0.0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Preis für Artikel " + i + " eingeben: ");
            summe += scanner.nextDouble();
            System.out.println("Zwischensumme: " + summe);
        }
//------------------------------------------------
System.out.println("Art wählen:");
        System.out.println("1 = Bar");
        System.out.println("2 = Karte");
        System.out.print("auswahlahl: ");
        int art = scanner.nextInt();
//--------------------------------------------------
double rabatt = 0.0;
        switch (art) {
            case 1:
                rabatt = 3.0;
                break;
            case 2:
                rabatt = 0.0;
                break;
            default:
                rabatt = 0.0;
                System.out.println("Hinweis: ... ... ...");
                break;
        }
//------------------------------------------------------------
double endbetrag = berechneEndbetrag(summe, rabatt);

System.out.println("\n--- Abrechnung ---");
        System.out.printf("Zwischensumme: " + summe);
        System.out.printf("Rabatt: " + rabatt);
        System.out.printf("Endbetrag: " +  endbetrag);

        if (summe > 100.0) {
            System.out.println("Hinweis: Einkaufswert = über 100 €!");
        }

        scanner.close();
    }
    
public static double berechneEndbetrag(double summe, double rabatt) {
        double rabattBetrag = summe * (rabatt / 100.0);
        return summe - rabattBetrag;

    }
    }
