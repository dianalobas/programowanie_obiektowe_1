package Zadania;

public class Zad2 {
    public void NumberOperations(){
        InfGet infGet = new InfGet();
        double temp, sumPosLiczba = 0, prodPosLiczba = 1,
                sumNegLiczba = 0, prodNegLiczba = 1;
        System.out.println("Liczba 0 nie jest dodatniej i ujemnej, program nie bierzy go pod uwagę");
        System.out.println("Podaj 10 liczb: ");
        for (int i = 0; i < 10; i++){
            temp = infGet.LiczbyDouble();
            if (temp > 0){
                sumPosLiczba += temp;
                prodPosLiczba *= temp;
            } else if (temp < 0) {
                sumNegLiczba += temp;
                prodNegLiczba *= temp;
            }
        }
        System.out.println("Liczby dodatnie, suma: " + sumPosLiczba + ", iloczyn: " + prodPosLiczba);
        System.out.println("Liczby ujemne, suma: " + sumNegLiczba + ", iloczyn: " + prodNegLiczba);
    }
}
