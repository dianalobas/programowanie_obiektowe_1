
public class Main {
    public static void main(String[] args) {
        /// Zadanie 1 ///
        Swiatlo swiatlo1 = Swiatlo.ZIELONE;
        System.out.println(swiatlo1.getKomunikat());
        Swiatlo swiatlo2 = Swiatlo.CZERWONE;
        System.out.println(swiatlo2.getKomunikat());
        /// Zadanie 2 ///
        PizzaSize pizzaSizeS = PizzaSize.SREDNIA;
        System.out.println("Pizza średnia ma pole "+ pizzaSizeS.getSrednica() + "cm, kosztuje -> " + pizzaSizeS.getCena()+"zł");
        PizzaSize pizzaSizeM = PizzaSize.MALA;
        System.out.println("Pizza mała o średnice "+ pizzaSizeM.getSrednica() + "cm, kosztuje -> " + pizzaSizeM.getCena()+"zł");
    }
}
/// Zadanie 1 ///
enum Swiatlo{
    CZERWONE("Stój!"),
    ZOLTE("Uwaga"),
    ZIELONE("Jedź");
    private final String komunikat;

    Swiatlo(String komunikat) {
        this.komunikat = komunikat;
    }
    public String getKomunikat() {
        return komunikat;
    }
}
/// Zadanie 2 ///
enum PizzaSize{
    MALA(10, 29.9),
    SREDNIA(15, 49.9),
    DUZA(20, 59.9);

    private final int srednica;
    private final double cena;
    PizzaSize(int srednica, double cena) {
        this.srednica = srednica;
        this.cena = cena;
    }
    public double getCena(){
        return cena;
    }

    public int getSrednica() {
        return srednica;
    }
}