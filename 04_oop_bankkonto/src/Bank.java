public class Bank {
    private static int counter = 0;
    public static String getNaechsteKontonummer(){
        counter ++;
        return String.format("%09d", counter);
    }

    public static void ueberweisen(Konto quelle, Konto ziel, double betrag){
        if(quelle.istZahlungsfaehig(betrag)){
            quelle.auszahlen(betrag);
            ziel.einzahlen(betrag);
            System.out.printf("Überweisung von %.2f€ %s -> %s erfolgreich%n",
                    betrag, quelle.getPersonName(), ziel.getPersonName());
        }else{
            System.out.println("Quellkonto ist nicht gedeckt!");
        }
    }
}
