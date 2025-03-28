package Task1;

public class Cuboid {
    public double Side1, Side2, Side3;
    public double Volume(){
        return Side1 * Side2 * Side3;
    }
    public void Print(){
        System.out.println("Cuboid:");
        System.out.println("Side 1 = " + Side1 + ", " + "Side 2 = " + Side2 + ", " + "Side 3 = " + Side3);
        System.out.println("Volume = " + Volume());
    }
}
