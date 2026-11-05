public class Main {
    public static void main(String[] args) {
        Schueler s1 = new Schueler("Max", "Test");
//        System.out.println("Schüler 1 erstellt. Anz:"+ Schueler.anzahl);

        Schueler s2 = new Schueler("Anna", "Mayr");
//        System.out.println("Schüler 2 erstellt. Anz:"+ Schueler.anzahl);

        Schueler s3 = new Schueler("Schueler", "Schueler");
//        System.out.println("Schüler 3 erstellt. Anz:"+ Schueler.anzahl);

        Schueler s4 = new Schueler("Schueler", "Schueler");

        s1.anzahl++;
        System.out.println("Ausgabe Schüler:");
        System.out.println(s1.getText());
        System.out.println(s2.getText());
        System.out.println(s3.getText());

        System.out.println("Sind s3 und s4 die gleichen Schüler?");
        System.out.println(s3==s4); // false

        if(s3.isEqualTo(s4)){
            System.out.println("s3 und s4 sind gleich");
        }

        System.out.println(Schueler.areEqual(
                new Schueler("a", "a"),
                new Schueler("b", "b"),
                new Schueler("c", "c")
        ));
    }

}
