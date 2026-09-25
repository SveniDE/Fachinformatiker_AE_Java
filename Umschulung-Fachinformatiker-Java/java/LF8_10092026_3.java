public class LF8_10092026_3 {
    
    public static void main(String[] args) {
        
        for(int i = 2; i <=50; i++){
           int zahl = 0;
            int prim = 0;
            for(prim =1; prim <=i; prim++){
                if(i%prim ==0){
                    zahl++;
                }
            }
            if(zahl ==2){
                System.out.println(i);
            }
        }
    }
}
