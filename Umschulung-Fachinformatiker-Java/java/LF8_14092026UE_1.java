public class LF8_14092026UE_1 {


    public static void main(String[] args) {
        
        int[] temp = {18,-3,25,7,31,-8,14,22};
        int zahler1 = 0;
        int zahler2 = 0;
        int zahler3 = 0;
        
        for (int i = 0; i < temp.length; i++ ) {
        
        if (temp[i] <= 0) {
//            System.out.println("zu kalt: "+ temp[i]);
            zahler1++;
        } else if (temp[i] >= 25 ) {
//            System.out.println("ok " + temp[i]);
           zahler3++;
        }else {
            zahler2++;
        }
    }
    System.out.println("Temp unter 0: " + zahler1);
    System.out.println("Temp zwischen 0 und 25: " + zahler2);
    System.out.println("Temp über 25: " + zahler3);
    }
    
}
