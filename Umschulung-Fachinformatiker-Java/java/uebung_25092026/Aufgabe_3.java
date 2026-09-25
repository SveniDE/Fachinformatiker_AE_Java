public class Aufgabe_3 {
    
    public static void main(String[] args){

       String[] tage = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
       int[] umsatz = {420, 385, 510, 298, 610, 875, 720};
        int umsatzzwischensumme = 0;

       for(int i = 0 ; i < tage.length; i++){
        umsatzzwischensumme += umsatz[i];
        System.out.println(tage[i] + " : " + umsatz[i] + " Euro");
        System.out.println("Zwischensumme: " + umsatzzwischensumme + " Euro");
        }
        int gesamtumsatz = umsatzzwischensumme;
    System.out.println("-----------------------------------------------------");
    System.out.println("Der Wochenumsatz beträgt: " + gesamtumsatz + " Euro");  
    System.out.println("-----------------------------------------------------");

    double durchschnittTagesumsatz = gesamtumsatz / umsatz.length;
    System.out.println("Der durchschnittliche Tagesumsatz beträgt: " + durchschnittTagesumsatz + " Euro");
    System.out.println("-----------------------------------------------------");        

        System.out.println("-----------------------------------------------------");        
        umsatzzwischensumme = 0;
        for (int i = 0; i < umsatz.length; i++){
            double rechnungsdummy = (umsatzzwischensumme += umsatz[i]) / ( i + 1);
            System.out.println("Durchschnittlicher Tagesumsatz: " + rechnungsdummy + " Euro" + " am " + tage[i] + ".");      

        }
        int zähler = 0;
        for( int i = 0; i < tage.length; i++){
            if( umsatz[i] > durchschnittTagesumsatz){
                zähler++;
                }      
            }  
            System.out.println("-----------------------------------------------------");
            System.out.println("Der Umsatz war an " + zähler + ". Tag/en über dem Durchschnitt.");
            System.out.println("-----------------------------------------------------");


    }
}

