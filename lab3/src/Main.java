import Zadania.*;

public class Main {
    public static void main(String[] args) {
        InfGet infGet = new InfGet();
        Zad1 zad1 = new Zad1();
        Zad2 zad2 = new Zad2();
        Zad3 zad3 = new Zad3();
        Zad4 zad4 = new Zad4();
        Zad5 zad5 = new Zad5();
        System.out.println("Podaj numer zadania:");
        int numZad = infGet.LiczbyInt();
        switch (numZad){
            case 1:
                zad1.averangePoints();
                break;
            case 2:
                zad2.NumberOperations();
                break;
            case 3:
                zad3.sumPosNumbers();
                break;
            case 4:
                zad4.sumPosNumbers();
                break;
            case 5:
                zad5.isPalindrom();
                break;
        }
    }
}