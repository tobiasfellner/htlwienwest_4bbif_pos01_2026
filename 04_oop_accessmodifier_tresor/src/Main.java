public class Main {
    public static void main(String[] args) {
        Tresor schluesselSafe1 = new Tresor();
        boolean success = schluesselSafe1.changePin("0000", "1234");

        if(success){
            System.out.println("Pin erfolgreich geändert");
        }else{
            System.out.println("Pin-Änderung nicht erfolgreich");
        }

        System.out.println("Tresor ist " + schluesselSafe1.getStatus());
    }
}
