package domaci_zadatak_23_05_2022;

public class Knjiga {

    private String isbnBroj;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga(String isbnBroj, String naziv, int godinaIzdanja, Autor autor) {
        this.isbnBroj = isbnBroj;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public String getIsbnBroj() {
        return isbnBroj;
    }

    public void setIsbnBroj(String isbnBroj) {
        this.isbnBroj = isbnBroj;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void stampa (){
        System.out.println(this.isbnBroj);
        System.out.println(this.naziv + " - " + this.godinaIzdanja);
        autor.stampa();
    }
}
