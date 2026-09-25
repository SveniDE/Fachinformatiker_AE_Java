public class uebung5 {
    public static void main(String[] args) {
        String text1 = wiederholeText("na",3);
        System.out.println(wiederholeText("bu",5));
        System.out.println(text1);
    }

    public static String wiederholeText(String wort1, int zahl){
        String ergebniss= "";
        for(int i = 0; i < zahl; i++) {
            ergebniss  =  ergebniss + wort1;
            
        }
        return ergebniss;


    }


}
