package Zadania;

import java.util.Scanner;

public class WarFunkcji {
    PobieranieLiczby pobieranieLiczby = new PobieranieLiczby();
    public void Funkcja1(){
        double y;
        System.out.println("Podaj x:");
        double x = pobieranieLiczby.LiczbyDouble();
        if (x > 0){
            y = 2*x;
            System.out.println("y = " + y);
        } else if (x == 0) {
            y = 0;
            System.out.println("y = " + y);
        } else if (x < 0){
            y = -3*x;
            System.out.println("y = " + y);
        }
    }

    public void Funkcja2(){
        double y;
        System.out.println("Podaj x:");
        double x = pobieranieLiczby.LiczbyDouble();
        if (x >= 1){
            y = Math.pow(x, 2);
            System.out.println("y = " + y);
        } else if (x < 1) {
            y = x;
            System.out.println("y = " + y);
        }
    }

    public void Funkcja3(){
        double y;
        System.out.println("Podaj x:");
        double x = pobieranieLiczby.LiczbyDouble();
        if (x > 2){
            y = 2+x;
            System.out.println("y = " + y);
        } else if (x == 2) {
            y = 8;
            System.out.println("y = " + y);
        } else if (x < 2) {
            y = x-4;
            System.out.println("y = " + y);
        }
    }
}
