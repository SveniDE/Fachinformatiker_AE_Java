public class uebung2 {
    
public static void main(String[] args) {
  //istGerade(5);
  int zahl = 3;
  int zahl1 = 20;
  System.out.println("Das Ergebniss ist: " + istGerade(zahl));
  System.out.println("Das Ergebniss ist: " + istGerade(zahl1));
  
}

public static boolean istGerade(int zahl)
    {
       if (zahl % 2 == 0){
           return true;
       } else { 
            return false;
       }
    }   
}