public class Start{

    public static void main(String[] args){

        BenachrichtigungsFactory factory = new BenachrichtigungsFactory();

        Benachrichtigung service = factory.erstelleBenachrichtigung("email");
        service.senden("Deine Ausbildung startet bald!");

        Benachrichtigung smsService = factory.erstelleBenachrichtigung("sms");
        smsService.senden("Code: 1234");


    }

}