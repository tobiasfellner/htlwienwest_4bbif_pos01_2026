public class Main {
    public static void main(String[] args) {
        Parkhaus p1 = new Parkhaus(5);
        boolean e1 = p1.einfahrt(new Auto("W-111"));
        schreibeEinfahrtErfolg(e1);
        System.out.println("Preis: " + p1.zahlen("W-111"));

        boolean e2 = p1.einfahrt(new Auto("W-222"));
        schreibeEinfahrtErfolg(e2);

        boolean e3 = p1.einfahrt(new Auto("W-333"));
        schreibeEinfahrtErfolg(e3);


        System.out.println(p1.getInfo());

        boolean e4 = p1.einfahrt("W-444");
        schreibeEinfahrtErfolg(e4);
        boolean e5 = p1.einfahrt("W-555");
        schreibeEinfahrtErfolg(e5);

        System.out.println(p1.getInfo());
        System.out.println("--------------------------------------------------- Ausfahrt von W-555");
        p1.ausfahrt("W-555");
        System.out.println(p1.getInfo());

        System.out.println("--------------------------------------------------- Einfahrt von W-666");
        boolean e6 = p1.einfahrt("W-666");
        schreibeEinfahrtErfolg(e6);
        System.out.println(p1.getInfo());



    }

    private static void schreibeEinfahrtErfolg(boolean e){
        if(e){
            System.out.println("Einfahrt erfolgreich");
        }else{
            System.out.println("Einfahrt fehlgeschlagen");
        }
    }
}
