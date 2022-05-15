package domaci_zadatak_13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti (ne u nosi ih korisnik) a zatim
//        se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza. Pre i nakon izbacivanja ispisati niz
//        na ekranu. Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//        Primer izvrsenja 1:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 5
//        Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

        nizBrojeva.add(1);
        nizBrojeva.add(2);
        nizBrojeva.add(3);
        nizBrojeva.add(4);
        nizBrojeva.add(5);
        nizBrojeva.add(6);
        nizBrojeva.add(7);
        nizBrojeva.add(8);
        nizBrojeva.add(9);
        nizBrojeva.add(3);

        System.out.print("Niz je: " + nizBrojeva);
        System.out.println();

        System.out.print("Unesite poziciju za izbacivanje: ");
        int pozicijaZaIzbacivanje = s.nextInt();

        if (pozicijaZaIzbacivanje > 10){
            System.out.println("Doslo je do greske. Unesite nevalidnu poziciju.");
        } else {
            nizBrojeva.remove(pozicijaZaIzbacivanje);
        System.out.println("Niz nakon brisanja je: " + nizBrojeva);
        }
    }
}
