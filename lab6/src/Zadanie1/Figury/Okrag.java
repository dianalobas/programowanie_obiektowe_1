package Zadanie1.Figury;

import Zadanie1.ForAllTasks.Punkt;

import static java.lang.Math.*;

public class Okrag extends Figura{
    Punkt srodek;
    double promien; ///radius

    public Okrag() {
        this.srodek = new Punkt(0,0);
        this.promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia(){
        return PI*pow(promien, 2);
    }
    public double getSrednica(){
        return promien*2;
    }
    public void setPromien(double p){
        promien = p;
    }
    public void setSrodek(Punkt punkt){
        srodek = punkt;
    }
    public double getPromien(){
        return promien;
    }
    public void wSrodku(Punkt wspolrzedne){
        double wzor = pow((wspolrzedne.x - srodek.x), 2) + pow((wspolrzedne.y - srodek.y), 2);
        if (wzor < pow(promien,2)){
            System.out.println("Punkt należy do koła");
        } else if (wzor == pow(promien,2)){
            System.out.println("Punkt leży na okręgu");
        } else {
            System.out.println("Punkt nie należy do okręgu");
        }
    }

}
