import Zadania.*;

public class Main {
    public static void main(String[] args) {
        PobieranieLiczby pobieranieLiczby = new PobieranieLiczby();
        RowKwadratowe rowKwadratowe = new RowKwadratowe();
        WarFunkcji warFunkcji = new WarFunkcji();
        Kalkulator kalkulator = new Kalkulator();
        Sortowanie sortowanie = new Sortowanie();
        PogodaWarunki pogodaWarunki = new PogodaWarunki();
        PieniedzyWarunki pieniedzyWarunki = new PieniedzyWarunki();
        System.out.println("Podaj numer zadania:");
        int numZad = pobieranieLiczby.LiczbyInt();
        switch (numZad){
            case 1:
                rowKwadratowe.Obliczenia();
                break;
            case 2:
                warFunkcji.Funkcja1();
                warFunkcji.Funkcja2();
                warFunkcji.Funkcja3();
                break;
            case 3:
                sortowanie.Sort();
                break;
            case 4:
                pogodaWarunki.Deszcz();
                break;
            case 5:
                pieniedzyWarunki.Samochod();
                break;
            case 6:
                kalkulator.Obliczenia();
                break;
        }




    }
}