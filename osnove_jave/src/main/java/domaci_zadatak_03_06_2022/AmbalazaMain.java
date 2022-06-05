package domaci_zadatak_03_06_2022;

public class AmbalazaMain {
    public static void main(String[] args) {
        Ambalaza ambalaza1 = new StaklenaAmbalaza("9482732-2-2222", "Pivo", 50,
                75, 65,true,105);

        Ambalaza ambalaza2 = new Tetrapak("234345-234-232", "Sok od jabuke",170,
                200,true,150);

        Ambalaza ambalaza3 = new StaklenaAmbalaza("238402-2423-2424", "Belo vino", 250,
                350, 0, false, 450);

        SuperKartica kartica1 = new SuperKartica("20348023", "Sanela Solunac", 50);


        ambalaza1.stampa();
        ambalaza2.stampa();
        ambalaza3.stampa();

        Korpa korpa1 = new Korpa();
        korpa1.dodajAmbalazu(ambalaza1);
        korpa1.dodajAmbalazu(ambalaza2);
        korpa1.dodajAmbalazu(ambalaza3);
        korpa1.cenaCeleKorpe(kartica1);


        System.out.println("Ukupna cena korpe: " + korpa1.cenaCeleKorpe(kartica1));
    }
}
