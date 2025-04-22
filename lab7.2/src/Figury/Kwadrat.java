package Figury;

class Kwadrat extends Prostokat implements IFigury{
	int bok;
	Kwadrat(int bok, Punkt punkt, String kolor){
		super(bok, bok, punkt, kolor);
	}

	@Override
	public void skaluj(float skala) {
		super.skaluj(skala);
		this.bok *= (int) skala;
	}
	@Override
	public float getPowierzchnia() {
		return (float) bok * bok;
	}
	@Override
	public boolean wPolu(Punkt p) {
		if ((p.x >= punkt.x && p.x <= (punkt.x+bok) && (p.y >= punkt.y && p.y <= punkt.y + bok))){
			return true;
		} else {
			return false;
		}
	}

}