package spiel_1;

public class spieler_1 {
    private String name;
    private int gesundheit;
    private int level;
    private int gold;
    private int erfahrung;

public spieler_1(   String name,
                    int gesundheit,
                    int level,
                    int gold,
                    int erfahrung)
        {
        this.name       = name;
        this.gesundheit = gesundheit;
        this.level      = level;
        this.gold       = gold;
        this.erfahrung  = erfahrung;
}
//setter
public void name(String name){
    this.name = name;
}
public void gesundheit(int gesundheit){
    this.gesundheit =gesundheit;
}
public void gold(int gold){
    this.gold = gold;
}

//getter
public String getname(){
    return this.name;
}
public int getgesundheit(){
    return this.gesundheit;
}
public int getgold(){
    return this.gold;
}
// Methoden
public void spielerAbfrage(){
    System.out.println("-".repeat(30));
    System.out.println( "Name:"         + name      +"\n" +
                        "Gesundheit: "  +gesundheit +"\n" +
                        "Level: "       + level     +"\n" +
                        "Gold:"         + gold      +"\n" +
                        "Erfahrung: "   +erfahrung );
    System.out.println("-".repeat(30));

}

public void schadenNehmen(int schadensPunkte){
    System.out.println("-".repeat(30));
    this.gesundheit = this.gesundheit - schadensPunkte;
    if(this.gesundheit <= 0 ){
        System.out.println("Spieler ist KO");
        return;
    }
    System.out.println("Dem Spieler wurden " + schadensPunkte + " Lebenspunkte abgeszogen.");
    System.out.println("Restliche Lebenspunkte: " + gesundheit);
}

public void heilen(int heilpunkte){
    System.out.println("-".repeat(30));
    this.gesundheit = this.gesundheit + heilpunkte;
    System.out.println("Der Spieler wurde um " + heilpunkte+ " Punkte geheilt.");
    System.out.println("Restliche Lebenspunkte: " + gesundheit);
}
public void heilen(){
    System.out.println("-".repeat(30));
    this.gesundheit = 200;
    System.out.println("Der Spieler wurde vollständig geheilt.");
}

public void goldSammeln(int gold){
    System.out.println("-".repeat(30));
    this.gold = this.gold + gold;
    System.out.println("Der Spieler hat " + gold + " Gold gesammelt.");
    System.out.println("Goldmenge: " + this.gold);
}
public void trankKaufen(){
    System.out.println("-".repeat(30));
    if(gold < 30) {
        System.out.println("Nicht genug Gold");
        return;
    }
    if (gold>30){
        //System.out.println("-".repeat(30));
        System.out.println("Goldmenge: " + gold);
        System.out.println("Kauf des Trankes erfolgreich.");
        this.gold = this.gold -40;
        System.out.println("Goldmenge: " + this.gold);
        this.gesundheit = this.gesundheit +40;
        System.out.println("Der Spieler wurde um 40 Punkte geheilt.");
        System.out.println("Restliche Lebenspunkte: " + this.gesundheit);
    }
}

}