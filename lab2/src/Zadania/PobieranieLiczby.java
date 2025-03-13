package Zadania;

import java.util.Scanner;

public class PobieranieLiczby {
    public double LiczbyDouble(){
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }
    public int LiczbyInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public char ZnakChar(){
        Scanner scanner = new Scanner(System.in);
        char znak = scanner.next().charAt(0);
        return znak;
    }
    public String StringText(){
        Scanner scanner = new Scanner(System.in);
        String znak = scanner.nextLine();
        return znak;
    }
}
///pobieranie.LiczbyInt();