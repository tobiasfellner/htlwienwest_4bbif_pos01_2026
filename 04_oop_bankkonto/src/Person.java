import java.time.LocalDate;

public class Person {
    private String vorname;
    private String nachname;
    private final LocalDate geburtstag;

    public Person(String vorname, String nachname, LocalDate geburtstag){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = geburtstag;
    }

    public String getName(){
        String firstLetter = "";
        if(!vorname.isEmpty()){
            firstLetter = vorname.charAt(0) + ".";
        }
        return  firstLetter + " " + nachname;
    }

    public boolean istVolljaehrig(){
        if(geburtstag.isBefore(LocalDate.now().minusYears(18))
        || geburtstag.equals(LocalDate.now().minusYears(18))
        ){
            return true;
        }else{
            return false;
        }
    }
}
