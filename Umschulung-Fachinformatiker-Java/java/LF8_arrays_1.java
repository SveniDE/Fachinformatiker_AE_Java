import javax.sql.rowset.spi.SyncResolver;

public class LF8_14092026 {

public static void main(String[] args) {
    
    int zahlen[] = {4, 8, 15, 16, 23};

    int durchschnitt =  zahlen[0] + zahlen[1];

    System.out.println(durchschnitt);
    System.out.println(zahlen.length);

    for (int wert : zahlen) {
        System.out.print((wert + " "));

    }
//----------------------------------------------
    int[] stueckzahlen = new int[5];

    System.out.println("Groesse: " + stueckzahlen.length);
    System.out.println("hoechster index: " + (stueckzahlen.length -1));

    stueckzahlen[0] = 300;
    stueckzahlen[1] = 420;
    stueckzahlen[2] = 510;
    stueckzahlen[3] = 385;
    stueckzahlen[4] = 450;

    System.out.println("---------------------------------------------");
    System.out.println("Erste Belegung: " + stueckzahlen[0]);
    System.out.println("letzter Platz:" + stueckzahlen[stueckzahlen.length - 1 ]);


//--------------------------------------------------
    System.out.println("---------------------------------------------");
    int[] messwerte = {29,10,13,37,13};

    System.out.println("Groesse: " + messwerte.length);
    System.out.println("erster Wert: " + messwerte[0]);
    System.err.println("dritter Weert: " + messwerte[2]);
    System.err.println("letzter Werte: " + messwerte[messwerte.length -1]);

//--------------------------------------------------
    System.out.println("---------------------------------------------");

    double[] preise = {12.50,8.90,24.00};

    String[] namen = {"Bauer", "Mueller", "Peter"};

    boolean[] belegt = new boolean[3];

    System.out.println("Preis 1: " + preise[0]);

    System.out.println("Name 2: " + namen[1]);

    System.out.println(("boolean: " + belegt[0]));

 }   
}
