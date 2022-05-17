package domaci_zadatak_17_04_2022;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Zadatak1 {
//    public static void main(String[] args) {
////        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
////        prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
//        Scanner s = new Scanner(System.in);
//        System.out.print("Unesite broj: ");
//        int unetaVrednost = s.nextInt();
//        int vrednostKojuStampamo = stampajVrednostZa10Vecu(unetaVrednost);
//        System.out.println(vrednostKojuStampamo);
//    }
//    static int stampajVrednostZa10Vecu(int unetaVrednost){
//        return unetaVrednost + 10;
//    }
//    JOS JEDAN NACIN
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Unesite vrednost: ");
    int unetaVrednost = s.nextInt();
    stampajVrednostZa10Vecu(unetaVrednost);


}
static void stampajVrednostZa10Vecu (int unetaVrednost){
    int vrednostKojuStampamo = unetaVrednost + 10;
    System.out.println(vrednostKojuStampamo);
}


}

