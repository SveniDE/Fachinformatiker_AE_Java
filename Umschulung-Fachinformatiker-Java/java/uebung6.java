public class uebung6 {
    
public static void main(String[] args) {
    int zahl = 3;
    int zahl1 = 5;

    int ergebnissMA = quadrat(zahl);
    int ergebnissMA1 = quadrat(zahl1);
    int ergebnissMB = summeDerQuadrate(zahl, zahl1);

    System.out.println("Ergebniss der methode1 - zahl: " + ergebnissMA);
    System.out.println("Ergebniss der methode1 - zahl1: " + ergebnissMA1);
    System.out.println("Ergebniss der methode 2: " + ergebnissMB);
}

public static int quadrat(int zahl){
    int ergebnissMA = zahl * zahl;
return ergebnissMA;

}

public static int summeDerQuadrate(int zahl, int zahl1){
 int multi = quadrat(zahl);
 int multi1 = quadrat(zahl1);
    int ergebnissMB  = multi + multi1;

 return ergebnissMB;

    }
}
