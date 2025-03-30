package WypPojazdow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    Scanner scanner = new Scanner(System.in);
    public void RunMain(){
        List<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(new Samochod("S1", "Toyota"));
        pojazdy.add(new SamochodElektryczy("SE231", "Kia"));
        pojazdy.add(new RowerElektryczny("R002", "Kometa"));

        startMenu(pojazdy);

    }
    private void startMenu(List<Pojazd> pojazdy){
        System.out.println("\n ********** Menu **********");
        System.out.println("1. Wyświetł dostępne pojazdy");
        System.out.println("2. Wyporzyć pojazd");
        System.out.println("3. Zwróć pojazd");
        System.out.println("4. Naladuj pojazd elektryczny");
        System.out.println("5. Wyjscie");
        System.out.println("Twój wybor:");
        int wybor = scanner.nextInt();
        scanner.nextLine();

        switch (wybor){
            case 1: viewPojazdy(pojazdy); break;
            case 2: wypozyczPojazd(pojazdy); break;
            case 3: zwrocPojazd(pojazdy); break;
            case 4: naladujPojazd(pojazdy); break;
            case 5: close(); break;
            default:
                System.out.println("błąd");
        }
    }
    double odOplacenia = 0;
    List<Pojazd> wypoPojazdy = new ArrayList<>();
    private  void wypozyczPojazd(List<Pojazd> pojazdy){

        System.out.println("Podaj id pojazdu do wypozyczenia: ");
        String idWyp = scanner.nextLine();
        for (Pojazd p: pojazdy){
            if (p.getId().equals(idWyp) && p.isCzyDostepny()){
                System.out.println("Na ile godzin chcesz wypozyczyc pojazd: ");
                ///godziny = scanner.nextInt();
                p.setGodziny(scanner.nextInt());
                scanner.nextLine(); //// wyczyszczamy bufor  nextLine()
                p.wyporzycz(wypoPojazdy, p);
                odOplacenia += p.obliczKoszt(p.godziny);
                System.out.println("Koszt za pojazd " + p.obliczKoszt(p.godziny) + "zl");
            } else if (p.getId().equals(idWyp)){
                System.out.println("Aktualnie nie jest dostępny do wynajęcia");
            }
        }
        System.out.println("Czy chcesz wyporzyczic jeszcze jeden pojazd?");
        String odp = scanner.nextLine();
        if (odp.equalsIgnoreCase("tak")){
            wypozyczPojazd(pojazdy);
        } else {
            System.out.println("Wyporzyczone pojazdy:");
            for (Pojazd wp: wypoPojazdy){
                System.out.print(wp.getId() + " " + wp.getModel() + " na " + wp.godziny + " godzin ");
                if (wp instanceof Elektryczny){
                    System.out.print("poziom baterii: " + ((Elektryczny) wp).poziomNaladowania() + "% ");
                }
                System.out.print("- " + wp.obliczKoszt(wp.godziny) + "zł");
                System.out.println();
            }
            System.out.println("Do opłacenia " + odOplacenia + "zł");
            close();
        }
    }

    private void viewPojazdy(List<Pojazd> pojazdy) {
        for (Pojazd p: pojazdy){
            System.out.println(p.getId() + " " + p.getModel() + " - " + (p.isCzyDostepny() ? "dostępny" : "zajęty") + (p instanceof Elektryczny ? " - " + ((Elektryczny)p).poziomNaladowania() + "% " : ""));
        }
    }
    private void zwrocPojazd(List<Pojazd> pojazdy){
        System.out.println("Podaj id pojazdu do zwrotu: ");
        String idZw = scanner.nextLine();
        for (Pojazd p: pojazdy){
            if (p.getId().equals(idZw)){
                p.zwroc();
                System.out.println("Pojazd " + p.getId() + " " + p.getModel() + " został zwrócony");
            }
        }
    }
    private  void naladujPojazd(List<Pojazd> pojazdy){
        System.out.println("Podaj id pojazdu do ładowania: ");
        String idLad = scanner.nextLine();

        for (Pojazd p: pojazdy){
            if (p.getId().equals(idLad) && p instanceof Elektryczny){
                if (((Elektryczny)p).poziomNaladowania() == 100){
                    System.out.println("Pojazd " + p.getId() + " " + p.getModel() + " już ma pełną bateriję");
                } else {
                    System.out.println("Pojazd " + p.getId() + " " + p.getModel() + " ma " + ((Elektryczny) p).poziomNaladowania() + "% baterii");
                    ((Elektryczny) p).naladuj();
                    System.out.println("Pojazd " + p.getId() + " " + p.getModel() + " został naładowany do 100%");
                }
            } else if (p.getId().equals(idLad)){
                System.out.println("Pojazd " + p.getId() + " " + p.getModel() + " nie jest elektryczny" );
            }
        }
    }
    private void close(){
        if (!wypoPojazdy.isEmpty()){
            System.out.println("Dziekujemy, za korzystanie z naszej wyporzyczalni");
        }
        System.out.println("Do zobaczenia");
    }

}
