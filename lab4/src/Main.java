import Zadania.*;

public class Main {
    public static void main(String[] args) {
        InfGet infGet = new InfGet();
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        System.out.println("Podaj numer zadania:");
        int numZad = infGet.LiczbyInt();
        switch (numZad){
            case 1:
                task1.ArrayOperations();
                break;
            case 2:
                task2.PrintEverySecondElem();
                break;
            case 3:
                task3.TextChenge();
                break;
            case 4:
                task4.wordsChange();
                break;
            case 5:
                task5.NumbSort();
                break;
            case 6:
                task6.silnia();
                break;
            default:
                System.out.println("spróbój ponownie");
        }
    }
}