package domaci_zadatak_23_05_2022;

public class AutorKnjigaMain {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Sanela", "Solunac");

        Knjiga knjiga1 = new Knjiga("764-32", "Kako preziveti kafanu u stiklama 14cm",
                2022, autor1);

        knjiga1.stampa();

//        SAD OZBILJNO

        Autor autor2 = new Autor("Nikolas", "Sparks");

        Knjiga knjiga2 = new Knjiga("456-55", "Setnja za pamcenje",
                1999, autor2);

        knjiga2.stampa();

        Autor autor3 = new Autor("Dzodzo", "Mojes");

        Knjiga knjiga3 = new Knjiga("876-44", "Dok tebe nisam srela",
                2016, autor3);

        knjiga3.stampa();


    }
}
