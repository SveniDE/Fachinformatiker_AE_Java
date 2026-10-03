public class Start {
    public static void main(String[] args) {
        Artikel a1 = ArtikelFactory.erzeugen("buch", "Java lernen", 30.0, 12);
        Artikel a2 = ArtikelFactory.erzeugen("elektro", "Funkmaus", 19.9, 4);
        Artikel a3 = ArtikelFactory.erzeugen("buch", "SQL kompakt", 25.0, 6);
        //Artikel a4 = ArtikelFactory.erzeugen("tier", "SQL kompakt", 25.0, 6);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        //System.out.println(a4);

    try {
        Artikel a4 = ArtikelFactory.erzeugen("tier", "SQL kompakt", 25.0, 6);
    } catch(IllegalArgumentException e) {
        System.out.println("Falsche Artikelbeschreibung " + e.getMessage() );
        }
        System.out.println("Läuft weiter!");
}
       


}