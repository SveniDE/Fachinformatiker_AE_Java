import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Unit-Test: Wir pruefen die Klasse Kaffeemaschine ganz allein.
class KaffeemaschineTest {

    // test: Laeuft er gruen, ist JUnit richtig eingerichtet.
    @Test
    void neueMaschineIstLeer() {
        Kaffeemaschine k = new Kaffeemaschine("Test");

        assertEquals(0, k.getWasser());}


        @Test void wasser1mlwirdAngenommen(){

            Kaffeemaschine k = new Kaffeemaschine("Test");

            boolean ergebniss = k.wasserAuffuellen(1);

            assertTrue(ergebniss);
            assertEquals(1, k.getWasser());
            }

        @Test void wasserannehmen1500(){
            Kaffeemaschine k = new Kaffeemaschine("Test");
            boolean ergebniss = k.wasserAuffuellen(1500);
            assertTrue(ergebniss);
            assertEquals(1500, k.getWasser());
        }
        @Test void wasserannehmen1501(){
            Kaffeemaschine k1 = new Kaffeemaschine("Test1");
            boolean ergebniss1 = k1.wasserAuffuellen(1501);
            assertFalse(ergebniss1);
            assertEquals(0, k1.getWasser());
        }
        @Test void wasserAnnehmen0(){
            Kaffeemaschine k2 = new Kaffeemaschine("test2");
            boolean ergebniss2 = k2.wasserAuffuellen(0);
            assertFalse(ergebniss2);
            assertEquals(0, k2.getWasser());
            // ich kann aber nicht erkennen welche Fehlermeldung 
            // das ausgeben würde
        }
        @Test void tankueberfuellen0(){
            Kaffeemaschine k3 = new Kaffeemaschine("test3");
            boolean ergebniss3 = k3.wasserAuffuellen(1000);
            assertTrue(ergebniss3);
            assertEquals(1000, k3.getWasser());
            boolean ergebniss31 = k3.wasserAuffuellen(600);
            assertFalse(ergebniss31);
            assertEquals(1000, k3.getWasser());
        }
        @Test void kaffeeKochen0(){
            Kaffeemaschine k4 = new Kaffeemaschine("test4");
            k4.wasserAuffuellen(1000);
            k4.bohnenAuffuellen(100);
            int aktuelleTassen = k4.getTassen();
            boolean ergebniss4 = k4.kaffeeKochen();
            assertTrue(ergebniss4);
            assertEquals(800, k4.getWasser());
            assertEquals(85, k4.getBohnen());
            assertEquals(aktuelleTassen +1, k4.getTassen());
        }
        @Test void kaffeeKochen1(){
            Kaffeemaschine k5 = new Kaffeemaschine("test5");
            k5.wasserAuffuellen(200);
            k5.bohnenAuffuellen(15);
            int aktuelleTassen = k5.getTassen();
            boolean ergebniss5 = k5.kaffeeKochen();
            assertTrue(ergebniss5);
            assertEquals(0, k5.getWasser());
            assertEquals(0, k5.getBohnen());
            assertEquals(aktuelleTassen +1, k5.getTassen());
        }

    }
