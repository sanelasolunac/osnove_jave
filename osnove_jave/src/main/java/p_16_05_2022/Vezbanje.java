package p_16_05_2022;

import java.util.Scanner;

public class Vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ime:");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite godine: ");
        int godine = s.nextInt();
        printPerson(ime, prezime, godine);
//        System.out.println("KRAJ");
    }
    static  void printPerson (String fname, String lname, int age){
        System.out.println(fname + " "+ lname + ", age: " + age);
    }
}
