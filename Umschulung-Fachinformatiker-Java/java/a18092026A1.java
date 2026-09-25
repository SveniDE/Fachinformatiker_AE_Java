public class a18092026A1 {
    
    public static void main(String[] args) {
    
        int[] usedRAM = {17,17,16,18,20,25,33,44,40,52,60,53,33,44,40,52,60,56,33,44,34,28,23,16};
     //   new int[] = {17,17,16,18,20,25,33,44,40,52,60,53,33,44,40,52,60,56,33,44,34,28,23,16};
        int summe=0;
        for (int i = 0; i<usedRAM.length; i++) {
            summe = (summe + usedRAM[i]);
            System.out.println(summe);
            
        }
    int durchschnitt  = summe / usedRAM.length;
            System.out.println(durchschnitt);
    }
}
// schleifenkopf
// for (int i; i < usedRAM.length; i++) { Schleifenrumpf }
//schleifenrumpf
// { summe = summe + usedRAM[i] 
//      durchschnitt = summe / usedRAM.length }
//Auswahl
// if (durschnitt > 75){
//      system.out.println("Warnung- Speicherauslastung nicht OK"
//       } else { system.out.println("Speicherauslastung - OK")}