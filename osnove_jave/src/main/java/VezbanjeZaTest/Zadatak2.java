package VezbanjeZaTest;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int difoltanZvuk = 75;

        int i = 1;

        String akcija = "";

        while (!akcija.equals("PLAY")){

            System.out.println("Akcija:");
            akcija = s.next();

            if (akcija.equals("up") && difoltanZvuk<91){
                difoltanZvuk = difoltanZvuk + 10;
            } if (akcija.equals("down") && difoltanZvuk > 9){
                difoltanZvuk = difoltanZvuk - 10;
            } if (akcija.equals("mute")){
                difoltanZvuk=0;
            }
            i++;
        }
        System.out.println(difoltanZvuk);
    }
}
