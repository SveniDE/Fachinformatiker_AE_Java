
public class testrechnung implements testInterface {
    
        public int rechneMal(int a, int b){
            int ergebnissMal = a * b;
            System.out.println("Das MAL Ergebniss ist: " + a + " * " + b + " = "  + ergebnissMal);
            return ergebnissMal;
    }
    
        public int rechneDurch(int a, int b){
            int ergebnissDurch = a / b;
            System.out.println("Das DURCH Ergebniss ist: "  + a + " / " + b + " = "  + ergebnissDurch);
            return ergebnissDurch;
        }
}
