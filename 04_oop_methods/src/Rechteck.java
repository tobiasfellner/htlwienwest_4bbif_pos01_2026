public class Rechteck {
    int a;
    int b;

    public Rechteck(int laenge, int breite){
        this.a = laenge;
        this.b = breite;
    }

    // Fläche, Umfang, IstQuadrat
    public int berechneFlaeche(){
        return this.a * this.b;
    }

    public int berechneUmfang(){
        return 2 * (this.a + this.b);
    }

    public boolean istQuadrat(){
        return this.a == this.b;
    }

}
