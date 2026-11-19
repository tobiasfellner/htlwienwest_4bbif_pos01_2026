public class KontoHelper {
    private static int counter = 0;
    public static String getNaechsteKontonummer(){
        counter ++;
        return String.format("%09d", counter);
    }
}
