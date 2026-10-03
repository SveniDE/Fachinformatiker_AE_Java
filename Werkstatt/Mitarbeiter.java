package Werkstatt;

public class Mitarbeiter {
    private String mitarbeiterID;
    private String vorname;
    private String nachname;
    private String abteilung;

        public Mitarbeiter(     String mitarbeiterID,
                                String vorname,
                                String nachname,
                                String abteilung)
                            {
                                this.mitarbeiterID = mitarbeiterID;
                                this.vorname = vorname;
                                this.nachname = nachname;
                                this.abteilung = abteilung;
                            }          
        public String getmitarbeiterID(){
            return mitarbeiterID;
        }
        public String getvorname(){
            return vorname;
        }
        public String getnachname(){
            return nachname;
        }
        public String getabteilung(){
            return abteilung;
        }
    
    @Override
    public String toString(){
        return  "| MitarbeiterID: " + this.mitarbeiterID + " | "
                + "Vorname: " + this.vorname + " | "
                + "Nachname: " + this.nachname + " | "
                + "Abteilung: " + this.abteilung 
                + " |";
    }
    
    
    }