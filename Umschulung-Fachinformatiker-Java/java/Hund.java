// Datei: Hund.java
public class Hund {

    //1. Attribute (Zustand) - standartmäßig privat halten!
    private String name;
    private int alter;
    
    // Konstriktor (Startwerte setzen)
    //Heißt exatk wie die Klasse und hat KEINEN Rückgabetyp (kein void, kein int)
    public Hund(String name, int alter){
        this.name = name;
        this.alter= alter;
    }
// 3. Methoden (Verhalten)
    public void bellen() {
        System.out.println(this.name + " sagt: Wuff!");
    }

//4. Getter und Setter (kontrollierter Zugriff)
public String getName() {
    return this.name;
}
public int getAlter() {
    return this.alter;
}
public void setAlter(int neuesAlter) {
    // unsinige Eingsben vermeiden
    if (neuesAlter >= 0) {
        this.alter = neuesAlter;
        }
    }
}
