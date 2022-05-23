package domaci_zadatak_20_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {

        FacebookPost objava1 = new FacebookPost();

        objava1.imeIPrezimeKorisnikaKojiJeObjavioPost = "Kristina Vujicic";
        objava1.imeIPRezimeKorisnikaNaKomeJePostObjavljen = "Sanela Solunac";
        objava1.tekstObjave = "Izvinjenje prihvaceno.";
        objava1.brojLajkova = 100;
        objava1.brojDeljenja = 15;

        objava1.stampa();

        FacebookPost objava2 = new FacebookPost("Sanela Solunac",
                "Kristina Vujicic", "Caos tica!");
        objava2.stampa();

    }
}
