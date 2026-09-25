public class Main {
    public static void main(String[] args) {
        // mit "new" wird ein neues echtes Objekt aus dem Bauplan (class) erstellt
        Hund bello = new Hund("Bello",3);
        Hund luna = new Hund("Luna", 5);

        //Methoden aufrufen
        bello.bellen(); //Ausgabe: Bello sagt: Wuff!
        luna.bellen(); //Ausgabe: Luna sagt Wuff!

        System.out.println(bello.getName() + " Ist " + bello.getAlter() + " Jahre alt.") ;

        bello.setAlter(4);
        System.out.println("Neues Alter von " + bello.getName() + ": " + bello.getAlter());
        
    }
    
}
