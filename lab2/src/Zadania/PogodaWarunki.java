package Zadania;

public class PogodaWarunki {
    public void Deszcz(){
        PobieranieLiczby pobieranieLiczby = new PobieranieLiczby();
        System.out.println("Czy pada deszcz? (tak / nie)");
        ///String deszcz = pobieranieLiczby.StringText();
        String deszcz = pobieranieLiczby.StringText().trim().toLowerCase();  //trim() уберает пробелы в начале и конце
        System.out.println("Czy jest autobus na przystanku? (tak / nie)");
        String autobus = pobieranieLiczby.StringText().trim().toLowerCase();
        //String autobus = pobieranieLiczby.StringText();


        if (deszcz.equals("tak") && autobus.equals("tak")){
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        } else if (deszcz.equals("tak") && !autobus.equals("tak")) {
            System.out.println("Nie dostaniesz się na uczelnie");
        } else if (!deszcz.equals("tak") && autobus.equals("tak")) {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Milego dnia i pięknej pogody!");
        }
    }
}
