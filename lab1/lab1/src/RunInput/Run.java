package RunInput;

import Task.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Run {
    public void RunTask(){
        Tasks tasks = new Tasks(); //не очень понятно
        System.out.println("Laboratorium 1\n");
        System.out.println("Zadanie 1\n");
        System.out.println("Zadanie 2\n");
        System.out.println("Zadanie 3\n");
        System.out.println("Zadanie 4\n");
        System.out.println("Zadanie 5\n");
        System.out.println("Zadanie 6\n");
        System.out.println("Zadanie 7\n");
        System.out.println("Wybierz zadanie");

        int wybor = InputInt();
        switch (wybor){
            case 1:System.out.print(tasks.DataUser()); break;
            case 2:
                System.out.println("Podaj pierwsza liczbe:");
                int liczba1 = InputInt();
                System.out.println("Podaj druga liczbe:");
                int liczba2 = InputInt();
                System.out.print(tasks.SumaIloczynLiczb(liczba1, liczba2));
                break;
            case 3:
                System.out.println("Podaj liczbe:");
                int liczba3 = InputInt();
                System.out.print(tasks.czyParzyctaLiczba(liczba3));
                break;
            case 4:
                System.out.println("Podaj liczbe:");
                int liczba4 = InputInt();
                System.out.print(tasks.Podzielnosc3i5(liczba4));
                break;
            case 5:
                System.out.println("Podaj liczbe: ");
                int liczba5 = InputInt();
                System.out.print(tasks.Potega(liczba5));
                break;
            case 6:
                System.out.println("Podaj liczbe: ");
                int liczba6 = InputInt();
                System.out.print(tasks.Pierwiastek(liczba6));
                break;
            case 7:
                System.out.println("Podaj liczbe: ");
                int liczbaA = InputInt();
                int liczbaB = InputInt();
                if (liczbaA >= liczbaB) {
                    System.out.println("Błąd: a musi być mniejsze niż b.");
                    return;
                }
                Random generator = new Random();
                int strona1 = generator.nextInt(liczbaA,liczbaB);
                int strona2 = generator.nextInt(liczbaA,liczbaB);
                int strona3 = generator.nextInt(liczbaA,liczbaB);
                System.out.println("Wylosowane liczby: " + strona1 + ", " + strona2 + ", " + strona3);
                if (tasks.czyProstokatnyTrojkat(strona1, strona2, strona3) == true) {
                    System.out.println("Można utworzyć trójkąt prostokątny.");
                } else {
                    System.out.println("Nie można utworzyć trójkąta prostokątnego.");
                }
                break;

            default: System.out.println("Nie ma takiego zadania");
        }

    }
    public static int InputInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
