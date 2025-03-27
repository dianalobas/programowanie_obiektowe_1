package Zadania;

public class Task5 {
    InfGet infGet = new InfGet();
    ArrayPrint arrayPrint = new ArrayPrint();
    public void NumbSort(){
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++){
            System.out.println("Podaj liczbę " + (i+1));
            array[i] = infGet.LiczbyInt();
        }
        /// Sortowanie Bombęlkowe
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++) {
                int temp;
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        arrayPrint.normalIntPrint(array);

    /// Sortowanie przez wstawianie
    /*
        public static void sort(int[] arr) {
            int length = arr.length;
            for (int i = 1; i < length; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
        arrayPrint.normalIntPrint(array);
    */
    }
}
/*
    Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy,
    a następnie posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran.
    Dla przykładu, dla liczb 10, -2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100.
    Zastanów się, jak można posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie.
    Przetestuj je na różnych zestawach danych. Możesz też skorzystać z jednego z popularnych algorytmów
    sortowania, np. sortowania przez wstawianie. Działanie algorytmu omówiono szczegółowo na zajęciach
    algorytmy i struktury danych.
 */