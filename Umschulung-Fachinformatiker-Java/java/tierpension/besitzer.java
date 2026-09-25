package tierpension;

public class besitzer {
    private String name;
    private String telefonnummer;



public besitzer(    String name,
                    String telefonnummer    )
                {
                    this.name =         name;
                    this.telefonnummer =  telefonnummer;
                }
public String getname(){
    return this.name;
}
public String gettelefonnummer(){
    return this.telefonnummer;
}
@Override  
public String toString()
    {    
        return this.name + " ; " + this.telefonnummer;            
    }


public static void main(String[] args){

    besitzer besitzer1 = new besitzer("Hugo", "012589");

    System.out.println("Besitzer ohne Formation: " + besitzer1);
    



    }


}