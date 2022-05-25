package domaci_zadatak_24_05_2022;

public class Transakcija {
    private String idTransakcije;
    private Racun prenosilacSredstava;
    private Racun primalacSredstava;

    public Transakcija(String idTransakcije, Racun prenosilacSredstava, Racun primalacSredstava) {
        this.idTransakcije = idTransakcije;
        this.prenosilacSredstava = prenosilacSredstava;
        this.primalacSredstava = primalacSredstava;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getPrenosilacSredstava() {
        return prenosilacSredstava;
    }

    public void setPrenosilacSredstava(Racun prenosilacSredstava) {
        this.prenosilacSredstava = prenosilacSredstava;
    }

    public Racun getPrimalacSredstava() {
        return primalacSredstava;
    }

    public void setPrimalacSredstava(Racun primalacSredstava) {
        this.primalacSredstava = primalacSredstava;
    }
    private double provizija (int prenosSredstava){
        if (prenosSredstava < 4500){
            return 45;
        } else {
            return prenosSredstava / 100;
        }
    }
    public void izvrsenjeTransakcije (int vrednostTransakcje){

        if (this.prenosilacSredstava.promenaStanjaNaRacunu(vrednostTransakcje * -1)){
            this.primalacSredstava.promenaStanjaNaRacunu(vrednostTransakcje);
        }
    }
}
