public class AutosMain {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "red", 2024);
        System.out.printf("Das %s Auto der Marke %s hat BJ %d.%n", c1.color, c1.brand, c1.yearOfConstruction);
    }
}
