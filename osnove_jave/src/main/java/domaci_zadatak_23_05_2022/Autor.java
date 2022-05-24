package domaci_zadatak_23_05_2022;

public class Autor {
    private String imeAutora;
    private String prezimeAutora;

    public Autor(String imeAutora, String prezimeAutora) {
        this.imeAutora = imeAutora;
        this.prezimeAutora = prezimeAutora;
    }

    public String getImeAutora() {
        return imeAutora;
    }

    public void setImeAutora(String imeAutora) {
        this.imeAutora = imeAutora;
    }

    public String getPrezimeAutora() {
        return prezimeAutora;
    }

    public void setPrezimeAutora(String prezimeAutora) {
        this.prezimeAutora = prezimeAutora;
    }
    public void stampa (){
        System.out.println("Autor: " +this.imeAutora + " " + this.prezimeAutora);
    }
}
