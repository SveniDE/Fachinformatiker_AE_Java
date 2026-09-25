public class uebung3    {
 
    public static void main(String[] args) {
        int zahl1 = 50;
        int zahl2 = 30;
    
        System.out.println("Die größere Zahl ist : " + maxZahl(zahl1, zahl2));
                                            }

public static int maxZahl(int zahl1, int zahl2)
    {
        if (zahl1 >= zahl2)
        {
            return zahl1;
        }
         else 
        {
            return zahl2;
        }
    }
                        }
