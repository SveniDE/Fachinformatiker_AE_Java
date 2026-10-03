package museum;

public class start11 {
    package museum;

public class Start {
    public static void main(String[] args){
        //den haupt und nebeneingang als variableObjekt anlegen
        Besucherzaehler haupteingang = Besucherzaehler.getInstanz();
        Besucherzaehler seiteneingang = Besucherzaehler.getInstanz();
    int haupt = 0;
    int seite = 0;


        if (haupteingang.einlass() > 0 ){

        }




    //besucher hereinlassen
    haupteingang.einlass(3);
    seiteneingang.einlass(2);

    //ausgabe
    System.out.println("Es befinden sich im Museum: " + haupteingang.getAnzahl());

    System.out.println("Gleiches? " + (haupteingang == seiteneingang));
    
    
    }
    
}
}
