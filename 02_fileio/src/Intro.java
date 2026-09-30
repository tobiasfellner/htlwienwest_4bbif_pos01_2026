import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Intro {
    static void main() {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("executionlog.log", true))) {
            LocalDateTime currentTime = LocalDateTime.now();
            String currentTimeFormatted = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm.ss.SSS"));
            writer.write(currentTimeFormatted);
            writer.newLine();

        } catch (IOException ex) {
            System.out.println("Fehler beim Datei-schreiben" + ex.getMessage());
        }

        /*
           Benutzereingabe zeilenweise solange bis ENDE eingegeben wird.
           Alle Zeilen in Großbuchstaben in eine datei INPUT.txt schreiben
           Ende soll nicht in Datei sein.
         */
    }
}