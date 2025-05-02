package Zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Wszystkie {
    Scanner scanner = new Scanner(System.in);
    public void zad1(){
        System.out.println("Podaj tekst: ");
        String text = scanner.nextLine();
        text = text.toLowerCase().replaceAll("[.,!;:]", "");
        String[] words = text.split("\\s++");
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word: words){
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        System.out.println("\nLiczba wystąpień słów:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
    public void zad2(){
        Zad2 zad2 = new Zad2();
        zad2.addUser();
        zad2.addUser();
        zad2.loginTo();
    }
    public void zad3(){
        Zad3 zad3 = new Zad3();
        zad3.addMeal();
        zad3.addMeal();
        zad3.printOrder();
        zad3.deleteMeal();
        zad3.addMeal();
        zad3.printOrder();
        zad3.totalPrice();

    }
}
