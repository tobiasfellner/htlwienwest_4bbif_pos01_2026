public class TypeCasting {
    public static void main(String[] args) {
        char a = 'a';
        short start = (short)a;
        System.out.println(start);

        for (int i = start; i < start+ 26; i++) {
            char current = (char) i;
            System.out.print(current);
            if(i < start+25){
                System.out.print(", ");
            }
        }
        System.out.println();

        // Type cast
        int i = 100000;
        short s = 0;

        s =  (short)i;
        //i = s;
        //i= 100, s=100

        if(i >= Short.MIN_VALUE && i <= Short.MAX_VALUE){
            s = (short)i;
        }
        System.out.println(s);

    }
}
