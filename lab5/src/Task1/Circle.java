package Task1;

import static java.lang.Math.*;

public class Circle {
    public double Radius;
    public double Area(){
        return PI*pow(Radius, 2);
    }
    public double Perimeter(){
        return 2*Radius*PI;
    }
    public void Print(){
        System.out.println("Circle:");
        System.out.println("Radius = " + Radius);
        System.out.println("Area = " + Area());
        System.out.println("Perimeter = " + Perimeter());
    }
}
