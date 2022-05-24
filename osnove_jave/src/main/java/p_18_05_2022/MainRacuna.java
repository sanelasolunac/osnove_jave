package p_18_05_2022;

import java.util.Scanner;

public class MainRacuna {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        1.Zad
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//
//        Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//Primer izvrsenja:
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//Primalac: Marko Markovic, 840-23932-334, stanje: 200
//Unesite sumu za transakciju: 500
//Stanje nakon stransakcije
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//Primalac: Marko Markovic, 840-23932-334, stanje: 700
        Racun posiljalac = new Racun();

        posiljalac.brojRacuna = "840-23932-323";
        posiljalac.imeIPrezime = "Sanela Solunac";
        posiljalac.stanjeNaRacunu= 100000000;

//        System.out.println("Ime i prezime " + s.imeIPrezime + ".");
//        System.out.println("Broj racuna je " + s.brojRacuna +".");
//        System.out.println("Stanje na racunu je  " + s.stanjeNaRacunu +".");

        System.out.println("Posaljilac: " + posiljalac.imeIPrezime + "," + posiljalac.brojRacuna +
                "," + "stanje: " + posiljalac.stanjeNaRacunu);

        Racun primalac = new Racun();

        primalac.brojRacuna ="840-23932-323";
        primalac.imeIPrezime= "Milan Jovanovic";
        primalac.stanjeNaRacunu = 1000000;

//        System.out.println("Ime i prezime " + m.imeIPrezime +".");
//        System.out.println("Broj racuna je " + m.brojRacuna +".");
//        System.out.println("Stanje na racunu je  " + m.stanjeNaRacunu+".");

        System.out.println("Posaljilac: " + primalac.imeIPrezime + "," + primalac.brojRacuna +
                "," + "stanje: " + primalac.stanjeNaRacunu);

        System.out.println("Unesite sumu za transakciju:");
        int transakcija = s.nextInt();

        posiljalac.stanjeNaRacunu = posiljalac.stanjeNaRacunu - transakcija;
        primalac.stanjeNaRacunu = primalac.stanjeNaRacunu + transakcija;

        System.out.println("Posaljilac: " + posiljalac.imeIPrezime + "," + posiljalac.brojRacuna +
                "," + "stanje: " + posiljalac.stanjeNaRacunu);
        System.out.println("Posaljilac: " + primalac.imeIPrezime + "," + primalac.brojRacuna +
                "," + "stanje: " + primalac.stanjeNaRacunu);

    }
}
