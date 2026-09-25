//-------------------------------------------------------------------------------------------------------
public class Werkzeug_1 {

    //Attribute
    private String bezeichnung;
    private String inventarnummer;
    private int ausleihtage;

public Werkzeug_1(  String bezeichnung,
                    String inventarnummer,
                    int ausleihtage){
                        this.bezeichnung    = bezeichnung;
                        this.inventarnummer = inventarnummer;
                        this.ausleihtage    = 0;
                    }
                    

public String getbezeichnung(){
   return this.bezeichnung;
}
public String getinventarnummer(){
    return this.inventarnummer;
}
public int getausleihtage(){
    return this.ausleihtage;
}

public void ausleihen(int tage){
    ausleihtage = this.ausleihtage + tage;
    if (tage <= 0){
        System.out.println("Ungültige Eingabe der Tage.");
    }else{
    System.out.println("Tage: " + ausleihtage);
    }
}
@Override
public String toString() {
    return this.bezeichnung + " ; " + this.inventarnummer + " ; " + this.ausleihtage;
}

public static void main(String[] args) {
    System.out.println("-".repeat(50));
    Werkzeug_1 werkzeug_a = new Werkzeug_1( "HAmmer",
                                            "HA001", 
                                            5);
    System.out.println(werkzeug_a.toString());
    System.out.println(werkzeug_a.ausleihtage);
    werkzeug_a.ausleihen(5);
    System.out.println(werkzeug_a.ausleihtage);
    System.out.println("-".repeat(50));
    
}
}
