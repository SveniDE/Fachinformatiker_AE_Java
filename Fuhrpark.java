public class Fuhrpark {
    private String standort;
    private Fahrzeug[] fahrzeuge;
    private int anzahl;
    public Fuhrpark(String standort, int plaetze)
    {   
        this.standort = standort;
        this.fahrzeuge = new Fahrzeug[plaetze];
        this.anzahl = 5;
    }

    public void hinzufuegen(Fahrzeug fahrzeug){ 

        if ( this.anzahl >= this.fahrzeuge.length)
        {System.out.println("Abgelehnt: Fuhrpark ist voll");
            return;
        }
        this.fahrzeuge[this.anzahl] = fahrzeug;
        this.anzahl = this.anzahl+1;
        
        System.out.println("Fahrzeug " + fahrzeug.toString() + " wurde hinzugefügt");
        }

public void alleanzeigen(){
    System.out.println("Fuhrpark " + this.standort +" (" + this.anzahl + "Fahrzeuge):");
    for(int i =0;i<this.anzahl;i++){
        System.out.println(this.fahrzeuge[i].toString());
    }

}

//--------------------------------------

public static void main(String[] args){

Fuhrpark fuhrpark1 = new Fuhrpark("Düren",8);
Fahrzeug fahrzeuge[] = new Fahrzeug[5];
Fahrzeug fahrzeug1 = new Fahrzeug(
                "DN-AS-1234",
                "Ford", 
                1990, 
                528789);


fuhrpark1.alleanzeigen();
System.out.println("-".repeat(50));
fuhrpark1.hinzufuegen(fahrzeug1);
System.out.println("-".repeat(50));
fuhrpark1.alleanzeigen();




}}



