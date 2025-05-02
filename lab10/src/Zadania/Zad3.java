package Zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad3 {
    Scanner scanner = new Scanner(System.in);
    Map<String, Double> meals = new HashMap<>();

    public void addMeal(){
        System.out.println("------ Dodaj danie do rachunku ------");
        System.out.println("Podaj nazwe dania:");
        String dishName = scanner.nextLine();
        System.out.println("Podaj cene dania:");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        meals.put(dishName, price);
    }
    public void printOrder(){
        System.out.println("Wszystkie zamówione dania:");
        for (Map.Entry<String, Double> meal : meals.entrySet()){
            System.out.println(meal.getKey() + " - " + meal.getValue());
        }
    }
    public void deleteMeal(){
        System.out.println("Podaj nazwe dania, które chcesz usunąć:");
        String name = scanner.nextLine();
        if(meals.containsKey(name)){
            meals.remove(name);
            System.out.println("Danie " + name + " zostało usunięte z zamówienia");
        } else {
            System.out.println("Nie ma takiego dania w zamówieniu");
        }
    }
    public void totalPrice(){
        ///Rachunek za [Pizza Margherita, Zupa pomidorowa]: 37.00 zł
        double sum = 0;
        for (Double meal : meals.values()){
            sum += meal;
        }
        System.out.println("Rachunek za " + meals.keySet() + " : " + sum + " zł");
    }
}
