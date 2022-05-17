package domaci_zadatak_16_05_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
//        / / / / /
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N:");
        int N = s.nextInt();
        System.out.print("Unesite karakter: ");
        String karakter = s.next();
        stampa(N,karakter);

    }
    static void stampa (int N, String karakter){

        for (int i = 1; i <= N; i++) {
            System.out.print(karakter + " ");
        }
    }
}
