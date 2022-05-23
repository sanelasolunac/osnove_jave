package domaci_zadatak_18_05_2022;

public class MainProzvodi {
    public static void main(String[] args) {

        Proizvodi kamilica = new Proizvodi();

        kamilica.nazivProizvoda = "Kamilica caj";
        kamilica.cenaProizvoda = 122.9;
        kamilica.tezinaProizvodaUGramima = 100;

        kamilica.stampa();

        Proizvodi nana = new Proizvodi();

        nana.nazivProizvoda = "Nana caj";
        nana.cenaProizvoda = 99.0;
        nana.tezinaProizvodaUGramima = 100;

        nana.stampa();
    }
}
