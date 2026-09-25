public class LF8_10092026_1 {
    
    public static void main(String[] args) {
        
        int stueckZahl = 340;
        int woche = 1;
        int zaehler = 0;

        while(stueckZahl >= 150){
            System.out.println("Bestand: " + stueckZahl + " | Woche: " + woche);
            stueckZahl -= 28;
            woche += 1;
            zaehler += 1;

        }
        System.out.println("Bestand: " + stueckZahl + " | Woche: " + woche + " nachbestellen");
        System.out.println("Nach " + (zaehler +=1)  + " Wochen muss nachbestellt werden!");
    }
}
