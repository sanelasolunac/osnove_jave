package domaci_zadatak_18_05_2022;

public class Proizvodi {
//    Napisati klasu Proizvod koja ima atribute
//    naziv proizvoda (String)
//    cenu proizvoda (double)
//    težinu proizvoda u gramima. (double)
//    i metode:
//    stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//    U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

    public String nazivProizvoda;
    public double cenaProizvoda;
    public double tezinaProizvodaUGramima;

    public void stampa () {

        System.out.println("{" + this.nazivProizvoda + "}" + ", " + "{"
                + this.cenaProizvoda + "}" + ", " + "{" + this.tezinaProizvodaUGramima + "g}");

    }
}
