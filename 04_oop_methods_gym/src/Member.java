import java.util.Random;

public class Member {
    String firstName;
    String lastName;
    int visitCount;
    boolean isFrozen;
    boolean isCheckedIn;
    int pin;

    public Member(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        visitCount = 0;
        this.isFrozen = false;
        Random random = new Random();
        this.pin = random.nextInt(1000, 9999);
    }

    public String getUserInfo(){
        return String.format("%s %s (%d)", firstName, lastName, pin);
    }

    public boolean checkIn(int pin){
        if(isFrozen){
            // Benutzer ist gesperrt oder hat keinen Vertrag
            return false;
        }

        if(pin != this.pin){
            // ungültiger PIN
            return false;
        }

        if(isCheckedIn){
            // Benutzer ist bereits eingecheckt
            return false;
        }

        visitCount++;
        isCheckedIn = true;
        return true;
    }

    public boolean checkOut(int pin){
        if (pin == this.pin) {
            isCheckedIn = false;
            return true;
        }
        return false;
    }

    public void freeze(){
        this.isFrozen = true;
    }

    public void unfreeze(){
        isFrozen = false;
    }

    public boolean changePin(int enteredPin, int newPin){
        if(enteredPin == pin){
            this.pin = newPin;
            return true;
        }
        return false;
    }
}
