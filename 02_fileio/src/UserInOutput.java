import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class UserInOutput {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("usertext.txt"))){
            do{
                System.out.println("Benutzereingabe: ");
                input = scanner.nextLine();

                if(!input.equalsIgnoreCase("ENDE")){
                    writer.write(input.toUpperCase());
                    writer.newLine();
                }

            }while (!input.equalsIgnoreCase("ENDE"));

        }catch (IOException ex){
            System.out.println("Fehler");
        }
    }
}
