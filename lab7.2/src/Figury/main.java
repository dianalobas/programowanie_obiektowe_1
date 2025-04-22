package Figury;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] arg) {
        Figura[] tablicaFigur = new Figura[5];

        Prostokat prostokat = new Prostokat(3, 6, new Punkt(2,5), "czerwony");
        Trojkat trojkat = new Trojkat(7, 4, new Punkt(2,5), "biały");
        Kwadrat kwadrat = new Kwadrat(3, new Punkt(5,4), "zielony");
        Okrag okrag = new Okrag(new Punkt(3,6),"pink",4);
        List<IFigury> figury = new ArrayList<>();
        ///prostokat.zwieksz(3,4);
        /*System.out.println("Color prostokata: " + prostokat.getKolor());
        System.out.println("Color trójkąta: " + trojkat.getKolor());
        System.out.println("Color kwadrata: " + kwadrat.getKolor());

        System.out.println();
        System.out.println(prostokat.opis());
        System.out.println();
        System.out.println(kwadrat.opis());
        System.out.println();*/

        tablicaFigur[0] = prostokat;
        tablicaFigur[1] = trojkat;
        tablicaFigur[2] = kwadrat;
        tablicaFigur[3] = new Prostokat(6, 3, new Punkt(0, 0), "szary");
        tablicaFigur[4] = new Kwadrat(6,  new Punkt(2, 3), "żółty");

        /*for (int i = 0; i< tablicaFigur.length; i++){
            System.out.println(tablicaFigur[i].opis());
            System.out.println();
        }*/
        System.out.println(prostokat.opis());
        prostokat.skaluj(3);
        System.out.println(prostokat.opis());

        //////////////////


        figury.add(new Prostokat(4, 5, new Punkt(2, 4), "szary"));
        figury.add(new Kwadrat(3, new Punkt(5, 2), "biały"));
        figury.add(new Trojkat(6, 4, new Punkt(4,3),"niebieski"));
        for (IFigury figura: figury){
            System.out.println(figura.wPolu(new Punkt(6, 4)));
        }

        System.out.println(okrag.opis());
        okrag.przesun(5,-3);
        System.out.println(okrag.opis());

    }
}