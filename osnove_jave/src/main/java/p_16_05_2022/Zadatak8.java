package p_16_05_2022;

import java.util.Scanner;

public class Zadatak8 {
        public static void main(String[] args) {
//            7.Zadatak
//            Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//            Primer: Ako se metoda pozove za N=10, vraca -10
//            Ako se metoda pozove za N=-11, vraca 11

        int a = apsolutnaVrednost(-10);
        System.out.println("Apsolutna vrednost je: " + a);
        int b = apsolutnaVrednost(15);
            System.out.println("Apsolutna vrednost je: " +b);

    }
    static int apsolutnaVrednost (int broj){
        return broj * (-1);

    }
}
