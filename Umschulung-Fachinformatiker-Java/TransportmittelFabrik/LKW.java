public class LKW implements Transportmittel{

    @Override 
        public void liefern(String zielOrt){
            System.out.println("Paket wird per LKW geliefert nach :  " + zielOrt);

        }
    }
