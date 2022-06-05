package domaci_zadatak_03_06_2022;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean daLiSeZaFlasuPlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina,
                            double brutoTezina, double kaucija, boolean daLiSeZaFlasuPlacaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSeZaFlasuPlacaKaucija = daLiSeZaFlasuPlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSeZaFlasuPlacaKaucija() {
        return daLiSeZaFlasuPlacaKaucija;
    }

    public void setDaLiSeZaFlasuPlacaKaucija(boolean daLiSeZaFlasuPlacaKaucija) {
        this.daLiSeZaFlasuPlacaKaucija = daLiSeZaFlasuPlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla(){
        if (this.daLiSeZaFlasuPlacaKaucija == true){
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }
    @Override
    public void stampa(){
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " + this.nazivArtikla);
        System.out.println("Neto tezina: " + this.netoTezina);
        System.out.println("Bruto tezina: " + this.brutoTezina);
        System.out.println("Da li se placa kaucija: " + this.daLiSeZaFlasuPlacaKaucija);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }
}
