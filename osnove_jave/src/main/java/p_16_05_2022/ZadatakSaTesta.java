package p_16_05_2022;

public class ZadatakSaTesta {
    public static void main(String[] args) {
        double res = konvertuj(3, "USD");
        System.out.println(res);

    }
    static double konvertuj (double vrednostUevrima, String valuta){
        if (valuta.equals("RSD")) {
            return vrednostUevrima * 117.2113;
        } else if (valuta.equals("USD")) {
            return vrednostUevrima * 1.1821;
        } else {
            return vrednostUevrima * 89.2323;
        }
    }
}
