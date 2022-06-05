package domaci_zadatak_03_06_2022;

public class SuperKartica {
    private String brojKartice;
    private String imeIPrezime;
    private int popusti;

    public SuperKartica(String brojKartice, String imeIPrezime, int popusti) {
        this.brojKartice = brojKartice;
        this.imeIPrezime = imeIPrezime;
        this.popusti = popusti;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getPopusti() {
        return popusti;
    }

    public void setPopusti(int popusti) {
        this.popusti = popusti;
    }
    public void stampa (){
        System.out.println(this.brojKartice + ", " + this.imeIPrezime);
    }
}
