public class Werkzeugkasten_1 {
    
    //Attribute
    private String besitzer;
    private int festeAnzahlPlaetze;
    private int inhalt;                 
    private Werkzeug_1[] werkzeuge;

    public Werkzeugkasten_1(    String besitzer,
                                int festeAnzahlPlaetze
                            ){
                                    this.besitzer = besitzer;
                                    this.festeAnzahlPlaetze = 10;
                                    this.inhalt = 5;
                                    this.werkzeuge = new Werkzeug_1[festeAnzahlPlaetze];
                                }

    public String getbesitzer(){
        return this.besitzer;
    }
    public int festeAnzahlPlaetze(){
        return this.festeAnzahlPlaetze;
    }
    public int getinhalt(){
        return this.inhalt;
}
    // public int inhalt(){
    //     return this.inhalt;
    // }

// public void entnehmen(int anzahl){
//     System.out.println("Im Werkzeugkasten befinden sich " + inhalt +  " Werkzeuge.");
//     if (inhalt + anzahl >= festeAnzahlPlaetze ) {
//         inhalt = inhalt + anzahl;
//         System.out.println("Im Werkzeugkasten befinden sich " + inhalt +  " Werkzeuge.");
//         System.out.println("Der Werkzeugkasten ist voll!");
//     }else if (inhalt - anzahl <= 0) {
//         inhalt = inhalt + anzahl;
//         System.out.println("Im Werkzeugkasten befinden sich: " + inhalt + " Werkzeuge.");
//         System.out.println("Der Werkzeugkasten ist leer!"); 
        
//     } else { 
//         inhalt = inhalt + anzahl;
//         System.out.println("Es wurden " + anzahl + " Werkzeuge aus dem Kasten genommen.");
//        System.out.println("Im Werkzeugkasten befinden sich " + inhalt +  " Werkzeuge.");
// }
//}

public void hinzufügen(Werkzeug_1 neueswerkzeug){
    if (this.festeAnzahlPlaetze >= this.werkzeuge.length){
        System.out.println("Fehler: Der Kasten ist voll!");
        return ;
    }
    this.werkzeuge[this.inhalt] = neueswerkzeuge;
    this.inhalt = this.inhalt +1; 

}




public static void main(String[] args) {
    Werkzeugkasten_1 werkzeugkasten_a =  new Werkzeugkasten_1("Hugo", 0, 5);

    werkzeugkasten_a.hinzufügen(2);

}

}
