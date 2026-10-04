public class Schiff implements Transportmittel{

    @Override 
        public void liefern(String zielOrt){
            System.out.println("Paket wird per Schiff geliefert nach :  " + zielOrt);

        }
    }
