
public class TransportmittelFactory {
    public Transportmittel erstelleTransportmittel(String fahrzeug){
        if(fahrzeug == null || fahrzeug.isEmpty()){
            return null;
        }
        switch(fahrzeug.toLowerCase()){
            case "fahrrad" : 
                return new Fahrrad();
            case "lkw" :
                return new LKW();
            case "schiff" : 
                return new Schiff();
            default: 
                throw new IllegalArgumentException("Unbekanntes Fahrzeug: " + fahrzeug);
        }
    }
    
}
