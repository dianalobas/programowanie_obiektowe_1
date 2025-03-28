package Task1;

import static java.lang.Math.*;

public class Cube {
    public double Side;
    public double Volume(){
        return pow(Side, 3);
    }
    public void Print(){
        System.out.println("Cube:");
        System.out.println("Side = " + Side);
        System.out.println("Volume = " + Volume());
    }
}
