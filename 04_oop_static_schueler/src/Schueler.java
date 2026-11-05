import java.util.ArrayList;
import java.util.Locale;

public class Schueler {

     int anzahl;
    String vorname;
    String nachname;
    String wohnort;

    public Schueler(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
        anzahl++;
    }

    public String getText(){
        return vorname + " "+ nachname + " Anzahl: "+anzahl;
    }

    public boolean isEqualTo(Schueler other){
        return this.vorname.equals(other.vorname) && this.nachname.equals(other.nachname);
    }

    public static boolean areEqual(Schueler a, Schueler b){
        return a.isEqualTo(b);
    }

    public static boolean areEqual(Schueler a, Schueler b, Schueler c){
        return a.isEqualTo(b) && b.isEqualTo(c);
    }
    public static boolean areEqual(Schueler a, Schueler b, Schueler c, Schueler d){
        return a.isEqualTo(b) && b.isEqualTo(c) && c.isEqualTo(d);
    }
    
    public static  boolean areEqual(ArrayList<Schueler> list){
        if(list.size() < 2){
            return true;
        }

        for (int i = 0; i < list.size()-1; i++) {
            if(!list.get(i).isEqualTo(list.get(i+1))){
                return false;
            }
        }
        return true;
    }
}
