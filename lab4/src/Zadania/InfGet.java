package Zadania;

import java.util.Scanner;

public class InfGet {
    private final Scanner scanner = new Scanner(System.in);
    public double LiczbyDouble(){
        return scanner.nextDouble();
    }
    public int LiczbyInt(){
        return scanner.nextInt();
    }
    public char ZnakChar(){
        return scanner.next().charAt(0);
    }
    public String StringText(){
        return scanner.nextLine();
    }
    public void closeScanner() {
        scanner.close();
    }

}
