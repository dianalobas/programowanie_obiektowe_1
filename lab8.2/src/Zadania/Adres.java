package Zadania;

public class Adres {
    String miasto;
    String ulica;
    String kodPocztowy;
    int numerDomu;

    public Adres(String miasto, String ulica, String kodPocztowy, int numerDomu) {
        if (miasto == null || miasto.isEmpty()){
            throw new NieprawidlowyAdresException("Miasto nie może być nullem/pustym");
        }
        if (ulica == null || ulica.isEmpty()){
            throw new NieprawidlowyAdresException("Ulica nie może być nullem/pustym");
        }
        if (kodPocztowy == null){
            throw new NieprawidlowyAdresException("Kod pocztowy nie może być nullem/pustym");
        }
        if (numerDomu <= 0){
            throw new NieprawidlowyAdresException("Numer nie może być ujemnym");
        }
        this.miasto = miasto;
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.numerDomu = numerDomu;
    }
}

