


public class EmailBenachrichtigung implements Benachrichtigung{

    @Override 
    public void senden(String nachricht){
        System.out.println("E-Mail gesendet: " + nachricht);
        }
    }


