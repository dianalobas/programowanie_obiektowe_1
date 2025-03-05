package Task;

import java.util.Scanner;

public class Tasks {
    public String DataUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok urodzenia:");
        int year_born = scanner.nextInt();
        int age = 2025-year_born;
        scanner.nextLine(); // Очистка буфера после nextInt()
        System.out.println("Podaj imie:");
        String name = scanner.nextLine();
        return ("Mam na imie " + name + " i mam " + age + " lat");
    }

    public String SumaIloczynLiczb(int liczba1, int liczba2){
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe:");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe:");   /// w którym miejscu to trzeba było napisać? jaką poprawną strukturę trzeba mieć?
        int liczba2 = scanner.nextInt();*/
        int suma = liczba1 + liczba2;
        int iloczyn = liczba1 * liczba2;

        return ("Suma liczb: " + suma + "; Iloczyn liczb: " + iloczyn + ";" );
    }

    public boolean czyParzyctaLiczba(int liczba){
        if (liczba % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean Podzielnosc3i5(int liczba){
        if (liczba % 3 == 0 && liczba % 5 == 0)
            return true;
        else
            return false;
    }

    public int Potega(int liczba){
        int wynik = (int) Math.pow(liczba, 3);
        return wynik;
    }

    public double Pierwiastek(int liczba){
        double wynik = Math.pow(liczba, 1.0 / 2.0);
        return wynik;
    }

    public static boolean czyProstokatnyTrojkat(int a, int b, int c) {
        int[] boki = {a, b, c};
        java.util.Arrays.sort(boki);
        int bok1 = boki[0], bok2 = boki[1], hipotenza = boki[2];
        return (bok1 * bok1 + bok2 * bok2) == (hipotenza * hipotenza);
    }


}
