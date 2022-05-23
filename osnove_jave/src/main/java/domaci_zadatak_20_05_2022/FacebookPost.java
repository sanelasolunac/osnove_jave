package domaci_zadatak_20_05_2022;

public class FacebookPost {
    public String imeIPrezimeKorisnikaKojiJeObjavioPost;
    public String imeIPRezimeKorisnikaNaKomeJePostObjavljen;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;


    public FacebookPost () {


    }
    public void stampa (){
        System.out.println(imeIPrezimeKorisnikaKojiJeObjavioPost + ">>>" + imeIPRezimeKorisnikaNaKomeJePostObjavljen);
        System.out.println(tekstObjave);
        System.out.println("Likes: " + brojLajkova + "|" + "Shares: " + brojDeljenja);
    }

    public FacebookPost(String imeIPrezimeKorisnikaKojiJeObjavioPost,
                        String imeIPRezimeKorisnikaNaKomeJePostObjavljen,String tekstObjave) {

        this.imeIPrezimeKorisnikaKojiJeObjavioPost = imeIPrezimeKorisnikaKojiJeObjavioPost;
        this.imeIPRezimeKorisnikaNaKomeJePostObjavljen = imeIPRezimeKorisnikaNaKomeJePostObjavljen;
        this.tekstObjave = tekstObjave;
    }

    public void postlike () {
        brojLajkova = brojLajkova + 1;
    }

    public void postshare () {
        brojDeljenja = brojDeljenja + 1;

    }

    public void postdislike () {
        brojLajkova = brojLajkova - 1;

    }

}
