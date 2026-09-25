public class undOder {

    public static void main(String[] args) {

beispielUnd();
System.out.println("-----------------------------------------------");
beispielOder();

}

public static void beispielUnd() {

boolean ticketGueltig = true;
boolean bezahlt = false;

if (ticketGueltig && bezahlt) 
    {
    System.out.println("Schranke öffnet sich");
    }
    else 
        {
         System.out.println("Schranke bleibt zu!");
        }    

boolean a = true;
boolean b = true;

System.out.println();
System.out.println("true && true = " + (a && b));

b = false;
System.out.println("true && false = " + (a && b));

}

public static void beispielOder() {

final double ERTEMPERATUR = 60.0;

boolean rauchErkannt = false;
double temperatur = 70.5;

if (rauchErkannt || temperatur > ERTEMPERATUR) {

    System.out.println("Warnung!");
} else {
    System.out.println("All es in Ordnung");
        }
}
}
