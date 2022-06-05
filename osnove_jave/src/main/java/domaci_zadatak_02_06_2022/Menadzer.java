package domaci_zadatak_02_06_2022;

public class Menadzer extends Radnik{

//    Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//    override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.


    public Menadzer(String imeIPrezime) {
        super(imeIPrezime);
    }

    @Override
    public double plataRadnika(){
        double suma = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            suma = suma + nizSektora.get(i).getPlatuZaTajSektor();
        } return suma;
    }
    @Override
    public void stampa (){
        System.out.println("Radnik: " + this.imeIPrezime);
        System.out.print("Sektor: ");
        for (int i = 0; i < nizSektora.size(); i++) {
            System.out.println(nizSektora.get(i).getNazivSektora());
        }
        System.out.print("Plata: ");
        for (int i = 0; i < nizSektora.size(); i++) {
            System.out.println(nizSektora.get(i).getPlatuZaTajSektor());
        }
    }

}
