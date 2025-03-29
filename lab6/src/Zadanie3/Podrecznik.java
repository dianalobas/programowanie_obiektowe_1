package Zadanie3;

public class Podrecznik extends Ksiazka{
    String przedmiot;
    int dlaKlasy;
    public Podrecznik(String nazwa, String autor, String opis, int rok_wydania,
                      int liczba_stron, int cena, int dlaKlasy, String przedmiot) {

        super(nazwa, autor, opis, rok_wydania, liczba_stron, cena);
        this.przedmiot = przedmiot;
        this.dlaKlasy = dlaKlasy;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Przedmiot: " + przedmiot);
        System.out.println("Dla klasy: " + dlaKlasy);
    }
}
