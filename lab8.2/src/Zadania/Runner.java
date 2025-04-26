package Zadania;

import java.util.Scanner;

public class Runner {
    public void pierwiastek(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            if (n >= 0){
                System.out.println(Math.sqrt(n));
            } else {
                throw new IllegalArgumentException("Liczba " + n + " - nieprawidłowa");
            }
        } else if (scanner.hasNextDouble()){
            double n = scanner.nextDouble();
            if (n >= 0){
                System.out.println(Math.sqrt(n));
            } else {
                throw new IllegalArgumentException("Liczba " + n + " - nieprawidłowa");
            }
        }
        else if (scanner.hasNext()){
            String n = scanner.nextLine();
            throw new IllegalArgumentException("Łańcuch " + n + " nie jest liczbą");
        }
    }
    public int silnia(int n){
        if (n > 0){
            int silnia = 1;
            for (int i = 1; i <= n; i++){
                silnia *= i;
            }
            return silnia;
        } else if (n == 0){
            return 0;
        } else {
            throw new BlednaWartoscDlaSilniException("Liczba " + n + " jest ujemna, nie da się obliczyć silnię");
        }

    }
}
