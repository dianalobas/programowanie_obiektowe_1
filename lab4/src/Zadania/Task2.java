package Zadania;

public class Task2 {
    public void PrintEverySecondElem(){
        int arrayEven[] = {1, 2, 3, 4, 5, 6};
        int arrayNotEven[] = {11, 22, 33, 44, 55, 66, 77};
        for (int i = 0; i < arrayEven.length; i+=2){
            System.out.println(arrayEven[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayNotEven.length; i+=2){
            System.out.println(arrayNotEven[i]);
        }
    }
}

/*
    Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic
    Pierwsza tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.
*/