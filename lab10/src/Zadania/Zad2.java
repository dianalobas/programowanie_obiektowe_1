package Zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad2 {
    Scanner scanner = new Scanner(System.in);
    Map<String,String> users = new HashMap<>();
    public void addUser(){
        System.out.println("------ Załóż konto ------");
        System.out.println("Podaj login:");
        String login = scanner.nextLine();
        System.out.println("Podaj hasło:");
        String password = scanner.nextLine();
        users.put(login, password);
    }
    public void loginTo(){ /// Map<String,String> users /// String login, String password
        System.out.println("------ Zalogój się do konta ------");
        System.out.println("Podaj login:");
        String login = scanner.nextLine();
        System.out.println("Podaj hasło:");
        String password = scanner.nextLine();
        for (Map.Entry<String, String> user : users.entrySet()){
            if (user.getKey().equals(login) && user.getValue().equals(password)){
                System.out.println("Twoje dane są poprawne, zapraszamy na swoje konto");
                break;
            } else {
                System.out.println("Błędny login lub hasło, spróbuj ponownie");
            }
        }



    }
    /*public void checkPassword(){

    }*/
}
