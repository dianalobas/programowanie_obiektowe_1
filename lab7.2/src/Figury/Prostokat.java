package Figury;

class Prostokat extends Figura implements IFigury{
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer, Punkt punkt, String kolor){
		this.wys = wys;
		this.szer = szer;
		super.punkt = punkt;
		super.kolor = kolor;
	}
	public double Area(){
		return wys * szer;
	}
	public String opis(){
		return super.opis() + "Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	public void skaluj(float skala) {
		super.skaluj(skala);
		this.wys *= (int) skala;
		this.szer *= (int) skala;
	}

	@Override
	public float getPowierzchnia() {
		return (float) szer * wys;
	}

	@Override
	public boolean wPolu(Punkt p) {
		if ((p.x >= punkt.x && p.x <= (punkt.x+szer) && (p.y >= punkt.y && p.y <= punkt.y + wys))){
			return true;
		} else {
			return false;
		}
	}
}