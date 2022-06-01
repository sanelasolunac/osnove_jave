package domaci_zadatak_31_05_2022;

import java.util.ArrayList;

public class IgracOsobaTrenerMain {
    public static void main(String[] args) {

        Igrac igrac1 = new Igrac();
        igrac1.setImeIPrezime("Sanela Solunac");
        igrac1.setJmbg("2110995725026");
        igrac1.setGodinaRodjenja(1995);
        igrac1.setBrojDresa(3);
        igrac1.setPozicija("napadac");
        igrac1.setKapiten(true);

        igrac1.stampa();

        Igrac igrac2 = new Igrac("Saska Solunac", "2347230947230947",1993);
        igrac2.setKapiten(false);
        igrac2.setPozicija("odbrana");
        igrac2.setBrojDresa(7);

        igrac2.stampa();

        Trener trener1 = new Trener("Lazar Kostic", "3005994720026",
                1994,5,"kondicioni");
        trener1.stampa();

        Trener trener2 = new Trener();
        trener2.setGodineIskustva(5);
        trener2.setTipTrenera("kondicioni");
        trener2.setJmbg("0472097503947");
        trener2.setImeIPrezime("Lazar Kostic");
        trener2.setGodinaRodjenja(1994);

        trener2.stampa();

//        ArrayList<Igrac> nizIgraca = new ArrayList<Igrac>();
//        ArrayList<Trener> nizTrenera = new ArrayList<Trener>();
//
//

    }
}
