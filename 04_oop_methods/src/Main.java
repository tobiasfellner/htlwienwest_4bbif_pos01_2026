public class Main {
    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(10, 20);
        System.out.println("Fläche aus main: " + berechneFlaeche(r1.a, r1.b));
        System.out.println("Fläche aus Objekt: " + r1.berechneFlaeche());
        System.out.println("Umfang aus Objekt: " + r1.berechneUmfang());
        System.out.println("Quadrat aus Objekt: " + r1.istQuadrat());

        Rechteck r2 = new Rechteck(30, 30);
        System.out.println("Quadrat aus Objekt: " + r2.istQuadrat());

    }


    public static int berechneFlaeche(int a, int b){
        return a * b;
    }

}
