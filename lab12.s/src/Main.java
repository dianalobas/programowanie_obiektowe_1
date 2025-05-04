import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static int aktualnyRok = LocalDate.now().getYear();
    public static void main(String[] args) throws IOException {
        /// Zmienne
        int kobiety = 0, mezczysny = 0, ilosc1 = 0, ilosc2 = 0, ilosc3 = 0, rok;
        float sredniWiek1 = 0, sredniWiek2 = 0, sredniWiek3 = 0;
        int koniecRoku, miesiac, dzien, mCzyK;

        /// Listy i Mapy
        Map<String, DataUrodzenia> dataUrodzenia = new HashMap<>();

        /// Odnalezienie ścieżki i sprawdzenia czy plik istnieje
        Path sciezka = Paths.get("pesele.txt");
        if (Files.exists(sciezka)) {
            System.out.println("Plik istnieje");
        } else {
            System.out.println("Plik NIE istnieje");
        }

        List<String> wczytPesele = Files.readAllLines(Paths.get("pesele.txt"));
        System.out.println("Wszystkie pesele z pliku:");
        for (String pesel : wczytPesele){
            System.out.println(pesel);
        }

        /// Sprawdzamy czy pesel składa się tylko z cyfr
        Iterator<String> itPesele = wczytPesele.iterator();
        while (itPesele.hasNext()) {
            String element = itPesele.next();
            if (!element.matches("\\d+")) {
                itPesele.remove();
            }
        }

        /// Sposób z odnalezieniem błędnego pesele w miejscach daty
        /// ilosc kobiet i ilosc mężczyzn oraz ilosc osob urodzonych w te lata
        /*for (String pesel: wczytPesele){
            try {
                koniecRoku = Integer.parseInt(pesel.substring(0,2)); /// 63 021532897
                miesiac = Integer.parseInt(pesel.substring(2,4)); /// 63 02 1532897
                dzien =  Integer.parseInt(pesel.substring(4,6)); /// 6302 15 32897
                mCzyK = Integer.parseInt(pesel.substring(9,10)); /// 630215328 9 7
            } catch (NumberFormatException e){
                System.out.println("Niepoprawny pesel - " + pesel + " - nie uwzględniono go w statystykach");
                continue;
            }
            if (mCzyK % 2 == 0){
                kobiety++;
            } else {
                mezczysny++;
            }
            if (miesiac <= 12){
                /// osoby urodzone 1950 – 1980
                if (koniecRoku >= 50 && koniecRoku <= 80){
                    rok = koniecRoku + 1900;
                    ///System.out.println("Rok urodzenia " + rok);
                    ilosc1++;
                    sredniWiek1 += ileLat(rok);
                    dataUrodzenia.put(pesel, new DataUrodzenia(rok, miesiac, dzien));
                }
                /// osoby urodzone 1981 – 1999
                else if (koniecRoku >= 81 && koniecRoku <= 99) {
                    rok = koniecRoku + 1900;
                    ///System.out.println("Rok urodzenia " + rok);
                    ilosc2++;
                    sredniWiek2 += ileLat(rok);
                    dataUrodzenia.put(pesel, new DataUrodzenia(rok, miesiac, dzien));
                }

            }
            /// osoby urodzone w 2000
            else if (miesiac >= 21){
                if (koniecRoku == 00){
                    rok = koniecRoku + 2000;
                    ///System.out.println("Rok urodzenia " + rok);
                    ilosc2++;
                    sredniWiek2 += ileLat(rok);
                    dataUrodzenia.put(pesel, new DataUrodzenia(rok, miesiac-20, dzien));
                }
                /// osoby urodzone 2001 – 2025
                else if (koniecRoku >= 01 && koniecRoku <= 25){
                    rok = koniecRoku + 2000;
                    ///System.out.println("Rok urodzenia " + rok);
                    ilosc3++;
                    sredniWiek3 += ileLat(rok);
                    dataUrodzenia.put(pesel, new DataUrodzenia(rok, miesiac-20, dzien));

                }
            }
        }*/

        /// ilosc kobiet i ilosc mężczyzn
        for (String pesel: wczytPesele){
            mCzyK = Integer.parseInt(pesel.substring(9,10));
            if (mCzyK % 2 == 0){
                kobiety++;
            } else {
                mezczysny++;
            }
        }
        System.out.println("Ilosc kobiet: " + kobiety);
        System.out.println("Ilosc mężczyzn: " + mezczysny);

        /// ilosc osob urodzonych w te lata
        for (String pesel: wczytPesele){
            koniecRoku = Integer.parseInt(pesel.substring(0,2)); /// 63 021532897
            miesiac = Integer.parseInt(pesel.substring(2,4)); /// 63 02 1532897
            dzien =  Integer.parseInt(pesel.substring(4,6)); /// 6302 15 32897
            ///System.out.println(pesel+ " "+koniecRoku + "  "+ miesiac + "  "+ dzien);
            if (miesiac <= 12){
                /// osoby urodzone 1950 – 1980
                if (koniecRoku >= 50 && koniecRoku <= 80){
                    rok = koniecRoku + 1900;
                    ///System.out.println("Rok urodzenia " + rok);
                    ilosc1++;
                    sredniWiek1 += ileLat(rok);
                    dataUrodzenia.put(pesel, new DataUrodzenia(rok, miesiac, dzien));
                }
                /// osoby urodzone 1981 – 1999
                else if (koniecRoku >= 81 && koniecRoku <= 99) {
                    rok = koniecRoku + 1900;
                    ///System.out.println("Rok urodzenia " + rok);
                    ilosc2++;
                    sredniWiek2 += ileLat(rok);
                    dataUrodzenia.put(pesel, new DataUrodzenia(rok, miesiac, dzien));
                }

            }
            /// osoby urodzone w 2000
            else if (miesiac >= 21){
                if (koniecRoku == 00){
                    rok = koniecRoku + 2000;
                    ///System.out.println("Rok urodzenia " + rok);
                    ilosc2++;
                    sredniWiek2 += ileLat(rok);
                    dataUrodzenia.put(pesel, new DataUrodzenia(rok, miesiac-20, dzien));
                }
                /// osoby urodzone 2001 – 2025
                else if (koniecRoku >= 01 && koniecRoku <= 25){
                    rok = koniecRoku + 2000;
                    ///System.out.println("Rok urodzenia " + rok);
                    ilosc3++;
                    sredniWiek3 += ileLat(rok);
                    dataUrodzenia.put(pesel, new DataUrodzenia(rok, miesiac-20, dzien));

                }
            }
        }

        sredniWiek1 /= ilosc1;
        sredniWiek2 /= ilosc2;
        sredniWiek3 /= ilosc3;
        System.out.println("Ilość osób urodzonych między 1950 – 1980: " + ilosc1 + " osoby, średni wiek wynosi - " + String.format("%.1f", sredniWiek1) + " lat");
        System.out.println("Ilość osób urodzonych między 1981 – 2000: " + ilosc2 + " osoby, średni wiek wynosi - " + String.format("%.1f", sredniWiek2) + " lat");
        System.out.println("Ilość osób urodzonych między 2001 – 2025: " + ilosc3 + " osoby, średni wiek wynosi - " + String.format("%.1f", sredniWiek3) + " lat");

        ///  Wpisywania dat urodzenia do pliku
        List<String> lines = new ArrayList<>();
        for (Map.Entry<String, DataUrodzenia> osoba: dataUrodzenia.entrySet()){
            String line = osoba.getKey() + " -> " +osoba.getValue();
            lines.add(line);
        }
        if (Files.exists(sciezka)) {
            System.out.println("Plik już istnieje.");
        } else {
            try {
                Files.createFile(Paths.get("wyniki.txt"));
                System.out.println("Plik został utworzony.");
            } catch (IOException e) {
                System.out.println("Błąd podczas tworzenia pliku: " + e.getMessage());
            }
        }
        Files.write(Paths.get("wyniki.txt"), lines);


    }


    public static int ileLat(int rokUrodzenia){
        return aktualnyRok-rokUrodzenia;
    }
}