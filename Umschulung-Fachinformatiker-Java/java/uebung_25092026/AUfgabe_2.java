public class AUfgabe_2 {

    public static void main(String[] args) {
        int startTemperatur = -10;
        int entTemperatur = 40;
        int schritte = 5;
        int zaehler = 0;

        System.out.println("-----------------------------------------------------");
        System.out.printf("| %-10s | %10s | %10s | %10s |%n ", " ", " ", "Celsius", "Fahrenheit");
        for (int i = startTemperatur; i <= entTemperatur; i += schritte){
            zaehler += 1;
            double Fahrenheit = (i * 9/5) +32;
            //System.out.println(i + "°C = " + Fahrenheit + "°F");
            System.out.println("-----------------------------------------------------");   
            System.out.printf("| %-10s | %10d | %10d | %10.0f |%n ", "Schritt", zaehler, i, Fahrenheit);
           
        
        }
            System.out.println("-----------------------------------------------------");   


    }
}
