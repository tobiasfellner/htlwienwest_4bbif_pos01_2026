public class Tresor {
    private final int PIN_LENTH = 4;
    // Felder
    private String currentPin;
    public boolean isOpen = false;

    public Tresor(){
        currentPin = "0000";
    }

    public boolean changePin(String oldPin, String newPin){
        if(oldPin.equals(currentPin) && newPin.length() == PIN_LENTH){
            currentPin = newPin;
            return true;
        }
        return false;
    }

    public String getStatus(){
        if(isOpen){
            return "geöffnet";
        }
        return "versperrt";
    }

    public boolean unlock(String inputPin){
        if (inputPin.equals(currentPin)) {
            isOpen = true;
        }
        return isOpen;
    }

    public boolean lock(){
        isOpen = false;
        return true;
    }
}
