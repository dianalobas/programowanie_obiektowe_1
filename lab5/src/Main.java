import ForTasks.InfGet;
import ForTasks.Runner;
import Task1.*;


public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        InfGet infGet = new InfGet();
        System.out.println("Tasks:");
        System.out.println("1. Figure");
        System.out.println("2. Build");
        System.out.println("3. Species");
        System.out.println("Choose task:");
        int choice = infGet.LiczbyInt();
        switch (choice) {
            case 1:
                runner.RunTask1();
                break;
            case 2:
                runner.RunTask2();
                break;
            case 3:
                runner.RunTask3();
                break;
        }
    }
}