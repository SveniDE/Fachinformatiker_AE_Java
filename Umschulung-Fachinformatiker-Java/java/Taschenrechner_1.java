import java.util.Scanner;

public class Taschenrechner_1 {
    
    public static void main(String[] args) {
        
Scanner eingabe = new Scanner(System.in);

System.out.println("Operator");
char op1 = eingabe.next().charAt(0);

System.out.println("zahl 1 ");
double zahl1 = eingabe.nextDouble();

System.out.println("zahl 2");
double zahl2 = eingabe.nextDouble();

switch (op1) {
    case '+': /* Addition */ 
        System.out.println(zahl1 + zahl2);
        break;
    case '-': /* Subtraktion */ 
        System.out.println(zahl1 - zahl2);
        break;
    case '*': /* Multiplikation */ 
        System.out.println(zahl1 * zahl2);
        break;
    case '/': /* Division */ 
        System.out.println(zahl1 / zahl2);
        break;
}
eingabe.close();
    }
}
