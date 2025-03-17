package Zadania;

public class Zad5 {
    public void isPalindrom(){
        InfGet infGet = new InfGet();
        int i = 0;
        System.out.println("Podaj słowo: ");
        String word = infGet.StringText();
        char[] wordArray = word.toCharArray();
        int length = wordArray.length;
        while(i < (wordArray.length/2)){
            if (wordArray[i] != wordArray[length - 1 - i]){
                System.out.println("Słowo '" + word + "' nie jest palindromem");
                return;
            }
            i++;
        }
        System.out.println("Słowo '" + word + "' jest palindromem");
    }
}
