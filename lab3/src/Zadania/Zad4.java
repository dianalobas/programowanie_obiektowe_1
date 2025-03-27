package Zadania;
import java.util.Random;
public class Zad4 {
    public void sumPosNumbers(){
        InfGet infGet = new InfGet();
        Random rand = new Random();
        int  sumEvenNumb = 0;
        System.out.println("Podaj liczbę większą od 0: ");

        int arrayLength = infGet.LiczbyInt(); // liczba n

        if (arrayLength < 0){
            System.out.println("Liczba musi być wieksza od 0");
            return;
        }
        int array[] = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            array[i] = rand.nextInt(-10, 45);
            System.out.print(array[i] + ", ");
            if (array[i] % 2 == 0)   //liczba jest parzysta
                sumEvenNumb += array[i];
        }
        System.out.println();
        System.out.println("Suma parzystych liczb: " + sumEvenNumb);
    }
}
