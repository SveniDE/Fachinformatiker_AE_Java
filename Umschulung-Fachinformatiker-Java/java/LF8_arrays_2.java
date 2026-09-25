
public class LF8_arrays_2 {

public static void main(String[] args) {
  
    int stueckzahlen[] = {300,420,510,385,450};
    
    int[] messwerte = {29,10,14,37,13};
//----------------------------------------------------------------------
System.out.println("-------------------------------------------------------");
    //Zählschleife
    int summe = 0;
    for (int i=0; i < stueckzahlen.length; i++) {
    System.out.println("index " + i + " : " + stueckzahlen[i] + " summe: " + (summe = summe + stueckzahlen[i]) );
    
        }
        System.out.println("Durchschnitt: " + ( summe / stueckzahlen.length));
//----------------------------------------------------------------------
System.out.println("-------------------------------------------------------");

        // for wert in messwerte
        for (int wert : messwerte) {
            System.out.print(" " + wert);
        }
//----------------------------------------------------------------------
System.out.println();
System.out.println("-------------------------------------------------------");

    //summen
int summe_1 = 0; 

for ( int wert : messwerte){
    summe_1 += wert;
    }
System.out.println("Summe: " + summe_1);

System.out.println("-------------------------------------------------------");





}}