package domaci_zadatak_16_05_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        (Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//        Napomena: Resiti bez koriscenja petlji. OVO SI KASNO PROCITALA

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite M: ");
        int m = s.nextInt();
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        printanjeCelihBrojeva(n, m);

    }

    static void printanjeCelihBrojeva(int n, int m) {
//        for (int i = m; i <= n; i++) {
//            System.out.print(i + " ");
//            int brojac = i;
//        }
        int brojac = 0;
        if (m>n){
            brojac = m - n - 1;
            System.out.println("Rezultat je: " + brojac);
        } if (n>m) {
            brojac = n - m - 1;
            System.out.println("Rezultat je: " +  brojac);
        }
    }
}

