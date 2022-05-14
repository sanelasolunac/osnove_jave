//package domaci_zadatak_13_05_2022;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Zadatak1 {
//    public static void main(String[] args) {
////        Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
////                Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad, ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
////        Za racunanje sume, nije potrebna petlja!
//        Scanner s = new Scanner(System.in);
//        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
//        int suma = 0;
//
//        nizBrojeva.add(1);
//        nizBrojeva.add(2);
//        nizBrojeva.add(3);
//        nizBrojeva.add(4);
//        nizBrojeva.add(5);
//        nizBrojeva.add(1);
//        nizBrojeva.add(2);
//        nizBrojeva.add(3);
//        nizBrojeva.add(4);
//        nizBrojeva.add(5);
//        nizBrojeva.add(1);
//        nizBrojeva.add(2);
//        nizBrojeva.add(3);
//        nizBrojeva.add(4);
//        nizBrojeva.add(5);
//        nizBrojeva.add(1);
//        nizBrojeva.add(2);
//        nizBrojeva.add(3);
//        nizBrojeva.add(4);
//        nizBrojeva.add(5);
//        nizBrojeva.add(1);
//        nizBrojeva.add(2);
//        nizBrojeva.add(3);
//        nizBrojeva.add(4);
//        nizBrojeva.add(5);
//
//        for (int i = 0; i < nizBrojeva.size(); i++) {
//            System.out.print(nizBrojeva.get(i) + ",");
//            if (i % 5 == 4) {
//                System.out.println();
//            }
//        }
//            System.out.print("Unesite poziciju:");
//            int pozicija = s.nextInt();
//
//            int levo = nizBrojeva.get(pozicija-1);
//            int desno = nizBrojeva.get(pozicija+1);
//            int gore = nizBrojeva.get(pozicija-5);
//            int dole = nizBrojeva.get(pozicija + 5);
//
//            if (nizBrojeva.get(pozicija) == pozicija ||
//                    nizBrojeva.get(pozicija) > 5 ||
//                    nizBrojeva.get(pozicija) <= 18) {
//                suma = gore + dole + desno + levo + nizBrojeva.get(pozicija);
//
//            }
//            if( pozicija == 9 || pozicija == 14 || pozicija == 19){
//                suma = gore + dole +levo;
//            }
//            if (nizBrojeva.get(pozicija) == pozicija || pozicija == 21 || pozicija == 22 || pozicija == 23){
//                suma = desno + levo + gore + nizBrojeva.get(pozicija);
//            }
//            if (pozicija == 5 || pozicija == 10 || pozicija == 15){
//                suma = desno + dole + gore;
//            }
//            if (pozicija == 1 || pozicija == 2 || pozicija == 3){
//                suma = desno + levo + dole + nizBrojeva.get(pozicija);
//            }
//
//        System.out.println("Suma je " + suma);
//        }
//    }
