import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class SimpleTicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 9;
        char[] field = new char[SIZE];
        int counter = 0;

        String winner = ""; // user, computer, unentschieden
        // Hauptschleife
        while(winner.isEmpty()){
            print(field);
            // Zug user
            int userDecision = getNextUserDecision(field, scanner);
            field[userDecision] = 'x';
            counter++;

            winner = getWinner(field);

            if(!isFieldFull(counter, SIZE) && winner.isEmpty()){
                // Zug computer
                int computerDecision = getNextComputerDecision(field);
                field[computerDecision] = 'o';
                counter++;
            }

            winner = getWinner(field);

            if(isFieldFull(counter, SIZE) && winner.isEmpty()){
                winner = "unentschieden";
            }
        }

        System.out.println("Der Gewinner ist: "+winner);
        print(field);

        scanner.close();
    }

    public static boolean isFieldFull(int count, int size){
        return count == size;
    }

    public static String getWinner(char[] field){
        for (int i = 0; i < field.length-3; i++) {
            if(field[i] == field[i+1] && field[i+1] == field[i+2] && field[i] != 0){
                if(field[i] == 'x'){
                    return "user";
                }else{
                    return "computer";
                }
            }
        }
        return "";
    }
    public static int getNextUserDecision(char[] field, Scanner input){
        int index;
        do{
            System.out.println("Nächste Position: ");
            index = Integer.parseInt(input.nextLine());
            if(field[index]!=0){
                System.out.println("Position ist besetzt");
            }
        }while(field[index] != 0);
        return index;
    }

    public static int getNextComputerDecision(char[] field){
        Random random = new Random();
        int index;
        do{
            index = random.nextInt(0, field.length);
        }while (field[index] != 0);
        return index;
    }


    // print: Gibt Spielfeld auf die Konsole aus
    // Spielfeld inklusiver Indizes auf Konsole ausgeben.
    // leer:   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
    // 1. Zug: | 0 | 1 | 2 | x | 4 | 5 | 6 | 7 | 8 |
    // 2. Zug: | 0 | 1 | 2 | x | 4 | o | 6 | 7 | 8 |
    
    public static void print(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 'x' && arr[i]!='o') {
                // int as char-value
                char currentCell = Character.forDigit(i, 10);
                System.out.printf("| %c ", currentCell);
            }else {
                System.out.printf("| %c ", arr[i]);
            }
        }
        System.out.println("|");
    }


}
