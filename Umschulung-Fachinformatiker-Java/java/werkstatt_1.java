public class werkstatt_1 {
    public static void main(String[] args) {
    
boolean licht = true;
boolean tuerzu = true;
boolean oelLeer = false;
int stunden = 600;

// Teil 1 UND -------------------------------------
if(licht && tuerzu) {
    System.out.println("Maschine an");
} else { 
    System.out.println("Maschine bleibt aus!");
        }
// Teil 2 -----------------------------------------
if(oelLeer || stunden>500){
    System.out.println("Warnleuchte an");
} else {
    System.out.println("Alles ok");
    }




}
}

