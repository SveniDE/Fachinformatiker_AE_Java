public class Zutat {
    //Attribute
    private String name; 
    private double menge; 
    private int einheit;

//Konstruktor
    public Zutat(   String name, 
                    double menge, 
                    int einheit) {
        this.name = name;
        this.menge = menge;
        this.einheit = einheit;
    }

    //getter
    public String getName() {
        return this.name;
    }
    public double getMenge() {
        return this.menge;
    }
    public int getEinheit() {
        return this.einheit;
    }
//setter ? 
public void setMenge(double menge) {
        this.menge = menge;
    }


    //methode
    @Override
    public String toString() {
        return this.name + " / " + this.menge + " / " + this.einheit;
}

}