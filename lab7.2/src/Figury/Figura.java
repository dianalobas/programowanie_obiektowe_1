//deklaracja klasy abstrakcyjnej
package Figury;

public abstract class Figura{
	
	//pola metody i kontruktory
	protected Punkt punkt;
	protected String kolor = "bialy";


	Figura(){
		punkt = new Punkt(0,0);
	}
	Figura(String kolor){
		this.kolor=kolor;
	}
	Figura(Punkt punkt){
		this.punkt=punkt;
	}
	String getKolor(){
		return kolor;
	}
	//metody abstrakcyjne
	String opis(){
		return "Color: " + getKolor() + ", " + "Punkt: x=" + punkt.x + ", y=" + punkt.y + "\n";
	}
	public void skaluj(float skala){}; /// równomiernia zmiana figury nie tracąć zależności stron
}
