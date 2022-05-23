package domaci_zadatak_18_05_2022;

public class SmartAirConditioning {
//    Kreirati klasu SmartAirConditioning koja ima:
//    atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//    atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//    atribut za mod (hladi/greje)
//    metodu za stampu - stampa u formatu: Proizvoljno :)
//
//
//    U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning
//    i za svaki od njih pozvati metodu za stampu

    public String markaKlime;
    public double izabranaTemperatura;
    public String mod;

    public void stampa (){
        System.out.println("Klima je marke " + this.markaKlime +
                " trenutna izabrana temperatura je " + this.izabranaTemperatura +
                ". Trenutni mod klime: " + this.mod);

        if (this.izabranaTemperatura > 35){
            izabranaTemperatura = 35;

        } if (this.izabranaTemperatura < 16) {
            izabranaTemperatura = 16;
        }
    }
}
