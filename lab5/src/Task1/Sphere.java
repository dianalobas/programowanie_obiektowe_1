package Task1;

import static java.lang.Math.*;

public class Sphere {
    public double Radius;
    public double Volume(){
        return (4/3)*PI*pow(Radius, 3);
    }
    public void Print(){
        System.out.println("Sphere:");
        System.out.println("Radius = " + Radius);
        System.out.println("Volume = " + Volume());
    }
}