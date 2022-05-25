package domaci_zadatak_24_05_2022;

public class RacunTransakcijaMain {
    public static void main(String[] args) {

        Racun posaljilac = new Racun("170-289328923-23","Sanela Solunac", 24000);

        Racun primalac = new Racun("170-289312345-23","Saska Solunac", 5000);

        Transakcija transakcija1 = new Transakcija("376299", posaljilac, primalac);

        primalac.stampa();
        posaljilac.stampa();

        posaljilac.promenaStanjaNaRacunu(5700);

        posaljilac.stampa();
        transakcija1.izvrsenjeTransakcije(4900);
        posaljilac.stampa();
        primalac.stampa();

    }
}
