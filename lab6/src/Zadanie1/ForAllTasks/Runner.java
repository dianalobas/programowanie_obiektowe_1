package Zadanie1.ForAllTasks;

import Zadanie1.Figury.*;
import Zadanie2.Samochod;
import Zadanie2.SamochodOsobowy;
import Zadanie3.Klient;
import Zadanie3.Ksiazka;
import Zadanie3.Podrecznik;
import Zadanie3.Powiesc;


public class Runner {
    public void runPunkt(){
        Punkt punkt1 = new Punkt();
        punkt1.opis();
        punkt1.przesun(3,4);
        punkt1.opis();

        Punkt punkt2 = new Punkt(2, 9);
        punkt2.opis();
        punkt2.setX(8);
        punkt2.setY(3);
        punkt2.opis();
        System.out.println("Punkty: x = " + punkt2.getX() + ", y = " + punkt2.getY());

        Punkt punkt3 = new Punkt(-3, 12);
        punkt3.opis();
        punkt3.zeruj();
        punkt3.opis();
    }

    public void runFigury(){
        /*Figura figura1 = new Figura("black");
        Figura figura2 = new Figura();
        Figura figura3 = new Figura();
        figura2.opis();
        System.out.println(figura1.getKolor());
        figura1.opis();
        figura3.opis();
        ///////////////
        Prostokat prostokat1 = new Prostokat(12.5, 6);
        System.out.println("Powieszchnia prostokąta równa się: " + prostokat1.getPowierzchnia());
        //////////////
        Trojkat trojkat1 = new Trojkat(20,4.5);
        /////////////
        Prostokat prostokat2 = new Prostokat(2,4);
        prostokat1.setKolor("Rozowy"); ///dzidziczy z figury
        System.out.println(prostokat1.getKolor());
        Prostokat prostokat3 = new Prostokat(2,4,"zielony");
        prostokat3.opis();
        /////////////////
        Trojkat trojkat2 = new Trojkat(20,4.5);
        trojkat2.setKolor("Blue");
        trojkat2.opis();
        ///////
        prostokat3.setPunkt(4,6);
        prostokat3.opis();
        prostokat3.przesun(3,8);
        prostokat3.opis();*/
        Prostokat prostokat1 = new Prostokat(2,4,"zielony");
        prostokat1.setPunkt(4,6);
        prostokat1.opis();
        prostokat1.przesun(3,5);
        prostokat1.opis();

        Kwadrat kwadrat = new Kwadrat(4,3,"fioletowy");
        kwadrat.opis();
        Figura figura1 = new Figura();
        figura1.setPunkt(1,9);
        figura1.setKolor("niebieski");
        figura1.opis();
        Prostokat prostokat2 = new Prostokat(3,6);
        prostokat2.setPunkt(2,8);
        prostokat2.przesun(5,6);
        System.out.println(prostokat2.getPowierzchnia());
        prostokat2.opis();
        Okrag okrag = new Okrag(new Punkt(3,6), 6);
        okrag.opis();
        Trojkat trojkat1 = new Trojkat(4,6);
        trojkat1.setPunkt(3,6);
        trojkat1.opis();
        Kwadrat kwadrat1 = new Kwadrat(4,8,"różowy");
        System.out.println(kwadrat1.getSzer());
        kwadrat1.opis();



    }

    public void runOkrag(){
        Okrag okrag = new Okrag();
        System.out.println("Powieszchnia: " + okrag.getPowierzchnia());
        System.out.println("Promień " + okrag.getPromien());
        System.out.println("\n");
        okrag.setPromien(4);
        System.out.println("Promień " + okrag.getPromien());
        System.out.println("Powieszchnia: " + okrag.getPowierzchnia());
        System.out.println("Srednica: " + okrag.getSrednica());
        okrag.setSrodek(new Punkt(3,6));
        System.out.println("\n");
        okrag.wSrodku(new Punkt(-3,9));
        okrag.wSrodku(new Punkt(3,2));
        okrag.wSrodku(new Punkt(4, 6));

        Okrag okrag1 = new Okrag(new Punkt(3,5),3);
        Punkt wspolrzedne = new Punkt(4, 5);
        okrag1.wSrodku(wspolrzedne);
    }

    public void runSamochod(){
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod("Volkswagen", "polo", "biały", 2022, 2000);
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy("Audi", "A5","czarny", 4,2019, 10000, 3, 1.5);
        samochod1.Print();
        System.out.println();
        samochod2.Print();
        System.out.println();
        samochodOsobowy.Print();
    }

    public void runKsiegarnia(){
        Ksiazka ksiazka = new Ksiazka("Od a do z", "Anna Nowak", "Najlepsza książka", 2020,250,59);
        Ksiazka powiesc = new Powiesc("Wesele", "Biblijne", "Stanisław Wyspiański", 1905,450,39, "Prosta książka");
        Ksiazka podrecznik = new Podrecznik("Matematyka na Ty", "Justyna", "Wstęm do Trygonometrji", 2010,340,39,2, "Matematyka");
        System.out.println();
        podrecznik.Print();
        Klient klient1 = new Klient("Ola");
        klient1.ZakupKsiazki(podrecznik);
        System.out.println();
        klient1.ZakupKsiazki(powiesc);
        klient1.WyswietlZakupy();
    }
}
