public class SimpleTicTacToe {
    public static void main(String[] args) {
        final int SIZE = 9;
        char[] field = new char[SIZE];
        print(field);
        // 1. zug
        field[3] = 'x';
        print(field);

        // 2.zug
        field[5] = 'o';
        print(field);

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

    // nextUserDraw: Nächster Zug des Benutzers, wiederholen, bis freier Platz gefunden

    // nextComputerDraw: Nächster Zug des Computers, wiederholen, bis freier Platz gefunden

    // getWinner: Gibt Gewinner aus. (String oder null)
    //            kein Gewinner, Spielfeld voll
    //            Benutzer
    //            Computer


}
