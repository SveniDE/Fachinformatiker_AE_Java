package auto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;



public class autodaten_1 {

    public static void main(String[] args) {

// neues Objekt "auto1" anlegen
        auto auto1 = new auto(  1960,
                                512087, 
                                "Jaguar", 
                                "Grün", 
                                false,
                                60,
                                3
                                );

//Objekt in eine .txt Speichern
try (BufferedWriter writer = new BufferedWriter
        (new FileWriter("auto_1.txt",
                        StandardCharsets.UTF_8,
                        true))) 
{
   writer.write(    auto1.getBaujahr() + ";" + 
                    auto1.getkm() + ";" + 
                    auto1.getMarke() + ";"  + 
                    auto1.getFarbe() + ";" + 
                    auto1.getaufbereitung());
    writer.newLine();

    System.out.println("Datei geschrieben!");
} 
catch (IOException e)
{
    System.err.println("Fehler!" + e.getMessage());
}

//verschiedene Abfragen als test.
System.out.println(auto1);
    auto1.ausgebenauto();
    auto1.aufbereitung(false);
    auto1.frageAufbereiter();

    auto1.fahren(100);
    auto1.ausgebenauto();

    auto1.tanken();
    auto1.aufbereitungErfolgt();
    auto1.ausgebenauto();
}
    

    }

