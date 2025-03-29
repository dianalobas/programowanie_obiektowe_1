package Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Klient{
    String name;
    List<Ksiazka> kupioneKsiazki = new ArrayList<>();

    public Klient(String name) {
        this.name = name;
    }
    public void ZakupKsiazki(Ksiazka k){
        kupioneKsiazki.add(k);
    }
    public void WyswietlZakupy(){
        System.out.println(name + " kupił/a takie książki: ");
        System.out.println();
        for (Ksiazka ksiazka: kupioneKsiazki){
            ksiazka.Print();
            System.out.println();
        }
    }
}
