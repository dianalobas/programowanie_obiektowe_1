import Zadanie1.ForAllTasks.InfGet;
import Zadanie1.ForAllTasks.Runner;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        InfGet infGet = new InfGet();
        System.out.println("Zadanie:");
        System.out.println("1. Pierwsze Punkt");
        System.out.println("2. Pierwsze Figury");
        System.out.println("3. Pierwsze Okrąg");
        System.out.println("4. Drugie Samochody");
        System.out.println("5. Trzecie Księgarnia");
        System.out.println("Choose task:");
        int choice = infGet.LiczbyInt();
        System.out.println();
        switch (choice) {
            case 1:
                runner.runPunkt();
                break;
            case 2:
                runner.runFigury();
                break;
            case 3:
                runner.runOkrag();
                break;
            case 4:
                runner.runSamochod();
                break;
            case 5:
                runner.runKsiegarnia();
                break;
            default:
                System.out.println("Nie ma takiego numerka");
                break;
        }
    }
}