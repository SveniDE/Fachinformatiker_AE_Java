public class BenachrichtigungsFactory {
    public Benachrichtigung erstelleBenachrichtigung(String typ){
        if(typ == null || typ.isEmpty()){
            return null;
        }
        switch(typ.toLowerCase()){
            case "email":
                return new EmailBenachrichtigung();
            case "sms":
                return new SmsBenachrichtigung();
            default:
                throw new IllegalArgumentException("Unbekannter Typ : " + typ);
        }
    }    
}
