package museum;

public class Start {
    public static void main(String[] args){
        //den haupt und nebeneingang als variableObjekt anlegen
        Besucherzaehler haupteingang = Besucherzaehler.getInstanz();
        Besucherzaehler seiteneingang = Besucherzaehler.getInstanz();
    
    //besucher hereinlassen
    haupteingang.einlassHaupteingang(3);
    seiteneingang.einlassSeiteneingang(2);

    //ausgabe
        System.out.println("Über Haupteingang: " + haupteingang.getAnzahlHaupt());
        System.out.println("Über Seiteneingang: " + seiteneingang.getAnzahlSeite());
        System.out.println("Im Museum gesamt: " + haupteingang.getAnzahl());


        System.out.println("Gleiches? " + (haupteingang == seiteneingang));
        System.out.println("-".repeat(30));
        
        //4Personen rein
        haupteingang.einlassHaupteingang(4);

        //besucher gehen lassen
        haupteingang.auslass(1);

        //10Besucher raus
        haupteingang.auslass(10);



        System.out.println("Im Museum befinden sich: " + haupteingang.getgesamtBesucher());

    }
    
}
