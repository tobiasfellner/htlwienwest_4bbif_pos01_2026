import java.util.Random;

public class Wuerfel {
    static int gesamtanzahlWuerfel = 0;
    int maxAugen;
    int nr;
    Random random = new Random();
    int letzterWurf = 0;

    public Wuerfel(int nr, int maxAugen){
        this.nr = nr;
        this.maxAugen = maxAugen;
        gesamtanzahlWuerfel  = gesamtanzahlWuerfel +1;
    }

    public int wurf(){
        letzterWurf = random.nextInt(1, maxAugen + 1);
        return letzterWurf;
    }

    public String getText(){
        return "Würfel "+nr+" hat "+ letzterWurf + " geworfen";
    }

    public boolean isJoker(){
        return letzterWurf == maxAugen;
    }

}
