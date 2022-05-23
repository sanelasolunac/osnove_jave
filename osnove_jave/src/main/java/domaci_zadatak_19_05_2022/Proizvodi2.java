package domaci_zadatak_19_05_2022;

public class Proizvodi2 {
    public String nazivProizvoda;
    public double cenaProizvoda;
    public  double tezinaProizvoda;



    public void stampa (){
        System.out.println("{" + this.nazivProizvoda + "}" + ", " + "{"
                + this.cenaProizvoda + "din }" + ", " + "{" + this.tezinaProizvoda + "g}");
    }

    public void povecajCenu (double povecanjeCene){

        this.cenaProizvoda = this.cenaProizvoda + povecanjeCene;
    }

    public double popust (double popust) {
        return cenaProizvoda - (cenaProizvoda* popust/ 100);

    }
    public double racunajPostarinu () {

        if (this.tezinaProizvoda <= 100 ) {
            return 200;
        } if (this.tezinaProizvoda > 100 && this.tezinaProizvoda < 500 ){
            return 400;
        } if (this.tezinaProizvoda > 500){
            return 1000;
        }
        return 0;

    }

}
