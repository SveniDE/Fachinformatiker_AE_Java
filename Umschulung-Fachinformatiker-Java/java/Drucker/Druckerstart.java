package Drucker;
public class Druckerstart {
    public static void main(String[] args) {

        Drucker drucker1 = new Drucker("INv-123", "Flur");
        //Drucker drucker2 = new Drucker();
        Drucker drucker2 = new Drucker("INV-321");
    drucker1.ausgeben();
    // setter "Standort"
    drucker1.setstandort("Raum 1");
    drucker1.drucken(300);
    drucker1.drucken(-5);
    drucker1.drucken(600);
    drucker1.drucken(200);



    //System.out.println(drucker1);
    
    drucker1.ausgeben();
    drucker2.ausgeben(); 
    // System.out.println("Tonner niedrig?" + drucker1.istTonnerNiedrig());
    // drucker1.tonerWechseln();
    // drucker1.drucken(300);
     drucker2.drucken(50, 10);

    // drucker1.ausgeben();

//    System.out.println("Tonner niedrig?" + drucker1.istTonnerNiedrig() ? ja : nein);
//  punkte += Grossbuchstaben(passwort) ?  1 : 0;  
//    System.out.println("Tonner niedrig? " + (drucker1.istTonnerNiedrig() ? "ja" : "nein"));  
    }
}
