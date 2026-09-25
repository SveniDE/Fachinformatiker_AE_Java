public class Freigabe_1 {
    public static void main(String[] args) {
    
boolean tuerzu = true;
boolean wartungOk = false;
int stunden = 800;

// Teil 1 UND -------------------------------------
if(!tuerzu) {
    System.out.println("Tuer offen, kein Start");
} else { 
    System.out.println("Start");
        }
// Teil 2 -----------------------------------------
if(stunden >= 750){
    System.out.println("Große Wartung!");
} else if (stunden < 250) {
    System.out.println("keine Wartung");
} else if (stunden<=749) {
    System.out.println("Sichtprüfung");
} 
// Teil 3 ------------------------------------------------

if(stunden < 750 || wartungOk){
    System.out.println("MAschine freigegeben");
    } else {
        System.out.println("Maschine nicht frei gegeben!");
    }
}
}
