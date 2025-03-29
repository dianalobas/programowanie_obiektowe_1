package Zadanie1.ForAllTasks;

public class Punkt {
    public int x, y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    void zeruj(){
        x = 0;
        y = 0;
    }
    void opis(){
        System.out.println("ForAllTasks.Punkt ma współrzędne: (" + x + ", " + y + ")");
    }
    void przesun(int cx, int cy){
        x += cx;
        y += cy;
    }
}
