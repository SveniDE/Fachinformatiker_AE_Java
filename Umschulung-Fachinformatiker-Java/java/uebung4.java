public class uebung4    {

public static void main(String[] args)  {
    
    
    int summe1 = summeBis(5);
    System.out.println("Die Summe ist: " + summeBis(10));
    System.out.println("Die Summe ist: " + summe1);
 

                                        }

public static int summeBis(int grenze)
    {
       int summe = 0;
       int zaehler = 0;
        while(zaehler <= grenze)
        {
            summe = summe + zaehler;
            zaehler++;
   //         return summe;2
        }
    return summe;
    }



    
                            }
