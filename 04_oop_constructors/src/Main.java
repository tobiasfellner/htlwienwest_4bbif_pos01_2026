public class Main {
    public static void main(String[] args) {
        System.out.println("Main: vor vwPolo");
        Auto vwPolo = new Auto("VW", -1);
        System.out.println("Main: nach vwPolo");
        System.out.println("Main: Marke von vwPolo: " + vwPolo.marke + " Türen: "+ vwPolo.anzTueren);

        Auto vwGolf = new Auto("VW", 7);
        System.out.println("Main: Marke von vwGolf: " + vwGolf.marke + " Türen: "+ vwGolf.anzTueren);

        Besitzer me = new Besitzer("me");
        Auto vwId3 = new Auto(me);
        System.out.println("Main: Marke von vwId3: " + vwId3.marke + " Türen: "+ vwId3.anzTueren);
        System.out.println("Besitzer von vwId3:" + vwId3.besitzer.vorname);

        Besitzer unknown = new Besitzer("unknown");
        System.out.println("Besitzer von unknown ist " + unknown.vorname);
    }
}
