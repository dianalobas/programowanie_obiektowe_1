package Zadania;

public class Task4 {
    InfGet infGet = new InfGet();
    ArrayPrint arrayPrint = new ArrayPrint();
    public void wordsChange(){
        String[] words = new String[5];
        System.out.println("Podaj 5 słów:");
        for (int i = 0; i < words.length; i++){
            System.out.println("Podaj słowo " + (i+1));
            words[i] = infGet.StringText();
        }
        arrayPrint.normalStrPrint(words);
        arrayPrint.reversPrint(words);
    }

}

/*
    Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy.
    Następnie, program powinien wypisać wszystkie słowa, od ostatniego do pierwszego,
    z literami zapisanymi od końca do początku. Dla przykładu, dla podanych słów
    "Ala", "ma", "kota", "i", "psa" program powinien wypisać: "asp", "i", "atok", "am", "alA".
 */
