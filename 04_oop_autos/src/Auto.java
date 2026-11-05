public class Auto {
    String marke;
    String modell;
    String kennzeichen;
    int anzBesitzer = 0;

    public Auto(String marke, String modell, String kennzeichen){
        this.marke = marke;
        this.modell = modell;
        this.kennzeichen = kennzeichen;
    }

    public void print(){
        System.out.printf("Marke: %s, Modell: %s, Kennzeichen: %s, Anz. Besitzer: %d%n",
                marke, modell, kennzeichen, anzBesitzer);
    }

    public boolean isEqual(Auto other){
        return this.marke.equals(other.marke) && this.modell.equals(other.modell);
    }

    public boolean isExact(Auto other){
        return this.isEqual(other) && this.kennzeichen.equals(other.kennzeichen);
    }

    public void verkaufen(){
        anzBesitzer++;
    }

}
