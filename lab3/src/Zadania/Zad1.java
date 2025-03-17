package Zadania;

public class Zad1 {
    public void averangePoints(){
        InfGet infGet = new InfGet();
        double points = 0, averange;
        int i = 1;
        System.out.println("Podaj ilość studentów: ");
        int n = infGet.LiczbyInt();

        while (n >= i){
            System.out.println("Wpisz ocene dla studenta " + i + ": ");
            points += infGet.LiczbyDouble();
            i++;
        }
        averange = points/n;
        System.out.println("Średnia punktów w grupie studentskiej: " + averange);
    }
}
