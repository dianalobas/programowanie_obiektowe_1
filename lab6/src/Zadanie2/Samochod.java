package Zadanie2;

public class Samochod {
    String marka, model, kolor;
    int rok_produkcji, przebieg;
    public Samochod(){
        this.marka = "niewiadoma";
        this.model = "niewiadomy";
        this.kolor = "niewiadomy";
        this.rok_produkcji = 0;
        this.przebieg = 0;
    }
    public Samochod(String marka, String model, String kolor, int rok_produkcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rok_produkcji = rok_produkcji;
        if (przebieg >= 0) {
            this.przebieg = przebieg;
        } else {
            System.out.println("Proszimy o podanie dodatniej liczby");
        }
    }
    public void Print(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rok_produkcji);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Kolor: " + kolor);
    }
}