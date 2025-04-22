package Figury;

public class Okrag extends Figura implements RuchFigury{
    int radius;

    public Okrag(int radius) {
        this.radius = radius;
    }

    public Okrag(Punkt punkt, String kolor, int radius) {
        super.punkt = punkt;
        super.kolor = kolor;
        this.radius = radius;

    }

    @Override
    public void przesun(int x, int y) {
        this.punkt.x = punkt.x+x;
        this.punkt.y = punkt.y+y;
    }
}
