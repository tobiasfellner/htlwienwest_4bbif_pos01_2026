import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLines {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("names.csv"))){
            String line = reader.readLine();

            while (line != null){
                String[] parts = line.split(";");
                System.out.println("Zeile " + parts[0] + ": " + parts[1]);

                line = reader.readLine();
            }

        }catch (IOException exception){
            System.out.println("Lesen fehlgeschlagen");
        }
    }
}
