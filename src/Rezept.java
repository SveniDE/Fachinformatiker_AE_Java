import java.util.ArrayList;

public class Rezept {

    private String name;
    private int portionen;
    private ArrayList<Zutat> zutaten;

    public Rezept(String name, int portionen) {
        this.name = name;
        this.portionen = portionen;
        this.zutaten = new ArrayList<Zutat>();
    }

    public String getName() {
        return this.name;
    }

    public int getPortionen() {
        return this.portionen;
    }

    public void hinzufuegen(Zutat z) {
        this.zutaten.add(z);
    }

    public void ausgeben() {
        System.out.println(this.name + " fuer " + this.portionen + " Portionen:");
        for (Zutat z : this.zutaten) {
            System.out.println("  " + z);
        }
    }

    public boolean enthaelt(String zutatName) {
        for (Zutat z : this.zutaten) {
            if (z.getName().equals(zutatName)) {
                return true;
            }
        }
        return false;
    }

    public void umrechnen(int neuePortionen) {
        if (neuePortionen <= 0) {
            System.out.println("Ungueltige Portionszahl");
            return;
        }
        double faktor = (double) neuePortionen / this.portionen;
        for (Zutat z : this.zutaten) {
            z.setMenge(z.getMenge() * faktor);
        }
        this.portionen = neuePortionen;
    }
}
