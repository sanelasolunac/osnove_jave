package p_16_05_2022;

public class Zadatak10 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        6 - VI
//        7 - VII
//        8 - VIII
//        9 - IX
//        10 - X
//
//        Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//                Ako se unese VIII vraca se 8.
//
//        VIII => 8
//        BIO JE NA TESTU

        int x = rimskiBrojevi("I");
        System.out.println(x);
    }
    static int rimskiBrojevi (String unetiBroj){
        if (unetiBroj.equals("I")){
            return 1;
        }  if (unetiBroj.equals("II")){
            return 2;
        }  if (unetiBroj.equals("III")){
            return 3;
        }  if (unetiBroj.equals("IV")){
            return 4;
        }  if (unetiBroj.equals("V")){
            return 5;
        }  if (unetiBroj.equals("VI")){
            return 6;
        }  if (unetiBroj.equals("VII")){
            return 7;
        }  if (unetiBroj.equals("VIII")){
            return 8;
        }  if (unetiBroj.equals("IX")){
            return 9;
        }  if (unetiBroj.equals("X")){
            return 10;
        } else {
            return 0;
        }
    }
}
