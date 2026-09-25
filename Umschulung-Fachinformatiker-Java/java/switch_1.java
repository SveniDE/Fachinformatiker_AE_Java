public class switch_1 {
    
public static void main(String[] args) {
    
    int note = 1; 

    System.out.println("Die Note ist: " + note);

switch (note) {
    case 1:
        System.out.println("sehr gut");
        break;
    case 2: 
        System.out.println("gut");
        break;

    default:
        System.out.println("die Note existiert nicht!");
        break;
        }
    }
}
