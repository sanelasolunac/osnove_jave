package p_16_05_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //        4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa
//        razlicitim prosledjenim vrednostima.
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();

        operacija(a,b);
    }

    static void operacija (int a, int b){
        int sabiranje = a + b;
        int oduzimanje = a - b;
        int kolicnik = a / b;
        int proizvod = a * b;
        System.out.println("Zbir je: " + sabiranje +"," + " Razlika je: " + oduzimanje+ "," + "Kolicnik je: " +kolicnik
                + "," + "Proizvod je: " + proizvod);
    }
}
//    Scanner s = new Scanner(System.in);
//        System.out.print("Unesite a:");
//                int a = s.nextInt();
//                System.out.print("Unesite b:");
//                int b = s.nextInt();
//                System.out.println();
//                operacije(a,b);
//
//                }
//
//static void operacije(int a , int b) {
//        System.out.println("Zbir: " +  ( a + b));
//        System.out.println("Razlika: " + ( a -  b));
//        System.out.println("Proizvod: " + ( a *  b));
//        System.out.println("Kolicnik: " + (  a / b));
//        }
//JOS JEDNO RESENJE