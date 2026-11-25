import java.util.ArrayList;

public class Parkhaus {
    private final double PREIS_PRO_MIN = 2.5;
    private int kapazitaet;
    private ArrayList<Auto> autos = new ArrayList<>();

    public Parkhaus(int kapazitaet){
        this.kapazitaet = kapazitaet;
    }

    public String getInfo(){
        String result =  String.format(
                "===============================%n" +
                "Belegung: %d/%d%n" +
                "===============================%n Autos: ",
                autos.size(), kapazitaet);
//        for(Auto a : autos){
//            result = result + ", "+ a.getKennzeichen();
//        }

        for (int i = 0; i < autos.size(); i++) {
            Auto a = autos.get(i);

            if(i > 0){
                result += ", ";
            }

            result += a.getKennzeichen();
        }

        return result;
    }

    public boolean einfahrt(Auto auto){
        if(autos.size() < kapazitaet){
            autos.add(auto);
            auto.speichereEinfahrtszeit();
            return true;
        }
        return false;
    }

    public boolean einfahrt(String kennzeichen){
        Auto neuesAuto = new Auto(kennzeichen);
        return einfahrt(neuesAuto);
    }

    public boolean ausfahrt(String kennzeichen){
        for (int i = 0; i < autos.size(); i++) {
            Auto a = autos.get(i);
            if(a.getKennzeichen().equals(kennzeichen)){
                autos.remove(i);
                return true;
            }
        }
        return false;
    }

    public double zahlen(String kennzeichen){
        for (Auto a : autos){
            if(a.getKennzeichen().equals(kennzeichen)){
                double mins = a.berechneAufenthalsminuten();
                return mins * PREIS_PRO_MIN;
            }
        }
        return 0;
    }
}
