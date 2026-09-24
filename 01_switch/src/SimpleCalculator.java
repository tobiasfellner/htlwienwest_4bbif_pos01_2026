import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl a eingeben");
        String aAsString = scanner.nextLine();
        int a = Integer.parseInt(aAsString);

        System.out.println("Zahl b eingeben");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Operator eingeben:");
        String op = scanner.nextLine();

        if(b != 0 && !op.equals("/")){
            double result = switch (op){
                case "+" -> a + b;
                case "-" -> a - b;
                case "/" -> a / (double)b;
                case "*" -> a * b;
                default -> 0;
            };
            System.out.printf(" %d %s %d = %.2f%n", a, op, b, result);
        }else{
            System.out.println("Undefinierte Operation");
        }

        scanner.close();
    }
}
