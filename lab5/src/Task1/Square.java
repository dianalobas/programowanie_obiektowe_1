package Task1;
public class Square {
    public double Side;
    public double Area(){
        return Side*Side;
    }
    public double Perimeter(){
        return Side*4;
    }
    public void Print(){
        System.out.println("Square:");
        System.out.println("Side = " + Side);
        System.out.println("Area = " + Area());
        System.out.println("Perimeter = " + Perimeter());
    }
}
