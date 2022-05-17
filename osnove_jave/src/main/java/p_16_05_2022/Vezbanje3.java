package p_16_05_2022;
//DA LI SU BROJEVI JEDNAKI
public class Vezbanje3 {
    public static void main(String[] args) {
        boolean x = daLiSuBrojeviJednaki(10, 11);
        System.out.println(x);
    }
    static boolean daLiSuBrojeviJednaki (int a, int b) {
        if (a==b){
            return true;
        } else {
            return false;
        }
    }
}
