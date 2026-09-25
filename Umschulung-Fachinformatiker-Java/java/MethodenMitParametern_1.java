public class MethodenMitParametern_1 {
    
    public static void main(String[] args) {
        
        int zeit = 800;

    zeigeWartungsstufe(zeit);

    zeigeWartungsstufe(400);
    
    }

public static void zeigeWartungsstufe(int stunden){
    // int stunden ist der Parameter
    // der Wert beim Aufruf ist das Argument
    System.out.print(stunden + " Stunden ");

    if (stunden < 250) {
        System.out.println(" = Keine Wartung!");
    } else if (stunden < 750) { 
        System.out.println(" = Sichtprüfung!");
    } else {
        System.out.println(" = große Wartung!");
    }




}
}
