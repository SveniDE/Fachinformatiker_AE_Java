import java.util.Scanner;

public class ScannerEingabe_1 {
    
public static void main(String[] args) {
    
Scanner eingabe = new Scanner(System.in);

System.out.print(" Auftragsnummer: ");
int nummer =eingabe.nextInt();

System.out.print("Gewicht: ");
double gewicht = eingabe.nextDouble();

System.out.println("Auftragsnumme: " + nummer);
System.out.println("Gewicht: " + gewicht); 

eingabe.close();
} 

}
