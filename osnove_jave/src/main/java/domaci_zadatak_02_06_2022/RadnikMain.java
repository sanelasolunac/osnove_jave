package domaci_zadatak_02_06_2022;

public class RadnikMain {
    public static void main(String[] args) {

        Magacioner radnik1 = new Magacioner("Sanela Solunac");
        Menadzer menadzer1 = new Menadzer("Milan Jovanovic");

        Sektor sektor1 = new Sektor("magacioner", 45000);
        Sektor sektor2 = new Sektor("administracija", 95000);

        radnik1.zaposliUSektor(sektor1);
        menadzer1.zaposliUSektor(sektor2);

        radnik1.stampa();
        menadzer1.stampa();
        radnik1.plataRadnika();
        menadzer1.plataRadnika();
    }
}
