import java.util.*;

public class Main {
    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        ///testowe();
    }

    public static void zadanie1() {
        Scanner scanner = new Scanner(System.in);
        List<String> imiona = new ArrayList<>();
        while (true) {
            String imie = scanner.nextLine();
            if (imie.equals("-")) {
                break;
            }
            imiona.add(imie);
        }

        for (String imie : imiona) {
            System.out.println(imie);
        }
    }

    public static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        List<String> imionaPar1 = new ArrayList<>();
        List<String> imionaPar2 = new ArrayList<>();
        while (true) {
            System.out.println("Podaj imie kobiety: ");
            String imie1 = scanner.nextLine();
            if (imie1.equals("-")) {
                break;
            }
            System.out.println("Podaj imie mężczyzny: ");
            String imie2 = scanner.nextLine();
            imionaPar1.add(imie1);
            imionaPar2.add(imie2);
        }
        System.out.println("Podaj interesujące cie żeńskie imię");
        String podaneimie = scanner.nextLine();
        for (String imie : imionaPar1) {
            if (imie.equals(podaneimie)) {
                ///System.out.println(imie.indexOf(podaneimie));
                String partner = imionaPar2.get(imie.indexOf(podaneimie));
                System.out.println("Partnerka " + podaneimie + " ma partnera " + partner);

            }
        }
    }

    public static void zadanie3() {
        List<Uczestnicy> listaUczestnikow = new ArrayList<>();
        ///ArrayList<Uczestnicy> listaUczestnikow = new ArrayList<>();
        listaUczestnikow.add(0, new Uczestnicy(1, "Dina", 20));
        listaUczestnikow.add(1, new Uczestnicy(2, "Ala", 24));
        listaUczestnikow.add(2, new Uczestnicy(3, "Kuba", 18));
        listaUczestnikow.add(2, new Uczestnicy(4, "Jan", 16));
        listaUczestnikow.add(1, new Uczestnicy(1, "Dina", 20));
        listaUczestnikow.add(3, new Uczestnicy(1, "Dina", 20));

        System.out.println("Lista wszystkich uczestników:");
        System.out.println(listaUczestnikow);
        System.out.println("Lista unikalnych uczestników:");
        System.out.println(czyUnikalnyUczestnik(listaUczestnikow));

        List<Uczestnicy> uczestnicyLinkedList = new LinkedList<>(listaUczestnikow);
        uczestnicyLinkedList.add(4, new Uczestnicy(5, "Lina", 12));

        System.out.println("Lista wszystkich uczestników + 1 (LinkedList):");
        System.out.println(uczestnicyLinkedList);
        List<Uczestnicy> listaPelnoletnich = filtrNiePelnoletnich(listaUczestnikow);
        System.out.println("Lista pełnołetnich uczestników:");
        System.out.println(listaPelnoletnich);
    }
    public static List<Uczestnicy> filtrNiePelnoletnich(List<Uczestnicy> listaUczestnikow) {
        Iterator<Uczestnicy> iterator = listaUczestnikow.iterator();
        while (iterator.hasNext()) {
            Uczestnicy uczestnik = iterator.next();
            if (uczestnik.getWiek() < 18) {
                iterator.remove();
            }
        }
        return listaUczestnikow;
    }
    public static List<Uczestnicy> czyUnikalnyUczestnik(List<Uczestnicy> lista) {
        List<Uczestnicy> bezPowtozen = new ArrayList<>();
        for (Uczestnicy uczestnik : lista) {
            if (!bezPowtozen.contains(uczestnik)) {
                bezPowtozen.add(uczestnik);
            }
        }
        return bezPowtozen;
    }
    public static void zadanie4(){
        List<Sprzet> sprzetList = new ArrayList<>();
        sprzetList.add(0,new Sprzet(11,"221LP","Rower"));
        sprzetList.add(1,new Sprzet(12,"N34F","Rower"));
        sprzetList.add(2,new Sprzet(13,"A4","Samochód"));
        sprzetList.add(3,new Sprzet(14,"M5","Samochód"));
        System.out.println(sprzetList);
        List<Sprzet> czescListy = sprzetList.subList(1,3);
        czescListy.clear();
        System.out.println(czescListy);
        System.out.println(sprzetList);


    }
    public static void zadanie5(){
        List<Integer> listInt1 = new ArrayList<>(List.of(1, 3, 5, 7));
        List<Integer> listInt2 = new ArrayList<>(List.of(2, 4, 6, 8));
        ListIterator<Integer> itI1 = listInt1.listIterator();
        ListIterator<Integer> itI2 = listInt2.listIterator();

        while(itI1.hasNext()) {
            itI2.add(itI1.next());
            itI2.next();
        }
        System.out.println("Lista listInt2 po dodaniu elementów:");
        for (Integer liczba : listInt2) {
            System.out.println(liczba);
        }

    }
    public static void testowe(){
        List<String> imiona = new ArrayList<>(List.of("Anna", "Ola", "Kuba", "Jan", "Ola"));
        ListIterator<String> it = imiona.listIterator();
        while (it.hasNext()){
            String current = it.next();
            if (current.equals("Ola")){
                it.set("Olga");
            }
            if (current.equals("Jan")){
                it.add("Janek");
            }
            if (current.equals("Kuba")){
                it.remove();
            }
        }
        for (String imie : imiona) {
            System.out.println(imie);
        }

    }
}