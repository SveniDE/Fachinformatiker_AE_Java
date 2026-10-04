
public interface testInterface {
    //interface beinahltet nur methoden die in anderen Objekten benutzt werden können.
    
   default int rechnePlus(int a, int b){
            int ergebnissPlus = a + b;
            System.out.println("Das PLUS Ergebniss ist: " + a +" + " + b + " = " + ergebnissPlus);
            return ergebnissPlus;
        }

    default int rechneMinus(int a, int b){
            int ergebnissMinus = a - b;
            System.out.println("Das Minus Ergebniss ist: " + a + " - " + b + " = " + ergebnissMinus);
            return ergebnissMinus;
        }
}
