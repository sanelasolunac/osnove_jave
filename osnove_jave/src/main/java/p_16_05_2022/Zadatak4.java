package p_16_05_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//        4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa
//        razlicitim prosledjenim vrednostima.
//        for (int i = 1; i < 7; i++) {
//            printZvezdice();
//        }
//        System.out.println();
//        for (int i = 1; i < 6; i++) {
//            printZvezdice();
//        }
//        System.out.println();
//        for (int i = 1; i < 5; i++) {
//            printZvezdice();
//        }
//        System.out.println();
//        for (int i = 1; i < 4; i++) {
//            printZvezdice();
//        }
//        System.out.println();
//        for (int i = 1; i < 3; i++) {
//            printZvezdice();
//        }
//        System.out.println();
//        for (int i = 1; i < 2; i++) {
//            printZvezdice();
//        }
//        JOS JEDNO RESENJE
//        for (int i = 0; i < 6; i++) {
//
//            for (int j= 0; j < i ; j++) {
//                zvezdica();
//            }
//            System.out.println(" ");
//        }

        for (int i = 1; i < 22; i++) {
            printZvezdice();
            if (i== 6){
                System.out.println();
            }
            if (i==11){
                System.out.println();
            } if (i==15){
                System.out.println();
            } if (i==18) {
                System.out.println();
            } if (i == 20){
                System.out.println();
            }
        }
    }
    static void printZvezdice () {
        System.out.print("* ");
    }
}
