import java.util.Arrays;

public class LF8_14092026UE_2 {
    public static void main(String[] args) {

        int[] noten = {3,1,4,2,5,2,1};
        
        for(int i = 0; i < noten.length -1; i++) {

        //Hilfsvariable
        int kleinsterIndex = i;

        //innere Schleife, die durchsucht dann nur den rest dahinter
            for (int j = i +1; j < noten.length; j++){
            if (noten[j] < noten[kleinsterIndex]) {
                kleinsterIndex = j;
            }
        }
        if (kleinsterIndex != i) {
            int merken = noten[i];
            noten[i] = noten[kleinsterIndex];
            noten[kleinsterIndex] = merken;
        } 
System.out.println("nach durchlauf " + (i + 1) + " : " +  Arrays.toString(noten));
}
//---------------------------------------------------------------
System.out.println("Note 1: " + duNote(noten, 1));
System.out.println("Note 2: " + duNote(noten, 2));
System.out.println("Note 3: " + duNote(noten, 3));
System.out.println("Note 4: " + duNote(noten, 4));
System.out.println("Note 5: " + duNote(noten, 5));
System.out.println("Note 6: " + duNote(noten, 6));
       
//---------------------------------------------------------------
}
public static int duNote(int noten[], int note) {
        int duNote1 = 0;
        // int duNote2 = 0;
        // int duNote3 = 0;
        // int duNote4 = 0;
        // int duNote5 = 0;
        // int duNote6 = 0;
    for (int i = 0;  i<noten.length; i++) {
        if (noten[i] == note){
            duNote1++;
        }
    } 
return duNote1;
    }
}
