package domaci_zadatak_17_04_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite JMBG: ");
        String jmbg = s.next();
        System.out.print("Unesite ime: ");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();
        System.out.print("Aktivan (true/false): ");
        boolean aktivan = s.nextBoolean();
        korisnickiPodaci(jmbg, ime, prezime, godinaRodjenja, aktivan);

    }
    static void korisnickiPodaci (String jmbg,String ime, String prezime, int godinarodjenja, boolean aktivan){
        int godine = 2022 - godinarodjenja;
        System.out.println("JMBG: [" + jmbg + "]");
        System.out.println("Ime: [" + ime + "]");
        System.out.println("Prezime: [" + prezime + "]");
        System.out.println("God. rodjenja: [" + godine + "]");
        System.out.println("Aktivan (true/false): [" + aktivan + "]");
    }
}
