package Zadania;

import java.util.Random;

public class Task1 {
    public void ArrayOperations(){

        //double array[] = {1,4,3,10};
        double array[] = new double[5];
        for (int i = 0; i < 5; i++){
            array[i] = NumbRand(5,45);
            System.out.printf("%.2f", array[i]);
            System.out.print("   ");
        }
        double averange, suma = 0;

        /// for
        for (int i = 0; i < 5; i++){
            suma += array[i];
        }
        averange = suma/5;
        //System.out.println();
        System.out.println("\nSuma: " + suma);
        System.out.println("Averange: " + averange);

        /// for each
        suma = 0;
        averange = 0;
        for (double numb: array){
            suma += numb;
        }
        averange = suma/5;
        System.out.println("Suma: " + suma);
        System.out.println("Averange: " + averange);
    }
    public double NumbRand(int a, int b){
        Random rand = new Random();
        return rand.nextDouble(a,b);
    }
}
/*
     Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for oraz for each.
     Elementy do tablicy mają zostać wylosowane z dowolnego przedziały. Należy zaproponować
     oddzielną metodę do losowania liczb
*/