package Zadanie3;

public class Powiesc extends Ksiazka{
    String gatunek;
    public Powiesc(String nazwa,String autor, String opis, int rok_wydania, int liczba_stron, int cena, String gatunek) {
        super(nazwa, autor, opis, rok_wydania, liczba_stron, cena);
        this.gatunek = gatunek;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Gatunek: " + gatunek);
    }
}
