package Zadania;

import java.util.Arrays;

public class ArrayPrint {
    public void normalStrPrint(String[] array){
        for (String arr: array){
            System.out.println(arr);
        }
    }
    public void reversPrint(String[] array){

        /// zmiana kolejności liter w elemencie tablicy (odwrócenie)
        for (int i = 0; i < array.length; i++){
            array[i] = new StringBuilder(array[i]).reverse().toString();
        }
        System.out.println(String.join(", ", array));

        /// zmiana kolejności elementów tablicy (odwrócenie)
        for (int i = 0; i < array.length/2; i++) {
            String temp;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(String.join(", ", array));
    }
    public void normalIntPrint(int[] array){
        for (int arr: array){
            System.out.print(arr + ", ");
        }
    }
}
