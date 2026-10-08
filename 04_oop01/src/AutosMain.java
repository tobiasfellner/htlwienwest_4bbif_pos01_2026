import java.io.*;

public class AutosMain {
    public static void main(String[] args) {
        //Car c1 = new Car("BMW", "red", 2024);
        //System.out.printf("Das %s Auto der Marke %s hat BJ %d.%n", c1.color, c1.brand, c1.yearOfConstruction);
        //writeToFile(c1, "car.csv");
        Car carFromFile = readFromFile( "car.csv");
        System.out.printf("Das %s Auto der Marke %s hat BJ %d.%n", carFromFile.color, carFromFile.brand, carFromFile.yearOfConstruction);
    }

    public static void writeToFile(Car c, String filename){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            //BMW;red;2024
            writer.write("Marke;Farbe;BJ");
            writer.write(c.brand + ";" + c.color + ";" + c.yearOfConstruction);
            writer.newLine();
        }catch (IOException e){
            System.out.println("Schreiben fehlgeschlagen");
        }

    }

    public static Car readFromFile(String filename){
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line = reader.readLine();
            String[] parts = line.split(";");
            int bj = Integer.parseInt(parts[2]);
            Car newCar = new Car(parts[0], parts[1], bj);
            return newCar;
        }catch (IOException e){
            System.out.println("Lesen fehlgeschlagen");
        }

        return null;
    }
}
