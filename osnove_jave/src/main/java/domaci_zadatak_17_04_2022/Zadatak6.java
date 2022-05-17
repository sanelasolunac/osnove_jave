package domaci_zadatak_17_04_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca
//        najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj1 = s.nextInt();
        System.out.print("Unesite broj: ");
        int broj2 = s.nextInt();
        System.out.print("Unesite broj: ");
        int broj3 = s.nextInt();
        najmanjiBroj(broj1,broj2, broj3);
    }
    static void najmanjiBroj (int broj1, int broj2, int broj3){
        if (broj1<broj2 && broj1<broj3){
            System.out.println("Najmanji broj je " + broj1);
        }  if (broj2<broj3 && broj2<broj1){
            System.out.println("Najmanji broj je " + broj2);
        } if (broj3<broj2 && broj3<broj1){
            System.out.println("Najmanji broj je " + broj3);
        }
    }
}
