package VezbanjeZaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class LotoZadatak {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList <Integer> odigranaKombinacija = new ArrayList<Integer>();

        for (int i = 1; i <= 7; i++) {
            System.out.print("Unesite broj za loto kombinaciju: ");
            int odigraniBroj = s.nextInt();
            odigranaKombinacija.add(odigraniBroj);
        }

        ArrayList<Integer> dobitnaKombinacija = new ArrayList<Integer>();

        for (int i = 1; i <=7 ; i++) {
            System.out.print("Unesite dobitnu kombinaciju: ");
            int dobitniBroj =s.nextInt();
            dobitnaKombinacija.add(dobitniBroj);
        }

        boolean dobitak =daLiJeKombinacijaDobitna(odigranaKombinacija, dobitnaKombinacija);
                if (dobitak == true){
                    System.out.println("Uneta kombinacija je tacna!");
                } else {
                    System.out.println("Uneta kombinacija je netacna!");
                }

    }
    static boolean daLiJeKombinacijaDobitna (ArrayList<Integer> odigranaKombinacija,
                                             ArrayList<Integer> dobitnaKombinacija){
        int suma = 0;
        for (int i = 0; i < odigranaKombinacija.size(); i++) {
            if (odigranaKombinacija == dobitnaKombinacija){
                suma = suma + 1;

            } if (suma == odigranaKombinacija){
                return true;
            } else {
                return false;
            }

        }
    }
}
