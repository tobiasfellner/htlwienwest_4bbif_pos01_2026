import javax.management.modelmbean.ModelMBeanInfoSupport;

public class Auto {
    // Felder
    String marke;
    int anzTueren;

    Besitzer besitzer;

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
        this.besitzer = new Besitzer("xy");
    }

    public Auto(Besitzer besitzer){
        this("unkown");
        this.besitzer = besitzer;
    }

    // Methoden
}
