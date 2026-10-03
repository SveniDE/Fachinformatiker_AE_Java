package Werkstatt;

public class Werkstattverwaltung {
    
    public static void main(String[] args){

                
        Mitarbeiter mitarbeiter1 = new Mitarbeiter(     "A1",
                                                        "Hans",
                                                        "Müller",
                                                        "Ansetzter");

        werkzeug kasten1 = new werkzeug(    "WK-01",
                                            "Knarrenkasten 1/2 und 1/4 Zoll",
                                            "Halle 1 - Regal A",
                                            "KFZ-Mechanik / Verschraubungen",
                                            null);
        werkzeug kasten2 = new werkzeug(    "WK-02",
                                            "Elektrik-Prüfkoffer",
                                            "Diagnoseplatz 2",
                                            "Multimeter, Stromzange, Prüfspitzen",
                                            null);
        werkzeug kasten3 = new werkzeug(    "WK-03",
                                            "Ausbeul- und Karosseriesatz",
                                            "Halle 2 - Schrank C",
                                            "Blechbearbeitung, Karosserieinstandsetzung",
                                            null);
        werkzeug kasten4 = new werkzeug(    "WK-04",
                                            "Bremsen- und Fahrwerkssatz",
                                            "Hebebühne 3",
                                            "Bremskolbenrücksteller, Federspanner",
                                            null);
        werkzeug kasten5 = new werkzeug(    "WK-05",
                                            "VDE-Hochvolt-Isolierkoffer",
                                            "Sicherheitsbereich HV",
                                            "Arbeiten an Elektro- und Hybridfahrzeugen (bis 1000V)",
                                            null);

        
        System.out.println("|" + "-".repeat(30) + "|");
        System.out.println("|   --- werkzeug---            |");
        //System.out.println("|" + "-".repeat(30) + "|");
        System.out.println("-".repeat(108));
        System.out.println(werkzeug_1);
        System.out.println("-".repeat(108));                             
        System.out.println();
        System.out.println("|" + "-".repeat(20) + "|");
        System.out.println( "|--- Mitarbeiter --- |");
        //System.out.println("|" + "-".repeat(20) + "|");
        System.out.println("-".repeat(79));
        System.out.println(mitarbeiter1);
        System.out.println("-".repeat(79));
    }
}
