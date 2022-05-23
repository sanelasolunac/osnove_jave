package domaci_zadatak_19_05_2022;

public class Proizvodi2Main {
    public static void main(String[] args) {

        Proizvodi2 prsuta = new Proizvodi2();

        prsuta.nazivProizvoda = "Prsuta delikates";
        prsuta.cenaProizvoda = 799.99;
        prsuta.tezinaProizvoda = 1000;

        prsuta.stampa();

        double popustNaProizvod = prsuta.popust(30);

        System.out.println("Cena sa popustom je: " + popustNaProizvod);

        double cenaPostarine = prsuta.racunajPostarinu();

        System.out.println("Cena postarine je: " + cenaPostarine);
    }
}
