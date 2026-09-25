public class uebung_1 {
public static void main(String[] args) {
    
int breit = 2;
int laenge = 5;
System.out.println("----------------------");
System.out.println("Die Länge ist: " + laenge);
System.out.println("Die Breite ist: " + breit);
System.out.println("-----------------------------");
plus(50, 20);
plus(breit, laenge);
System.out.println("-------------------------------");
System.out.println("Fläsche = " + flaesche(breit,laenge));
}
public static void plus(int breite, int laenge){
    int summe = breite + laenge;
    System.out.println("Die Summe aus Länge und Breite ist: " + summe);
}
 public static int flaesche(int breite, int hoehe){
        int flaesche = breite * hoehe;
        return flaesche;

    }
}
