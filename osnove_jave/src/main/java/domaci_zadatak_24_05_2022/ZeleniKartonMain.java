package domaci_zadatak_24_05_2022;

import java.util.ArrayList;

public class ZeleniKartonMain {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> nizZelenihKartona = new ArrayList<ZeleniKarton>();

        ZeleniKarton student1 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Molekulsko modeliranje 2", "Slavko Radenkovic", 10);

        nizZelenihKartona.add(student1);

        ZeleniKarton student2 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Analiticka hemija 3", "Zorka Stanic", 9);

        nizZelenihKartona.add(student2);

        ZeleniKarton student3 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Organska hemija 1", "Zorica Bugarcic", 7);

        nizZelenihKartona.add(student3);

        ZeleniKarton student4 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Filozofija i hemija", "Boris Furtla", 8);

        nizZelenihKartona.add(student4);

        ZeleniKarton student5 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Engleski jezik", "Anica Zivkovic", 6);

        nizZelenihKartona.add(student5);

        ZeleniKarton student6 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Racunari u hemiji", "Svetlana Markovic", 4);

        nizZelenihKartona.add(student6);

        ZeleniKarton student7 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Organske sinteze", "Milan Joksovic", 7);

        nizZelenihKartona.add(student7);

        ZeleniKarton student8 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Opsta hemija", "Milos Djuran", 5);

        nizZelenihKartona.add(student8);

        ZeleniKarton student9 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Fizicka hemija", "Slavko Radenkovic", 10);

        nizZelenihKartona.add(student9);

        ZeleniKarton student10 = new ZeleniKarton("Sanela Solunac", "1057/2022",
                "Organska hemija 2", "Vesna Divac", 10);

        nizZelenihKartona.add(student10);

        double prosecnaOcena = 0;
        double suma = 0;
        double prosecnaOcenaPolozenih = 0;
        double sumaPolozenihispita = 0;
        int brojac = 0;


        for (int i = 0; i < nizZelenihKartona.size(); i++) {

           ZeleniKarton sviIspiti = nizZelenihKartona.get(i);

           sviIspiti.stampa();

           suma = suma + nizZelenihKartona.get(i).getOcena();

           if (nizZelenihKartona.get(i).getOcena() > 5 ){

               sumaPolozenihispita = sumaPolozenihispita + nizZelenihKartona.get(i).getOcena();
               brojac ++;
           }
        }

        prosecnaOcena = suma / nizZelenihKartona.size();
        System.out.println("Prosecna ocena svih ispita je " + prosecnaOcena + ".");

        prosecnaOcenaPolozenih = sumaPolozenihispita / brojac;
        System.out.println("Prosecna ocena plozenih ispita je " + prosecnaOcenaPolozenih + ".");
    }
}
