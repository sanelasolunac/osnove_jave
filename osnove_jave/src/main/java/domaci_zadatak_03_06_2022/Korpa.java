package domaci_zadatak_03_06_2022;

import java.util.ArrayList;

public class Korpa {
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se
//    prima Super karticu iz koje se cita popust.

    private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

    public void dodajAmbalazu (Ambalaza ambalaza){
        nizAmbalaza.add(ambalaza);
    }
    public void izbaciAmbalazu (String unetBarkod){
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            if (nizAmbalaza.get(i).barkod.equals(unetBarkod)){
                nizAmbalaza.remove(i);
            }
        }
    }
//    NE ZNAM STA SE TRAZI
    private double cenaAmbalazeSaPopustom (int popust){
        double cenaSaPopustom = 0;
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            cenaSaPopustom = nizAmbalaza.get(i).cenaArtikla() - (nizAmbalaza.get(i).cenaArtikla() * popust/100);
        }return cenaSaPopustom;
    }
    public double cenaCeleKorpe (SuperKartica superKartica){
        double sumaCeleKorpe = 0;

        for (int i = 0; i < nizAmbalaza.size(); i++) {
            sumaCeleKorpe += nizAmbalaza.get(i).cenaArtikla() - (nizAmbalaza.get(i).cenaArtikla() * superKartica.getPopusti()/100);
        }
        return sumaCeleKorpe;
    }
}
