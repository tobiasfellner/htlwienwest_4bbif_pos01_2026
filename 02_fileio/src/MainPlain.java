import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainPlain {
    static void main()  throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("hw.txt", true));
        writer.write("Hello World");
        writer.flush();
        writer.write("HTL Wien West");
        writer.flush();
// krach
        System.out.println("nachher");

    }
}