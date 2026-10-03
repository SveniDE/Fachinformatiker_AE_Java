package Werkstatt;

public class werkzeug {
    private String werkzeugID;
    private String bezeichnung;
    private String standort;
    private String spezZweck;
    private Mitarbeiter ausgeliehenVon;

        public werkzeug(    String werkzeugID,
                            String bezeichnung,
                            String standort,
                            String spezZweck,
                            Mitarbeiter ausgeliehenVon)
                            {
                                this.werkzeugID = werkzeugID;
                                this.bezeichnung = bezeichnung;
                                this.standort = standort;
                                this.spezZweck = spezZweck;
                                this.ausgeliehenVon = ausgeliehenVon;
                            }          
        public String getwerkzeugID(){
            return werkzeugID;
        }
        public String getbezeichnung(){
            return bezeichnung;
        }
        public String getstandort(){
            return standort;
        }
        public String getspezZweck(){
            return spezZweck;
        }
        public Mitarbeiter getausgeliehenVon(){
            return ausgeliehenVon;
        }
        
        public void ausgeliehenVon(Mitarbeiter mitarbeiter){
            this.ausgeliehenVon = mitarbeiter;
        }

        //methoden

        @Override
        public String toString(){
            return  "| WerkzeugID: " + this.werkzeugID + " | " 
                    + "Beschreibung: " + this.bezeichnung + " | " 
                    + "Lagerort: " + this.standort + " | " 
                    + " Zweck: " + this.spezZweck + " | "  
                    + " ausgeliehen von: " + this.ausgeliehenVon
                    + " |";
                }

      
        }
