import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person("Bill", "Gates", LocalDate.of(1960, 10, 16));
        Konto a = new Konto(personA);
        System.out.println(a.getKontoInfo());

        Person personB = new Person("Elon", "Musk", LocalDate.of(1976, 10, 16));
        Konto b = new Konto(personB);
        System.out.println(b.getKontoInfo());

        System.out.println("Einzahlen");
        a.einzahlen(10000);
        System.out.println(a.getKontoInfo());

        System.out.println("Überweisung");
        Bank.ueberweisen(a, b, 5000);
        System.out.println(a.getKontoInfo());
        System.out.println(b.getKontoInfo());


    }


}
