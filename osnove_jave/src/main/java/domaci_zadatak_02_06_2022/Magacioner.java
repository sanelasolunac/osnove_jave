package domaci_zadatak_02_06_2022;

public class Magacioner extends Radnik{
    public Magacioner(String imeIPrezime) {
        super(imeIPrezime);
    }
    private double prosecnaPlataZaSektore (){
        double suma = 0;
        int brojac = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            suma = suma + nizSektora.get(i).getPlatuZaTajSektor();
            brojac ++;
        } return suma / brojac * 0.5;
    }
    @Override
    public double plataRadnika(){
        int brojac2 = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            brojac2 ++;
        }
        return this.prosecnaPlataZaSektore() * brojac2;
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
