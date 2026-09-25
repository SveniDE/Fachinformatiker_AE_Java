public class Fahrzeug{
    private String kennzeichen;
    private String hersteller;
    private int baujahr;
    private int kilometerstand;

    public Fahrzeug (       String kennzeichen,
                            String hersteller,
                            int baujahr,
                            int kilometerstand)
                        {   
                        this.kennzeichen = kennzeichen;
                        this.hersteller = hersteller;
                        this.baujahr = baujahr;
                        this.kilometerstand = kilometerstand;
                        }

    @Override 
    public String toString(){
        return this.kennzeichen 
        + " ( " + this.hersteller 
        + " , Bj. " 
        + this.baujahr 
        + ") - " 
        + this.kilometerstand 
        + " km";
        }
//-------------------------------------------    
    public static void main(String[] args) {
    
        Fahrzeug fahrzeug1 = new Fahrzeug(
                "DN-AS-1234",
                "Ford", 
                1990, 
                528789);

System.out.println("-".repeat(50));
            System.out.println();
            System.out.println(fahrzeug1.toString());
System.out.println("-".repeat(50));                        
    }
}
                                    
            
    

