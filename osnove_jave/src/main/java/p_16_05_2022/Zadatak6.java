package p_16_05_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        5. Zadatak
//        Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.

                Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = s.nextInt();
        stampajApsolutnuVrednost(broj);

    }
    static void stampajApsolutnuVrednost (int broj){
        if (broj<0){
        int apsolutnaVrednost = broj * (-1);
        System.out.println("Apsolutna vrednost je " + apsolutnaVrednost);
        } else {
            System.out.println("Apsolutna vrednost je " + broj);
        }
    }
}
