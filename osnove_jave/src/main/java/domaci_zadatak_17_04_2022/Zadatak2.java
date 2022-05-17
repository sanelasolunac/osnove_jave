package domaci_zadatak_17_04_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
//        koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prviBroj = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = s.nextInt();
        printBrojeva(prviBroj,drugiBroj);

    }
    static void printBrojeva (int prviBroj, int drugiBroj){
        System.out.println(prviBroj+"" +drugiBroj);
    }
}
// PROVERI AKO IMA JOS NEKI NACIN