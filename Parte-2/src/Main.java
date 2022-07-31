public class Main {
    public static void main(String[] args) {
        Coche micoche= new Coche();
        micoche.MasPuerta();
        System.out.println(micoche.puertas);
    }

}
class Coche{
    public int puertas=4;

    public void MasPuerta() {
        this.puertas++;
    }
}