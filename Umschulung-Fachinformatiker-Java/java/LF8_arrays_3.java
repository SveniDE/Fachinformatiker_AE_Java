import java.util.Arrays;

public class LF8_arrays_3 {

public static void main(String[] args) {
  
    int[] messwerte = {20,16,11,22,13,9};

    sortiere(messwerte);



}
public static void sortiere(int[] feld) {
    //Äußere Schleife, legt fest, welche Position als nächstes
    //besetzt wird.
    for(int i = 0; i < feld.length -1; i++) {

        //Hilfsvariable
        int kleinsterIndex = i;

        //innere Schleife, die durchsucht dann nur den rest dahinter
        //
        for (int j = i +1; j < feld.length; j++){
            if (feld[j] < feld[kleinsterIndex]) {
                kleinsterIndex = j;

            }
        }
        if (kleinsterIndex != i) {
            int merken = feld[i];
            feld[i] = feld[kleinsterIndex];
            feld[kleinsterIndex] = merken;
        }
    System.out.println("nach durchlauf " + (i + 1) + " : " +  Arrays.toString(feld));
        }


    }

}