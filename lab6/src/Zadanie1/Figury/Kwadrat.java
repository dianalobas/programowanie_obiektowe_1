package Zadanie1.Figury;

public class Kwadrat extends Prostokat{
    public Kwadrat(double wys, double szer, String kolor) {
        super(wys, szer, kolor);
    }
    public void setWys(double wys_){
        wys = wys_;
    }
    public void setSzer(double szer_){
        szer = szer_;
    }
    public double getWys(){
        return wys;
    }
    public double getSzer(){
        return szer;
    }

}
