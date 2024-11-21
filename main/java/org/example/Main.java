package org.example;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        FileHandler json = new FileHandler();
        json.saveMedlem(new Medlem("Frederik", LocalDate.of(2000, 12, 30), "Aktiv", "Kredit"));
        json.jsonReader();
        }
}