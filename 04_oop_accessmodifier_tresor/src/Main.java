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
        boolean unlockSuccess = schluesselSafe1.unlock("1234");
        if(unlockSuccess){
            System.out.println("erfolgreich entsperrt");
        }

        boolean lockSuccess = schluesselSafe1.lock();
        if(lockSuccess){
            System.out.println("erfolgreich gesperrt");
        }
    }
}
