package VezbanjeZaTest;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite kilograme(kg): ");
        double tezina = s.nextDouble();
        System.out.println("Unesite visinu(m): ");
        double visina = s.nextDouble();
        double visinaNaKvadrat = visina * visina;
        double bmi = tezina / visinaNaKvadrat;

        if (bmi<18.5){
            System.out.println("Kategorija je neuhranjenost.");
        }
        if (bmi>18.5 && bmi<=24.99){
            System.out.println("Kategorija je normalna tezina.");
        }
        if (bmi>25 && bmi<=29.99){
            System.out.println("Kategorija je prekomerna tezina.");
        }
        if (bmi>30){
            System.out.println("Kategorija je gojaznost.");
        }
    }
}
