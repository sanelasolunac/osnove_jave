//package p_19_05_2022;
//
//import java.util.Scanner;
//
//public class MainAuto {
//    public static void main(String[] args) {
//        //    1.Zad
////    Kreirati klasu Auto koja ima:
////    ime i prezime vozaca
////    marku automobila
////    broj vrata
////    potrosnju na 100km (npr: 10)
////    trenutnu brzinu kojom se auto krece
////    metodu za stampu koja stampa podatke u formatu:
////            [Vozac]
////            [Marka] - [br vrata]-ro vrata
////    Sa potrosnjom od [potrosnja] l na 100km
////	[Trenutna brzina auta] km/h je trenutna brzina.
////
////    Primer:
////    Milan Jovanovic
////    BMW - 5-ro vrata
////    Sa potrosnjom od 10 l na 100km
////	200 km/h je trenutna brzina
//
//
//
//        Auto auto1 = new Auto();
//
//        auto1.imeIPrezimeVozaca = "Sanela Solunac";
//        auto1.markaAutomobila = "BMW";
//        auto1.brojVrata = 5;
//        auto1.potrosnja = 9.5;
//        auto1.trenutnaBrzina = 130.5;
//        auto1.registracija= "KG 230 FV";
//        auto1.godinaProizvodnje = 1970;
//        auto1.mesecRegistrovanja = 5;
//        auto1.kubikaza =1970;
//        auto1.kapacitetRezervoara = 50;
//        auto1.trenutnoURezervoaru= 29;
//
//
//
//
//
//
//        auto1.stampa();
//
//        boolean ogranicenjeBrzine = auto1.daLiJeVozacPrekoracioBrzinu(80);
//        if (ogranicenjeBrzine == true){
//            System.out.println("Vozac je prekoracio brzinu.");
//        } else {
//            System.out.println("Vozac nije prekoracio brzinu.");
//        }
//
//        double kaznaZaPrekoracenje = auto1.kazna(140);
//
//        System.out.println(kaznaZaPrekoracenje);
//
//        auto1.dodajGas();
//
//        double z = auto1.trenutnaPotrosnjaAuta();
//        System.out.println("Trenutna potrosnja je " + z);
//
//        boolean oldtajmer = auto1.daLiJeAutoOldtajmer(1970);
//        if (oldtajmer==true){
//            System.out.println("Auto je oldtajmer.");
//        } else {
//            System.out.println("Auto nije oldtajmer.");
//        }
//
//        System.out.println(oldtajmer);
//
//        boolean trenutnaRegistracija = auto1.daLiJeRegistracijaIstekla(7);
//
//        if (trenutnaRegistracija == true) {
//            System.out.println("Registracija je istekla.");
//        } else {
//            System.out.println("Registracija nije istekla.");
//        }
//
//        System.out.println(trenutnaRegistracija);
//
//        double cenaRegistrovanjaAutomobila = auto1.cenaRegistracije();
//
//        System.out.println("Cena regstracije je " + cenaRegistrovanjaAutomobila);
//
//
//
//
//
//
//
//
//
//
//        Auto auto2 = new Auto();
//
//        System.out.println();
//
//        auto2.imeIPrezimeVozaca = "Sanela Solunac";
//        auto2.markaAutomobila = "Audi";
//        auto2.brojVrata = 3;
//        auto2.potrosnja = 11;
//        auto2.trenutnaBrzina = 170;
//        auto2.registracija= "KG 230 FV";
//
//
//        auto2.stampa();
//
//        ogranicenjeBrzine = auto2.daLiJeVozacPrekoracioBrzinu(130);
//        if (ogranicenjeBrzine == true){
//            System.out.println("Vozac je prekoracio brzinu.");
//        } else {
//            System.out.println("Vozac nije prekoracio brzinu.");
//        }
//
//        kaznaZaPrekoracenje = auto2.kazna(140);
//
//        System.out.println(kaznaZaPrekoracenje);
//
//        auto2.metodaKoci();
//        auto2.metodaKoci();
//        auto2.metodaKoci();
//        auto2.metodaKoci();
//        auto2.metodaKoci();
//
//        auto2.stampa();
//
//
//
//    }
//}
