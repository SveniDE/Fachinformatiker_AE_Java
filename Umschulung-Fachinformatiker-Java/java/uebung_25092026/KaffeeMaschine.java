public class KaffeeMaschine {
    //Attribute
    private String standort;
    private int wasserstand;
    private int bohnenStand;
    private int gekochteTassen;

    //Konstruktor
    public KaffeeMaschine(String standort) 
    {
        this.standort = standort;
        this.wasserstand = 0;
        this.bohnenStand = 0;
        this.gekochteTassen = 0;
    }
    //getter
    public String getwasserstand() {
        return this.wasserstand + " ml";
    }
    public String getbohnenStand() {
        return this.bohnenStand + " g";
    }
    public int getgekochteTassen() {
        return this.gekochteTassen;
    }

    //Methode
    public void ausgeben() {
        System.out.println("-".repeat(30 ));
        System.out.println(   standort + " / " 
                            + wasserstand + " ml / "
                            + bohnenStand + " g / "
                            + gekochteTassen + " Tassen") ;
    }    
    
    public boolean wasserAuffuellen(int ml){
        if (ml <= 0){
            System.out.println("Abgelehnt " + ml + " ml Wasser ist zu wenig");
            return false;
        }
        if(this.wasserstand + ml > 1500){
            System.out.println("Pass doch auf " + ml + " ml Wasser ist zu viel");
            return false;
        }
        this.wasserstand += ml;
        return true;
    }
    public void bohnenAuffuellen(int gramm){
        if (gramm <= 1){
            System.out.println("von Luft kann ich nicht leben.(Zu wenig Bohnen)");
        }else {
            this.bohnenStand += gramm;
        }
    }
    
    public boolean kaffeeKochen(int tassen){
        int musthavewasser = 150;
        int musthavebohnen = 15;
        if (tassen <= 0){
            System.out.println("Angabe 0 Tassen. Es wird nicht gekocht.");
            return false;
        }else if (tassen * musthavewasser > this.wasserstand)
            { 
                System.out.println("Abgelehnt: Wasserstand zu niedrig");
            return false;
            } else if (tassen * musthavebohnen > this.bohnenStand) {
                System.out.println("Abgelehnt: Bohnenstand zu niedrig");
            return false;
            } else{
                System.out.println("Kaffee wird gekocht: " + tassen + " Tasse/n. Guten Appetit!");
                this.wasserstand -= tassen * musthavewasser;
                this.bohnenStand -= tassen * musthavebohnen;
                this.gekochteTassen += tassen;
                System.out.println("Kaffee gekocht: " + tassen + " Tasse/n");
                return true;
                }
        
            }
    @Override 
    public String toString() {
        return standort + " / " + wasserstand + " ml / " + bohnenStand + " g / " + gekochteTassen + " Tassen";
    }   
    
    public static void main(String[] args) {
        KaffeeMaschine km = new KaffeeMaschine("Büro");
        km.ausgeben();
        System.out.println("-".repeat(30));
        km.wasserAuffuellen(1501);
        km.bohnenAuffuellen(0);
        km.ausgeben();
        km.kaffeeKochen(1);
        km.ausgeben();
    }

}
