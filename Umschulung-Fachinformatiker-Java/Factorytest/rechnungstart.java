
public class rechnungstart {
    public static void main(String[] args){

        int a = 10;
        int b = 5;

        testrechnung rechne = new testrechnung();
        
        System.out.println("Wir rechnen mit der Zahl a=10 und b =5");
    rechne.rechneMinus(a,b);
    rechne.rechnePlus(a,b);
        
    rechne.rechneMal(a,b);
    rechne.rechneDurch(a,b);

    }
}
