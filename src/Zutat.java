public class Zutat {

    private String name;
    private double menge;
    private String einheit;

    public Zutat(String name, double menge, String einheit) {
        this.name = name;
        this.menge = menge;
        this.einheit = einheit;
    }

    public String getName() {
        return this.name;
    }

    public double getMenge() {
        return this.menge;
    }

    public String getEinheit() {
        return this.einheit;
    }

    public void setMenge(double menge) {
        if (menge > 0) {
            this.menge = menge;
        }
    }

    @Override
    public String toString() {
        return this.menge + " " + this.einheit + " " + this.name;
    }
}
