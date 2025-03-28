package Task1;

import static java.lang.Math.*;

public class Cone {
    public double Radius, Hight;
    public double Volume(){
        return (PI*pow(Radius, 2)*Hight)/3;
    }
    public void Print(){
        System.out.println("Cube:");
        System.out.println("Radius = " + Radius + ", " + "Hight = " + Hight);
        System.out.println("Volume = " + Volume());
    }
}
