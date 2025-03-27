package Zadania;

/*сделать потом*/

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public void TextChenge(){
        List<String> names = Arrays.asList("ola", "natalia", "justyna", "laura");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("\n");
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
    }


}
/*
    Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją przykładowymi wartościami.
    Skorzystaj z pętli for-each, aby wypisać wszystkie wartości tablicy ze wszystkimi literami zamienionymi na wielkie.
    Skorzystaj z funkcjonalności toUpperCase wartości typu String..
*/