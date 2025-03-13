package Zadania;

import java.util.Scanner;

public class RowKwadratowe {
    public void Obliczenia (){
        double a, b, c;
        PobieranieLiczby pobieranieLiczby = new PobieranieLiczby();
        System.out.println("Podaj liczbę a:");
        a = pobieranieLiczby.LiczbyDouble();
        System.out.println("Podaj liczbę b:");
        b = pobieranieLiczby.LiczbyDouble();
        System.out.println("Podaj liczbę c:");
        c = pobieranieLiczby.LiczbyDouble();
        double delta = Math.pow(b,2) - 4*c;
        if (delta > 0){
            System.out.println("Równanie ma dwa rozwjązania:");
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            System.out.println("Równanie ma jedno rozwjązanie:");
            double x0 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("x = " + x0);
        } else {
            System.out.println("Równanie nie ma rozwjązań:");
        }
    }
}
