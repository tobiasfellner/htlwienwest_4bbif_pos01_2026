public class Main {
    public static void main(String[] args) {
        System.out.println("Main: vor vwPolo");
        Auto vwPolo = new Auto("VW", -1);
        System.out.println("Main: nach vwPolo");
        System.out.println("Main: Marke von vwPolo: " + vwPolo.marke + " Türen: "+ vwPolo.anzTueren);

        Auto vwGolf = new Auto("VW", 7);
        System.out.println("Main: Marke von vwGolf: " + vwGolf.marke + " Türen: "+ vwGolf.anzTueren);

        Auto vwId3 = new Auto();
        System.out.println("Main: Marke von vwId3: " + vwId3.marke + " Türen: "+ vwId3.anzTueren);

    }
}
