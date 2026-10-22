public class Auto {
    // Felder
    String marke;
    int anzTueren;

    // Konstruktoren
    public Auto(String marke, int anzTueren){
        System.out.println("Auto: Default Konstruktor");
        this.marke = marke.toUpperCase();

        if(anzTueren < 2){
            anzTueren = 2;
        }

        this.anzTueren = anzTueren;
    }

    public Auto(String marke){
        this(marke, 3);
    }

    public Auto(){
        this("unkown");
    }

    // Methoden
}
