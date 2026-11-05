public class Main {
    public static void main(String[] args) {
        getString();

        /*
            Programmstart
         */

        System.out.println("Gesamtzahl Würfel: " + Wuerfel.gesamtanzahlWuerfel);

        for (int i = 0; i < 10; i++) {
            Wuerfel w = new Wuerfel(i+1,6);
            int wurf = w.wurf();
            System.out.println(w.getText());

            if(w.isJoker()){
                System.out.println("***");
            }
            System.out.println("Gesamtzahl Würfel: " + Wuerfel.gesamtanzahlWuerfel);

        }
    }
    public static String getString(){
        return "test";
    }
}
