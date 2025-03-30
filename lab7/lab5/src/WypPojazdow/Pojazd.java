package WypPojazdow;

import java.util.List;
import java.util.Scanner;

public abstract class Pojazd {
    protected String id;
    protected String model;
    protected int godziny;
    protected boolean czyDostepny = true;
    Scanner scanner = new Scanner(System.in);
    public Pojazd(String id, String model){
        this.id = id;
        this.model = model;
    }
    public void wyporzycz(List<Pojazd> wypoPojazdy, Pojazd pojazdy){
        wypoPojazdy.add(pojazdy);
        czyDostepny = false;

    }
    public void zwroc(){
        czyDostepny = true;
    }
    public boolean isCzyDostepny(){
        return czyDostepny;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
    public void setGodziny(int godziny){
        this.godziny = godziny;
    }

    public abstract double obliczKoszt(int liczbaGodzin);
}

