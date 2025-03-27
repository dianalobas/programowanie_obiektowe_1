package Zadania;

import java.util.Arrays;

public class Task6 {
    InfGet infGet = new InfGet();
    ArrayPrint arrayPrint = new ArrayPrint();
    public void silnia(){
        int[] numbArray = new int[5];
        int[] numbSilniaArray = new int[5];
        Arrays.fill(numbSilniaArray, 1);
        System.out.println("Podaj 5 liczb: ");
        for (int i = 0; i < numbArray.length; i++){
            System.out.println("Podaj liczbę " + (i+1));
            numbArray[i] = infGet.LiczbyInt();
        }
        arrayPrint.normalIntPrint(numbArray);

        for (int i = 0; i < numbArray.length; i++) {
            for (int j = 1; j <= numbArray[i]; j++) {
                numbSilniaArray[i] *= j;
            }
        }
        System.out.println("\n");
        arrayPrint.normalIntPrint(numbSilniaArray);
    }
}

/*
    Napisz program, który pobierze od użytkownika pięć liczb, zapisze je w tablicy,
    a następnie policzy i wypisze silnię każdej z pobranych liczb.
 */