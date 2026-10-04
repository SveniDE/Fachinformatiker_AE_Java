
public class Fahrrad implements Transportmittel{

    @Override 
        public void liefern(String zielOrt){
            System.out.println("Paket wird per Fahrrad geliefert nach :  " + zielOrt);

        }
    }
