 import java.util.Arrays;

public class LF8_14092026UE_3 {


    public static void main(String[] args) {

    //    int[] saeulen = {1,2,3,4,5,6,7,8};
        int[] lade= {12,78,45,95,8,60,33,88};

        System.out.println("--- alle Ladesäulen ---");
        System.out.printf("%-8s | %-10s | %-8s%n" , "Säule", "LAdestand", "istStatus");
        System.out.println("-------------------------------------------");


        for (int i = 0; i<lade.length; i++){
            int saeulen = i +1;
            int hilfStatus = lade[i];
            String status = istStatus(hilfStatus);

            System.out.printf("Säule %-2d | %8d%% | %-8s%n", saeulen, hilfStatus, status);
           
            
        }
        System.out.println("-----------------------------------");
        int zkrit = 0;
        int znied = 0;
        int zgut = 0;
        int zvoll = 0;

        for (int hilfStatus : lade){
        if (hilfStatus <20 ) {
            zkrit++;
        } else if (hilfStatus<50){
            znied++;
        }else if ( hilfStatus<90) {
            zgut++;
        }else {zvoll++;
        }
    }
    System.out.println("Anzahl Kritisch: " + zkrit );
    System.out.println("ANzahl Niedrig: " + znied);
    System.out.println("Anzahl Gut: " + zgut);
    System.out.println("Anzahl Voll: " + zvoll);
    System.out.println("----------------------------------");
    }
public static String istStatus(int hilfStatus) {
    
        if (hilfStatus < 20) {
            return  "kritisch";
        } else if (hilfStatus < 50) {
            return "niedrig";
        } else if (hilfStatus < 90) {
            return "gut";
        } else {
            return "voll";
        }
    }
} 
// public static String kritisch(int[] saeulen, int[] lade){
//         String kritisch1 = "";
//     for (int i = 0; i < lade.length; i++) {
//         String kritisch = "";
//         if(lade[i]<20){
//             kritisch = "kritisch";
//         }else {kritisch =" Statuas wird geprüft";}
//     kritisch1 += "Säule: " + saeulen[i] + " Ladestand: " + lade[i] + "% zustand: " + kritisch + "\n";
// }   
// return kritisch1;
// }
