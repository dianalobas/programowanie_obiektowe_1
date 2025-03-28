package Task1;

public class Triangle {
    public double Hight, Side1, Side2, Side3;
    public double Area(){
        return 0.5 * Hight * Side1;
    }
    public double Perimeter(){
        return Side1 + Side2 + Side3;
    }
    public void Print(){
        System.out.println("Circle:");
        System.out.println("Hight = " + Hight + ", " + "Side 1 = " + Side1 + ", " +"Side 2 = " + Side2 + ", " + "Side 3 = " + Side3);
        System.out.println("Area = " + Area());
        System.out.println("Perimeter = " + Perimeter());
    }
}
