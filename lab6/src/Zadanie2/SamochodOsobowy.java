package Zadanie2;

public class SamochodOsobowy extends Samochod{
    double waga, pojem_sil;
    int ilosc_osob;

    public SamochodOsobowy(String marka, String model, String kolor, int ilosc_osob, int rok_produkcji, int przebieg, double waga, double pojem_sil) {
        super(marka, model, kolor, rok_produkcji, przebieg);
        if (waga>2 && waga<4.5)
            this.waga = waga;
        else
            System.out.println("Proszimy o podanie liczby od 2 do 4.5");

        if (pojem_sil >= 0.8 && pojem_sil <= 3.0)
            this.pojem_sil = pojem_sil;
        else
            System.out.println("Proszimy o podanie liczby od 0.8 do 3");
        this.ilosc_osob = ilosc_osob;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Ilość osób: " + ilosc_osob);
        System.out.println("Waga: " + waga);
        System.out.println("Pojemność śiłnika: " + pojem_sil);

    }
}
