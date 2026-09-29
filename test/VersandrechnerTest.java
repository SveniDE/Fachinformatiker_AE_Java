import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Whitebox-Test: Die Testfaelle leiten wir aus dem Code ab.
class VersandrechnerTest {

    // Diese Testfaelle schreiben Sie selbst (Arbeitsauftrag Teil C):
    // C1. Ein Testfall fuer die Anweisungsueberdeckung
    @Test 
    void test0(){
        Versandrechner rechner = new Versandrechner();
        double kosten = rechner.versandkosten(6.0, true);
        assertEquals(12.99, kosten, 0.001);

    }
    // C2. Ein zweiter Testfall, damit auch die Zweigueberdeckung erreicht ist
    @Test
    void test1(){
        Versandrechner rechner1 = new Versandrechner();
        double kosten = rechner1.versandkosten(6.0, false);
        assertEquals(7.99, kosten, 0.001);
        double kosten1 = rechner1.versandkosten(2, false);
        assertEquals(4.99, kosten1, 0.001);
        double kosten2 = rechner1.versandkosten(2, true);
        assertEquals(9.99, kosten2, 0.001);
    }
    @Test 
    void kostenStaffelung(){
        //Kostenfälle   Standartpaket     unter   5kg =     4,99 Euro
        //Kostenfälle   Standartpaket     über    5kg =     7,99 Euro
        //Kostenfälle   Expresspaket      unter   5kg =     4,99 Euro + 5,00 Euro = 9,99Euro
        //Kostenfälle   Expresspaket      über    5kg =     7,99 Euro + 5,00 Euro = 12,99 Euro
        Versandrechner rechner1 = new Versandrechner();
        double kosten0 = rechner1.versandkosten(4.0, false);
        assertEquals(4.99, kosten0, 0.001);
        double kosten1 = rechner1.versandkosten(6, false);
        assertEquals(7.99, kosten1, 0.001);
        double kosten2 = rechner1.versandkosten(2, true);
        assertEquals(9.99, kosten2, 0.001);
        double kosten3 = rechner1.versandkosten(8, true);
        assertEquals(12.99, kosten3, 0.001);
    }

    @Test 
    void Grentwerte(){
        //unterer   Grenzwert     4.99    kg                    =    4.99 Euro
        //          Grenze        5.00    kg                    =    4.99 Euro
        //darüber Grenzwert       5.01    kg                    =    7.99 Euro
        //unterer   Grenzwert     4.99    kg    mit Express     =    9.99 Euro
        //          Grenze        5.00    kg    mit Express     =    9.99 Euro
        //darüber Grenzwert       5.01    kg    mit Express     =   12.99 Euro
        Versandrechner rechner2 = new Versandrechner();
        double kosten = rechner2.versandkosten(4.99, false);
        assertEquals(4.99, kosten, 0.001);
        double kosten1 = rechner2.versandkosten(5.00, false);
        assertEquals(4.99, kosten1, 0.001);
        double kosten2 = rechner2.versandkosten(5.01, false);
        assertEquals(7.99, kosten2, 0.001);
        double kosten3 = rechner2.versandkosten(4.99, true);
        assertEquals(9.99, kosten3, 0.001);
        double kosten4 = rechner2.versandkosten(5.00, true);
        assertEquals(9.99, kosten4, 0.001);
        double kosten5 = rechner2.versandkosten(5.01, true);
        assertEquals(12.99, kosten5, 0.001);
    }

    // C3. Grenzwert: genau 5 kg
    @Test void test2(){
        Versandrechner rechner2 = new Versandrechner();
        double kosten = rechner2.versandkosten(5, false);
        assertEquals(4.99, kosten, 0.001);
    }

    // C4. Grenzwert: knapp ueber 5 kg (5,01 kg)
    @Test 
    void test3(){
        Versandrechner rechner3 = new Versandrechner();
        double kosten = rechner3.versandkosten(4.99, false);
        assertEquals(4.99, kosten, 0.001);
        double kosten1 = rechner3.versandkosten(5.01, false);
        assertEquals(7.99, kosten1, 0.001);
        }





}