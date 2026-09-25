package auto;

public class auto {
    
    //Attribute
    private int Baujahr;
    private int km;
    private String Marke;
    private String Farbe;
    private boolean aufbereitung;
    private double tankFuellung;
    private double verbrauchPro100Km;

// Start Konstuktor -------------------------------------------
// Daten werden beim erzeugen des Objekts eingelesen-----------
public auto(    int Baujahr, 
                int km, 
                String Marke, 
                String Farbe, 
                boolean aufbereitung, 
                double tankFuellung, 
                double verbrauchPro100Km){

    this.Baujahr        = Baujahr;
    this.km             = km;
    this.Marke          = Marke;
    this.Farbe          = Farbe;
    this.aufbereitung   = aufbereitung;
    this.tankFuellung      = tankFuellung;
    this.verbrauchPro100Km = verbrauchPro100Km;
}
// Ende Konstuktor ------------------------------------

//Start Setter---------------------------------------
// sind die schnittstellen um werte später noch verändern zu können.

public void Baujahr(int Baujahr) {
    this.Baujahr = Baujahr;
}
public void km(int km) {
    this.km = km;
}
public void Marke(String Marke) {
    this.Marke = Marke;
}
public void Farbe(String Farbe){
    this.Farbe = Farbe;
}
public void aufbereitung(boolean aufbereitung){
    this.aufbereitung = aufbereitung;
}
// Ende Setter

//Start Getter -------------------------------------
//das sind die Daten die später von einem anderen Programm gelesen werden können
// deffinieren "sichtbarer Daten"
public int getBaujahr(){
    return this.Baujahr;
}
public int getkm(){
    return this.km;
}
public String getMarke(){
    return this.Marke;
}
public String getFarbe(){
    return this.Farbe;
}
public boolean getaufbereitung(){
    return this.aufbereitung;
}
// Ende Getter -------------------------------------

//Start Methode -------------------------------------
public void ausgebenauto() {
    System.out.println("-".repeat(30));
    System.out.println(     "Baujahr: "   + Baujahr +"\n" + 
                            "km: " + km  +"\n" + 
                            "Marke: " + Marke +"\n" + 
                            "Farbe: " + Farbe +"\n" + 
                            "Aufbereitung: " + aufbereitung + "\n" +
                            "Tank: " + tankFuellung + " Liter" + "\n" +
                            "Verbrauch: " + verbrauchPro100Km);
    System.out.println("-".repeat(30));    

}
//Aufbereitung ----------------------
public void frageAufbereiter(){
    if (getaufbereitung() == true){
        System.out.println("Anfrage vom Aufberteiter: ");
        System.out.println("Dieses Auto wurde Aufbereitet." );
    } else { 
        System.out.println("Anfrage vom Aufberteiter: ");
        System.out.println("Dieses Auto benötigt eine Aufbereitung!");
    }
}

public void aufbereitungErfolgt(){
    System.err.println("Aufbereitung erfolgreich!");
    this.aufbereitung = true;
}

// Auto faehrt - Verbrauch 3 Fuellung auff 100 km
public void fahren(int km){
    if (km <= 0) {
        System.out.println("Kein Verbrauch bei Stillstand.");
        return;
    }
    double verbrauch = tankFuellung / 100 * 3 ;
    if (verbrauch > this.tankFuellung) {
        System.err.println("Computer sagt NEIN... (zu wenig Sprit)");
        return ;
    }
    System.out.println("Auto fährt " + km +  " km");
    this.km = this.km + km;
    this.tankFuellung = this.tankFuellung - verbrauch;
}
// Tanken 
public void tanken() {
    this.tankFuellung = 60;
    System.out.println("Auto getankt");
}



// Ende Methoden -----------------------------------------
}
