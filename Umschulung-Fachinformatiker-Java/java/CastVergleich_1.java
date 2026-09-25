public class CastVergleich_1 {
    
public static void main(String[] args) {
    // impliziter Cast
int stueckzahl = 300;
double alsKommazahl = stueckzahl;
    System.out.println("int nach double: " + alsKommazahl);

    // explizite Umwandlung

double quelle = 7.9;
int ziel = (int)quelle;

    System.out.println();
    System.out.println("quelle (double) " + quelle);
    System.out.println("ziel (int) "+ ziel);

int zuGrosserWert = 300;
byte alsByte= (byte) zuGrosserWert;

    System.out.println();
    System.out.println("(byte) 300:    " + alsByte);
    System.out.println("Rechnung mit zuGrosserWert " + zuGrosserWert * 2);
    System.out.println("Rechnung mit als Byte " + alsByte *2);
}
}
