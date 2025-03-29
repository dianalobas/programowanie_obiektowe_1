package Zadanie1.Figury;

public class Prostokat extends Figura{
	double wys=0, szer=0;

	public Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;

	}
	public Prostokat(double wys,double szer, String kolor){
		super(kolor);
		this.wys = wys;
		this.szer = szer;

	}
    public double getPowierzchnia() {
        return (szer * wys);
    }

	@Override
	public void opis() {
		super.opis();
		System.out.println("Prostokąt o szerokości: " + szer + ", wysokości: " + wys);
		System.out.println();
	}
}

////14 punkt