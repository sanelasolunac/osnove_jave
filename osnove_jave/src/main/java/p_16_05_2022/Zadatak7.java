package p_16_05_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//        6. Zadatak
//        Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
//
//        Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//        N=9, print je=> * * * * * * * * *

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N:");
        int N = s.nextInt();
        zvezdice(N);

    }
    static void zvezdice (int N){
        for (int i = 1; i <= N; i++) {
            System.out.print("* ");

        }
    }
}
