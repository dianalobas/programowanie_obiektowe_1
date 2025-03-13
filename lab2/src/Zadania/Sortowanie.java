package Zadania;

public class Sortowanie {
    public void Sort(){
        PobieranieLiczby pobieranieLiczby = new PobieranieLiczby();
        System.out.println("Podaj pierwszą liczbę: ");
        double x = pobieranieLiczby.LiczbyDouble();
        System.out.println("Podaj drugą liczbę: ");
        double y = pobieranieLiczby.LiczbyDouble();
        System.out.println("Podaj trzecią liczbę: ");
        double z = pobieranieLiczby.LiczbyDouble();
        /*if (x > y && x > z){
            if (y > z){
                System.out.println("Posortowane liczby: x, y, z");
            } else if (z > y){
                System.out.println("Posortowane liczby: x, z, y");
            }
        } else if (y > x && y > z){
            if (x > z){
                System.out.println("Posortowane liczby: y, x, z");
            } else if (z > x){
                System.out.println("Posortowane liczby: y, z, x");
            }
        } else if (z > x && z > y) {
            if (y > z){
                System.out.println("Posortowane liczby: z, y, x");
            } else if (x > z){
                System.out.println("Posortowane liczby: z, x, y");
            }
        }*/

            if (x <= y && x <= z) {
                if (y <= z) {
                    System.out.println(x + ", " + y + ", " + z);
                } else {
                    System.out.println(x + ", " + z + ", " + y);
                }
            } else if (y <= x && y <= z) {
                if (x <= z) {
                    System.out.println(y + ", " + x + ", " + z);
                } else {
                    System.out.println(y + ", " + z + ", " + x);
                }
            } else {
                if (x <= y) {
                    System.out.println(z + ", " + x + ", " + y);
                } else {
                    System.out.println(z + ", " + y + ", " + x);
                }
            }
    }
}

