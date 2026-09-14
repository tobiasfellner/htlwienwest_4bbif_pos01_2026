public class Main {
    public static void main(String[] args) {
        //int[] digits = new int[3];
        int[] digits = {1,2,3};

        print(digits);
        multiply(digits, 2);
        System.out.println("\r\ndigits * 2");
        print(digits);

        System.out.println("int");

        int x = 3;
        x = multiply(x,2);
        System.out.println(x);
    }

    // Methode multiply, 2 Parameter: array, int-Wert=2
    // => digits = 2,4,6

    public static int multiply(int x, int factor){
        x = x * factor;
        return x;
    }
    public static void multiply(int[] arr, int factor){
        // arr[0] = arr[0] * factor;  arr[0] *= factor
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * factor;
        }
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
