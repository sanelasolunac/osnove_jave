package p_16_05_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena. U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
//        Primer izvrsenja:
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic



        for (int i = 1; i < 6; i++) {
            printFirstName(); printLastName();
        }
//        Moze i jedno i drugo, ali lakse je sa petljom.
//        printFirstName(); printLastName();
//        printFirstName(); printLastName();
//        printFirstName(); printLastName();
//        printFirstName(); printLastName();
//        printFirstName(); printLastName();
    }

    static void printFirstName (){
        System.out.print("Sanela ");
    }
    static void printLastName () {
        System.out.println("Solunac");
    }
}
