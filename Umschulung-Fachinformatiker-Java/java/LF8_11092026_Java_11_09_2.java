public class LF8_11092026_Java_11_09_2 {

//------------------------------------------------------------------
public static void main(String[] args) {
     

System.out.println(tempBereich(-3.0));


}
//------------------------------------------------------------------
public static String tempBereich(double temp){
    int bereich;
    if(temp<0){
        bereich =1;
    } else if (temp<15) {
        bereich=2;
    } else if (temp<=25){
        bereich =3 ;
    }else {
        bereich =4;
    }
  
switch (bereich){
    case 1:
        return "Frost";
    case 2: 
        return "kalt";
    case 3: 
        return "angenehm";
    default: 
        return "heiß";
                }
    }
//------------------------------------------------------------------

}
   

