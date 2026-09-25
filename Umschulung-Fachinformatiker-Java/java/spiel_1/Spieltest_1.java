package spiel_1;

public class Spieltest_1 {
    
    public static void main(String[] args) {
        
    spieler_1 spieler_11 = new spieler_1(   "Hugo",
                                            200,
                                            10,
                                            500,
                                            100);

    //Abfragen

        spieler_11.spielerAbfrage();


    spieler_11.schadenNehmen(50);

    spieler_11.heilen(40);
    spieler_11.heilen();
    spieler_11.schadenNehmen(50);
    
    spieler_11.goldSammeln(50);
    spieler_11.trankKaufen();

        spieler_11.spielerAbfrage();


    }
}
