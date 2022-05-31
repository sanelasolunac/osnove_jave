package domaci_zadatak_30_05_2022;

public class IspitStudentMain {
    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Molekulsko modeliranje 2", 10,"Slavko Radenkovic");
        Ispit ispit2 = new Ispit("Opsta hemija", 9,"Milos Djuran");
        Ispit ispit3 = new Ispit("Organska hemija", 7,"Zorica Bugarcic");
        Ispit ispit4 = new Ispit("Analiticka hemija 3", 8,"Zorka Stanic");


        Student student1 = new Student("1057/2021", "Sanela Solunac",
                "Master akademske studije");

        student1.dodajIspit(ispit1);
        student1.dodajIspit(ispit2);
        student1.dodajIspit(ispit3);
        student1.dodajIspit(ispit4);
        student1.stampa();
    }
}
