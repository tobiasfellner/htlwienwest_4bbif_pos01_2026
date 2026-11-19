public class Konto {
    private final Person inhaber;
    private final String kontonummer;
    private double kontostand = 0;

    public Konto(Person inhaber){
        this.inhaber = inhaber;
        this.kontonummer = KontoHelper.getNaechsteKontonummer();
    }

    public String getKontoInfo(){
        return String.format("============================%n" +
                "Inhaber: %s%n" +
                "Kontonummer: %s%n" +
                "Kontostand: %.2f€%n" +
                "============================%n",
                inhaber.getName(), kontonummer,kontostand);
    }
}
