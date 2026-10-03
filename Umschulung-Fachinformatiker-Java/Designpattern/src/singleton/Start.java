package singleton;

public class Start {
    public static void main(String[] args) {
        Datenbank d1 = Datenbank.getInstanz();
        Datenbank d2 = Datenbank.getInstanz();
        System.out.println("Dasselbe Objekt? " + (d1 == d2));
    }
}