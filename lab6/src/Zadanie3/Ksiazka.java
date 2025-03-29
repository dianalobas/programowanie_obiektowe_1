package Zadanie3;

public class Ksiazka {
    String nazwa, autor, opis;
    int rok_wydania, liczba_stron, cena;

    public Ksiazka(String nazwa, String autor, String opis, int rok_wydania, int liczba_stron, int cena) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.opis = opis;
        this.rok_wydania = rok_wydania;
        this.liczba_stron = liczba_stron;
        this.cena = cena;
    }
    public void Print(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Autor: " + autor);
        System.out.println("Opis: " + opis);
        System.out.println("Rok wydania: " + rok_wydania);
        System.out.println("Liczba stron: " + liczba_stron);
        System.out.println("cena: " + cena);
    }
}
