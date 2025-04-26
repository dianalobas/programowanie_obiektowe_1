import Zadania.Adres;
import Zadania.NieprawidlowyAdresException;
import Zadania.Runner;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.pierwiastek();
        System.out.println(runner.silnia(5));
        ///System.out.println(runner.silnia(-5));

        System.out.println();
        System.out.println("Poprawny adres");
        try {
            Adres adres = new Adres("Krakowska", "Warszawa", "02-123", 7);
            System.out.println("Adres został poprawnie utworzony");
        } catch (NieprawidlowyAdresException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Błędny adres");
        try {
            Adres adresBledny = new Adres("", "Kraków", "1284", -4);
            System.out.println("Adres został poprawnie utworzony");
        } catch (NieprawidlowyAdresException e) {
            System.out.println(e.getMessage());
        }

    }
}