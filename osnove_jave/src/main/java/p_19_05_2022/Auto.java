//package p_19_05_2022;
//
//public class Auto {
////    1.Zad
////    Kreirati klasu Auto koja ima:
////    ime i prezime vozaca
////    marku automobila
////    broj vrata
////    potrosnju na 100km (npr: 10)
////    trenutnu brzinu kojom se auto krece
////    metodu za stampu koja stampa podatke u formatu:
////            [Vozac]
////            [Marka] - [br vrata]-ro vrata
////    Sa potrosnjom od [potrosnja] l na 100km
////	[Trenutna brzina auta] km/h je trenutna brzina.
////
////    Primer:
////    Milan Jovanovic
////    BMW - 5-ro vrata
////    Sa potrosnjom od 10 l na 100km
////	200 km/h je trenutna brzina
//
//    public String imeIPrezimeVozaca;
//    public String markaAutomobila;
//    public int brojVrata;
//    public double potrosnja;
//    public double trenutnaBrzina;
//    public String registracija;
//    public boolean daLiJeKilmaUkljucena = true;
//
//    public int godinaProizvodnje;
//    public int mesecRegistrovanja;
//    public int kubikaza;
//
//    public int kapacitetRezervoara;
//
//    public int trenutnaKolicinaGoriva;
//    public int trenutnoURezervoaru;
//
//
//
//    public void stampa() {
//        System.out.println(this.imeIPrezimeVozaca);
//        System.out.println(this.markaAutomobila + "-" + this.brojVrata);
//        System.out.println("Sa potrosnjom od " + this.potrosnja + "l" + " na "
//                + this.trenutnaBrzina);
//        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina");
//
//    }
////    metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode
////    se prima ogranicenje (kao broj) a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//
//    public boolean daLiJeVozacPrekoracioBrzinu(int ogranicenje) {
//        if (ogranicenje > trenutnaBrzina) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public double kazna(int ogranicenje) {
//        if (this.trenutnaBrzina > ogranicenje) {
//            double brzina = this.trenutnaBrzina - ogranicenje + 1;
//            return brzina * 1000;
//
//        } else {
//            return 0;
//        }
//    }
//
//    public void dodajGas() {
//        this.trenutnaBrzina = this.trenutnaBrzina + 10;
//    }
//
//    public void metodaKoci() {
//        this.trenutnaBrzina = this.trenutnaBrzina - 10;
//
//        if (this.trenutnaBrzina < 0) {
//            this.trenutnaBrzina = 0;
//        }
//    }
//
//    public double trenutnaPotrosnjaAuta() {
//        if (this.daLiJeKilmaUkljucena == true) {
//            return (this.trenutnaBrzina / 100.0 * this.potrosnja) * 1.2;
//
//        } else {
//            return (this.trenutnaBrzina / 100.0 * this.potrosnja) * 1.0;
//
//        }
//    }
//
//    public boolean daLiJeAutoOldtajmer(int godinaProizvodnje) {
//        if (this.godinaProizvodnje < 1950) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean daLiJeRegistracijaIstekla (int trenutniMesec) {
//        if (this.mesecRegistrovanja < trenutniMesec) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//        public double cenaRegistracije (){
//            if (this.kubikaza < 2000) {
//                return this.kubikaza * 100;
//            } else {
//                return this.kubikaza*100*0.3;
//            }
//        }
//
//        public int natociGorivo (int kolicinaSipanogGoriva){
//        if (this.trenutnoURezervoaru + kolicinaSipanogGoriva <=this.kapacitetRezervoara){
//            return kolicinaSipanogGoriva *170;
//        } else {
//            return  this.kapacitetRezervoara - kolicinaSipanogGoriva * 170;
//        }
//
//}



