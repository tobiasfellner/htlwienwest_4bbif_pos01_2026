public class Konto {
    private final Person inhaber;
    private final String kontonummer;
    private double kontostand = 0;

    public Konto(Person inhaber){
        this.inhaber = inhaber;
        this.kontonummer = Bank.getNaechsteKontonummer();
    }

    public void einzahlen(double betrag){
        if(betrag > 0){
            kontostand = kontostand + betrag;
        }
    }

    public void auszahlen(double betrag){
        if(betrag > 0){
            kontostand = kontostand - betrag;
        }
    }

    public boolean istZahlungsfaehig(double betrag){
        return kontostand >= betrag;
    }

    public String getPersonName(){
        return inhaber.getName();
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
