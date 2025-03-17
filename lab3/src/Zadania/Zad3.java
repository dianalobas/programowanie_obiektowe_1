package Zadania;
import java.util.Random;
public class Zad3 {
    public void sumPosNumbers(){
        InfGet infGet = new InfGet();

        int sumEvenNumb = 0;

        int array[] = {1, 5, 7, 8, 3, 4, 2};

        for (int i = 0; i < 7; i++){
            System.out.print(array[i] + ", ");
            if (array[i] % 2 == 0)   //liczba jest parzysta
                sumEvenNumb += array[i];
        }
        System.out.println();
        System.out.println("Suma parzystych liczb: " + sumEvenNumb);
    }
}
