public class Kaffeemaschine {

    private String standort;
    private int wasser;
    private int bohnen;
    private int tassen;

    public Kaffeemaschine(String standort) {
        this.standort = standort;
        this.wasser = 0;
        this.bohnen = 0;
        this.tassen = 0;
    }

    public int getWasser() {
        return this.wasser;
    }

    public int getBohnen() {
        return this.bohnen;
    }

    public int getTassen() {
        return this.tassen;
    }

    public boolean wasserAuffuellen(int ml) {
        if (ml <= 0 || this.wasser + ml > 1500) {
            System.out.println("Abgelehnt: " + ml + " ml");
            return false;
        }
        this.wasser = this.wasser + ml;
        return true;
    }

    public void bohnenAuffuellen(int gramm) {
        if (gramm > 0) {
            this.bohnen = this.bohnen + gramm;
        }
    }

    public boolean kaffeeKochen() {
        if (this.wasser < 200 || this.bohnen < 15) {
            System.out.println("Bitte auffuellen");
            return false;
        }
        this.wasser = this.wasser - 200;
        this.bohnen = this.bohnen - 15;
        this.tassen = this.tassen + 1;
        return true;
    }

    @Override
    public String toString() {
        return "Kaffeemaschine " + this.standort + ": " + this.wasser + " ml Wasser, "
                + this.bohnen + " g Bohnen, " + this.tassen + " Tassen gekocht";
    }
}
