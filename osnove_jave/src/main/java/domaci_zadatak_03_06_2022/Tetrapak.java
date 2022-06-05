package domaci_zadatak_03_06_2022;

public class Tetrapak extends Ambalaza{
    private boolean reciklabilno;
    private double osnovnaCena;

    public boolean isReciklabilno() {
        return reciklabilno;
    }

    public void setReciklabilno(boolean reciklabilno) {
        this.reciklabilno = reciklabilno;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
                    boolean reciklabilno, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklabilno = reciklabilno;
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla(){
        if (this.reciklabilno == true){
           return this.tezinaPakovanja() * 1.5 * this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }
    @Override
    public void stampa(){
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " + this.nazivArtikla);
        System.out.println("Neto tezina: " + this.netoTezina);
        System.out.println("Bruto tezina: " + this.brutoTezina);
        System.out.println("Da li je materijal reciklabilan: " + this.reciklabilno);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }
}
