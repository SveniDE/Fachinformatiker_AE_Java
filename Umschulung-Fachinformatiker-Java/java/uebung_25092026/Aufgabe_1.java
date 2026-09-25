public class Aufgabe_1
 {
 
    public static void main(String[] args) {

        int rate = 150;
        int bonus = 25;
        int monat = 0;
        int betrag = 0;

        for (monat = 0; betrag <=2000; betrag += rate) {
            monat += 1;
            System.out.println("Monat: " + monat + " ; " + betrag);
            if ( monat % 6 == 0){
                betrag += bonus;
                System.out.println("Bonus wurde addiert.");
            }
        }
System.out.println("Es dauert " + monat + " Monate bis 2000 Euro erreicht sind.");        
    }
}