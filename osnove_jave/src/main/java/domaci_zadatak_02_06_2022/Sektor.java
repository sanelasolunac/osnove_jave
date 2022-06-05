package domaci_zadatak_02_06_2022;

public class Sektor {

//    Kreirati klasu Sektor koja ima:
//    naziv sektora
//    platu koja je za taj sektor


    private String nazivSektora;
    private double platuZaTajSektor;

    public Sektor(String nazivSektora, double platuZaTajSektor) {
        this.nazivSektora = nazivSektora;
        this.platuZaTajSektor = platuZaTajSektor;
    }

    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public double getPlatuZaTajSektor() {
        return platuZaTajSektor;
    }

    public void setPlatuZaTajSektor(double platuZaTajSektor) {
        this.platuZaTajSektor = platuZaTajSektor;
    }
}
