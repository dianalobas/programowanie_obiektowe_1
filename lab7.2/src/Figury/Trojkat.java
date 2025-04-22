
package Figury;

class Trojkat extends Figura implements IFigury{
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst, Punkt punkt, String kolor){
		this.wys = wys;
		this.podst = podst;
		super.punkt = punkt;
		super.kolor = kolor;
	}
	public String opis(){
		return super.opis() + "Trojkat o wymairach: "+wys+"  "+podst;
	}

	@Override
	public void skaluj(float skala) {
		super.skaluj(skala);
		this.wys *= (int) skala;
		this.podst *= (int) skala;
	}

	@Override
	public float getPowierzchnia() {
		return (float) 0.5 * wys * podst;
	}

	@Override
	public boolean wPolu(Punkt p) {
		if ((p.x >= punkt.x && p.x <= (punkt.x+podst)) && (p.y >= punkt.y && p.y <= (punkt.y + wys))
				&& (p.y <=( (((punkt.y + wys)-punkt.y)/(punkt.x-(punkt.x+podst)) * (p.x - (punkt.x)+podst)) + punkt.y))){
			return true;
		} else {
			return false;
		}
	}
}