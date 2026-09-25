//Primitive Datentypen

public class PrimitiveDatentypen {

    public static void main(String[] args) {
        byte kleineZahle = 100;                     //8 bit, -128 bis 127
        short mittlereZahl = 30000;                 // 16bit, 32768 bis 32767
        int stueckzahl = 500;                       // 32 bit, standart
        long Zeitstempel = 17890000000L;             // 64 bit, "L" nicht vergessen

        float kleinereKommzahl = 7.5f;              // 32 bit, Suffix "f"
        double gewicht = 55.50;                     // 64bit, Standard

        char Buchstabe ='M';                        //einfache Hochkomma
        boolean anlageLaeuft = true;                //Wahrheitswert true oder false

        System.out.println("byte: " + kleineZahle);
        System.out.println("short: " + mittlereZahl);
        System.out.println("int: " + stueckzahl);
        System.out.println("long: " + Zeitstempel);
        System.out.println("float: " + kleinereKommzahl);
        System.out.println("double: " + gewicht);
        System.out.println("char: " + Buchstabe);
        System.out.println("boolean: " + anlageLaeuft);
    
        System.out.println(kleineZahle + mittlereZahl);
        

    }
}