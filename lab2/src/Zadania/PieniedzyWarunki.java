package Zadania;

public class PieniedzyWarunki {
    public void Samochod(){
        PobieranieLiczby pobieranieLiczby = new PobieranieLiczby();
        System.out.println("Czy jest zniszka na samochód? (tak / nie)");
        ///String deszcz = pobieranieLiczby.StringText();
        String zniszka = pobieranieLiczby.StringText().trim().toLowerCase();  //trim() уберает пробелы в начале и конце
        System.out.println("Czy otrzymałeś premię? (tak / nie)");
        String premia = pobieranieLiczby.StringText().trim().toLowerCase();
        //String autobus = pobieranieLiczby.StringText();


        if (!zniszka.equals("tak") || premia.equals("tak")){
            System.out.println("Możesz kupić samochód");
            System.out.println("Zniszki na samochod nie ma");
        } else if (!zniszka.equals("tak") || !premia.equals("tak")) {
            System.out.println("Zakup samochodu trzeba odłożyć");
            System.out.println("Zniszki na samochod nie ma");
        } else if (zniszka.equals("tak") || premia.equals("tak")) {
            System.out.println("Możesz kupić samochód");
            System.out.println("Jest zniżka na samochod");
        }
    }
}
