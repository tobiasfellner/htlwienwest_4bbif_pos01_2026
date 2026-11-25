import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalUnit;

public class Auto {
    private String kennzeichen;

    private LocalDateTime einfahrtszeit;

    public Auto(String kennzeichen){
        this.kennzeichen = kennzeichen;
    }

    public String getKennzeichen(){
        return kennzeichen;
    }

    public void speichereEinfahrtszeit(){
        einfahrtszeit = LocalDateTime.now().minusMinutes(10);
    }

    public double berechneAufenthalsminuten(){
        return Duration.between(einfahrtszeit, LocalDateTime.now()).toMinutes();    }
}
