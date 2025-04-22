package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Inicjalizacja obiektów: biblioteki, BookInput
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        ConsoleBookInput consoleBookInput = new ConsoleBookInput();
        consoleBookInput.readBook();
        // Pętla główna z menu
        // Obsługa opcji (dodawanie, usuwanie, edycja itd.)
        // Obsługa wyjątków (try-catch)

        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "J. K. Rowling", "1234567890123"));
        books.add(new Book("The Hobbit", "J. R. R. Tolkien", "9780261103344"));
        books.add(new Book("1984", "George Orwell", "9780451524935"));

        private void startMenu(List<Book> books){
            System.out.println("\n ********** Menu **********");
            System.out.println("1. Wyświetł dostępne лыш");
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

    }
}
