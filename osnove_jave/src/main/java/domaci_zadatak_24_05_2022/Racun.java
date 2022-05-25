package domaci_zadatak_24_05_2022;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;
    private int stanjeNaRacunu;

    public Racun(String brojRacuna, String imeIPrezime, int stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public boolean promenaStanjaNaRacunu (int podizanjeNovca) {

        if (this.stanjeNaRacunu + podizanjeNovca < 0){
            System.out.println("Nemate dovoljno sredstava na racunu. ");
            return false;
        } else {
            this.stanjeNaRacunu = this.stanjeNaRacunu + podizanjeNovca;
            return  true;
        }
    }
    public void stampa (){
        System.out.println(this.imeIPrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je " + this.getStanjeNaRacunu() + ".rsd. ");
    }
}
