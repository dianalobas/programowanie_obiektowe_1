package Zadania;

public class Kalkulator {
    public void Obliczenia(){
        PobieranieLiczby pobieranieLiczby = new PobieranieLiczby();
        double wynik;
        System.out.println("Podaj pierwszą liczbę: ");
        double liczba1 = pobieranieLiczby.LiczbyInt();
        System.out.println("Podaj znak działania (+, -, *, /): ");
        char znak = pobieranieLiczby.ZnakChar();
        System.out.println("Podaj drugą liczbę: ");
        double liczba2 = pobieranieLiczby.LiczbyInt();
        if (znak == '+'){
            wynik = liczba1 + liczba2;
            System.out.println("Odpowiedź: " + wynik);
        } else if (znak == '-') {
            wynik = liczba1 - liczba2;
            System.out.println("Odpowiedź: " + wynik);
        } else if (znak == '*') {
            wynik = liczba1 * liczba2;
            System.out.println("Odpowiedź: " + wynik);
        } else if (znak == '/'){
            if (liczba2 == 0)
                System.out.println("Nie można dzielić na zero");
            else {
                wynik = liczba1 / liczba2;
                System.out.println("Odpowiedź: " + wynik);
            }
        } else if (znak == '%'){
            if (liczba2 == 0)
                System.out.println("Nie można dzielić na zero");
            else {
                wynik = liczba1 % liczba2;
                System.out.println("Odpowiedź: " + wynik);
            }
        } else{
            System.out.println("Niema rakiego znaku działania");
        }
    }
}
