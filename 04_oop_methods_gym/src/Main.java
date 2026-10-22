import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        Member m1 = new Member("Tobias", "Fellner");
        Member m2 = new Member("Max", "Mustermann");
        members.add(m1);
        members.add(m2);

        Scanner scanner = new Scanner(System.in);
        String input = "";
        do{
            System.out.println("Aktion eingeben (infos, checkin, checkout, changepin,end): ");
            input = scanner.nextLine();

            switch (input.toLowerCase()){
                case "infos":
                    for (int i = 0; i < members.size(); i++) {
                        System.out.println(" - " + members.get(i).getUserInfo());

                    }
                    break;
                case "checkin":
                    System.out.println("PIN eingeben: ");
                    int pin = Integer.parseInt(scanner.nextLine());
                    for (Member m : members){
                        if(m.checkIn(pin)){
                            System.out.println("CheckIn erfolgreich");
                        }
                    }
                    break;
                case "checkout":
                    System.out.println("PIN eingeben: ");
                    pin = Integer.parseInt(scanner.nextLine());
                    for (Member m : members){
                        if(m.checkOut(pin)){
                            System.out.println("CheckOut erfolgreich");
                        }
                    }
                    break;
                case "changepin":
                    break;
            }

        }while (!input.equalsIgnoreCase("end"));

        scanner.close();
    }
}
