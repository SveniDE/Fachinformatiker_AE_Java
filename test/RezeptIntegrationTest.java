import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Integrationstest: Wir pruefen, ob Rezept und Zutat richtig ZUSAMMEN arbeiten.
// Dafuer benutzen wir echte Objekte beider Klassen.
class RezeptIntegrationTest {
    // @Test
    // void umrechnen(){
    //     Rezept rezept = new Rezept("kuchen", 4);
    //     rezept.addZutat(new Zutat("Mehl", 200, "g"));

    //     assertEquals(4, rezept.getPortionen());
    //     rezept.umrechnen(6);
    //     assertEquals(6, rezept.getPortionen());
    //}
     @Test
    void umrechnenSetztNeuePortionszahl() {
 
        Zutat mehl = new Zutat("Mehl", 250, "g");
        Zutat eier = new Zutat("Eier", 2, "Stueck");
 
        Rezept r = new Rezept("Pfannkuchen", 4);
 
        r.hinzufuegen(eier);
        r.hinzufuegen(mehl);
 
        r.umrechnen(6);
}
    @Test
    void portionszahlAendern(){
        Rezept r = new Rezept("Pfannkuchen", 4);
        r.umrechnen(6);
        assertEquals(6, r.getPortionen());
    }  
    
    @Test void umrechnenAendertDieMengeDerZutaten()
    {
        Zutat mehl = new Zutat("Mehl", 250, "g");
        Zutat eier = new Zutat("Eier", 2, "Stueck");
        Rezept r = new Rezept("Pfannkuchen", 4);
        r.hinzufuegen(eier);
        r.hinzufuegen(mehl);

        r.umrechnen(6);

        assertEquals(375.0 , mehl.getMenge(), 0.001);
        assertEquals(3, eier.getMenge(), 0.001);

    }

    @Test void umrechnenNewPortion6()
    {
        Zutat mehl = new Zutat("Mehl", 250, "g");
        Zutat eier = new Zutat("Eier", 2, "Stueck");
        Rezept r = new Rezept("Pfannkuchen", 4);
        r.hinzufuegen(eier);
        r.hinzufuegen(mehl);

        r.umrechnen(6);
        boolean port6 = r.getPortionen() == 6;
        assertTrue(port6);
    }


    @Test void umrechnenNewPortion2()
    {
        Zutat mehl = new Zutat("Mehl", 250, "g");
        Zutat eier = new Zutat("Eier", 2, "Stueck");
        Rezept r = new Rezept("Pfannkuchen", 4);
        r.hinzufuegen(eier);
        r.hinzufuegen(mehl);

        r.umrechnen(6);
        boolean port6 = r.getPortionen() == 6;
        assertTrue(port6);

        r.umrechnen(2);
        assertEquals(125, mehl.getMenge(),0.001);
        assertEquals(1, eier.getMenge(), 0.001);
    }

    @Test void enthaeltTest()
    {
        Zutat mehl = new Zutat("Mehl", 250, "g");
        Zutat eier = new Zutat("Eier", 2, "Stueck");
        Rezept r = new Rezept("Pfannkuchen", 4);
        r.hinzufuegen(eier);
        r.hinzufuegen(mehl);

        boolean enthaeltMehl = r.enthaelt("Mehl");
        boolean enthaeltnichtMilch = r.enthaelt("Milch");

        assertTrue(enthaeltMehl);
        assertFalse(enthaeltnichtMilch);

    }
  
}

 




