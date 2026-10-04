public class Starttrans {
       public static void main(String[] args){

        TransportmittelFactory Transportmittel = new TransportmittelFactory();

        Transportmittel liefernfahrrad = Transportmittel.erstelleTransportmittel("Fahrrad");
        liefernfahrrad.liefern("Köln");

        Transportmittel liefernlkw = Transportmittel.erstelleTransportmittel("LKw");
        liefernlkw.liefern("München");

        Transportmittel liefernschiff = Transportmittel.erstelleTransportmittel("schiff");
        liefernschiff.liefern("Bonn");
       } 
}
