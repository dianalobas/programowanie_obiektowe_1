package Task1;

public class Rectangle {
    public double Side1, Side2;
    public double Area(){
        return Side1*Side2;
    }
    public double Perimeter(){
        return (Side1+Side2)*2;
    }
    public void Print(){
        System.out.println("Square:");
        System.out.println("Side 1 = " + Side1 + ", " + "Side 2 = " + Side2);
        System.out.println("Area = " + Area());
        System.out.println("Perimeter = " + Perimeter());
    }
}
