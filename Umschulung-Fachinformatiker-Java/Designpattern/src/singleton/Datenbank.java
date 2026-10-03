package singleton;
public class Datenbank {

    private static Datenbank instanz;
 
    private Datenbank() {
        System.out.println("Verbindung zur Datenbank wird aufgebaut");
    }
    public static Datenbank getInstanz(){
        if(instanz == null){
            instanz = new Datenbank();
        }
        return instanz;
}
}
 
