//Primitive Datentypen_AUfgabe_1

public class PrimitiveDatentypenAufgabe_1 {

    public static void main(String[] args) {
        int lkm = 64852;                      
        char Werkstatt ='D';                  
        boolean StatAuftrag = false;           
        long anfangzeit = 1788855181000L;
//------------------------------------------------------------------------------------------
    long aktZeit = System.currentTimeMillis();
    long diffzeit = aktZeit - anfangzeit;

    long sekundenGesamt = diffzeit / 1000;
    long stunden = sekundenGesamt / 3600;
    long minuten = (sekundenGesamt % 3600) / 60;

    String lesbareDauer = String.format("%02d:%02d", stunden, minuten);
//-------------------------------------------------------------------------------------------

    System.out.println("|---------------------------------------------------------------------|");
    System.out.println("|--- Reparaturbegleitschein --- |--- Platzhalter aktuelles Datum ---- |");
    System.out.println("|-" + "--------------------------------------------------------------------|");
    System.out.println("|- Laufleistung in KM:" + lkm + " km.                                       |");
    System.out.println("|- Verstrichene Zeit: " + lesbareDauer + " Stunden.                                  |");
    System.out.println("|- Arbeiten ausgeführt von der Werkstatt mit der Kennung: - " + Werkstatt + " -       |");
    //System.out.println("Auftrag mit der Nummer XY fertig? " + StatAuftrag);

    if (StatAuftrag == true){
    System.out.println("|- Ist der Auftrag fertig?  - ja -                                    |");
    } else {
    System.out.println("|- Ist der Auftrag fertig?  - nein -                                  |");
}
System.out.println("|-" + "--------------------------------------------------------------------|");
    }
}