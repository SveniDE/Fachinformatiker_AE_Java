
public class SmsBenachrichtigung implements Benachrichtigung {
    @Override 
    public void senden(String nachricht){
        System.out.println("SMS gesendet: " + nachricht);
    }
}
