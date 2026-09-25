import java.util.Scanner;

public class LF8_15092026_Passwort {
    
// Anfang main ------------------------------
    public static void main(String[] args) {
    
// Scanner --------------------------------
    Scanner scan = new Scanner(System.in);

    System.out.print("Passwort: ");
    String passwort =scan.nextLine();
    //System.out.println("Passwort: " + passwort);
// Ende Scanner ------------------------------

    //   String passwort= "Wifa_Java_LF8";
        boolean laenge = false;
    //    boolean gross = false;
            int zaehlerpw = 0;
            for(int i = 0; i < passwort.length(); i++){
                zaehlerpw++;
                if (zaehlerpw > 10){
                    laenge = true;
                } else {
                    laenge = false;
                }
            }

        System.out.println("---------------------------------");
        System.out.println("Länge: " + laenge);
        System.out.println("Gross: " + Grossbuchstaben(passwort));
        System.out.println("klein: " + kleinbuchstaben(passwort));
        System.out.println("ziffern: " + ziffern(passwort));
        System.out.println("Sonderzeichen: " + sonderzeichen(passwort));
        System.out.println("leerzeichen: " + leerzeichen(passwort));
        System.out.println("----------------------------------");

// // --------------------------------------------------------------
//         int zahler = 0;
//         if (Grossbuchstaben(passwort) == true){
//             zahler++;
//         }else if (kleinbuchstaben(passwort) == true){
//             zahler++;
//         }else if (ziffern(passwort) == true){
//             zahler++;
//         } else if (sonderzeichen(passwort) == true) {
//             zahler++;
//         } else if (zaehlerpw > 10) {
//             zahler++;
//         }
//         System.out.println(" Zähler: " + zahler);
        
            int punkte = 0;
            punkte += Grossbuchstaben(passwort) ?  1 : 0;
            punkte += kleinbuchstaben(passwort) ?  1 : 0;
            punkte += ziffern(passwort) ?  1 : 0;
            punkte += sonderzeichen(passwort) ?  1 : 0;
            punkte += laenge ?  1 : 0;

            System.out.println("Punktestand: " + punkte);
    }
// ende main ---------------------------------
// anfang grossbucgstaben------------------------------------------
public static boolean Grossbuchstaben(String passwort) {
    //int zaehler = 0;
    if (passwort == null) {
        return false;
    }

    for ( int i = 0; i < passwort.length(); i++){
        char c = passwort.charAt(i);
        if (Character.isUpperCase(c)) {
            return true;
            }
        } 
        return false;
    }
// ende grossbuchstaben ------------------------------------------
// anfang kleinbuchstaben------------------------------------------
public static boolean kleinbuchstaben(String passwort) {
    if (passwort == null) {
        return false;
    }

    for ( int i = 0; i < passwort.length(); i++){
        char c = passwort.charAt(i);
        if (Character.isLowerCase(c)) {
            return true;
            }
        } 
        return false;
    }
// ende kleinbuchstaben------------------------------------------
// anfang ziffern------------------------------------------
public static boolean ziffern(String passwort) {
    if (passwort == null) {
        return false;
    }

    for ( int i = 0; i < passwort.length(); i++){
        char c = passwort.charAt(i);
        if (Character.isDigit(c)) {
            return true;
            }
        } 
        return false;
    }
// ende ziffern------------------------------------------
// anfang leerzeichen------------------------------------------
public static boolean leerzeichen(String passwort) {
    if (passwort == null) {
        return false;
    }

    for ( int i = 0; i < passwort.length(); i++){
        char c = passwort.charAt(i);
        if (Character.isWhitespace(c)) {
            return true;
            }
        } 
        return false;
    }
// ende leerzeichen------------------------------------------
// anfang sonderzeichen------------------------------------------
public static boolean sonderzeichen(String passwort) {
    if (passwort == null) {
        return false;
    }
    String sonderzeichen = "!?#$%&*+-_.,;:";

    for ( int i = 0; i < passwort.length(); i++){
        char c = passwort.charAt(i);
        if (sonderzeichen.indexOf(c) != -1) {
            return true;
            }
        } 
        return false;
    }
// ende sonderzeichen------------------------------------------
} // Ende------------------------------------------



