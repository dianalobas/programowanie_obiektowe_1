package Zadanie1.Figury;

import Zadanie1.ForAllTasks.Punkt;

import java.awt.*;

public class Figura {

	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	
	
	public Figura(){
		punkt = new Punkt(0,0);
	}
	public void setPunkt(int x, int y){
		punkt.x = x;
		punkt.y = y;
	}
	public Figura(String kolor){
		this.kolor=kolor;
		punkt = new Punkt(0,0);
	}

	public void setKolor(String kolor){
		this.kolor = kolor;
	}
	public String getKolor(){
		return kolor;
	}
	public Punkt getPunkt() {
		return punkt;
	}
	public void przesun(int dx, int dy) {
		punkt.x += dx;
		punkt.y += dy;
	}
	public void opis() {
		System.out.println("Klasa Figura. Kolor obiektu: " + kolor);
		System.out.println("Położenie: (" + punkt.x + ", " + punkt.y + ")");
	}

			
	
}
