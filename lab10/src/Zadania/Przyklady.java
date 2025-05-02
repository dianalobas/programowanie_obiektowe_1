package Zadania;

import java.util.*;

public class Przyklady {
    public void pierwszy(){
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Anna", 25);
        ageMap.put("Bartek", 30);
        ageMap.put("Celina", 28);
        System.out.println("Wiek Anny: " + ageMap.get("Anna"));
        System.out.println(ageMap.values());
        for (String key : ageMap.keySet()) {
            System.out.println(key + " -> " + ageMap.get(key));
        }
    }
    public void drugi(){
        TreeMap<String, Double> saldo = new TreeMap<>();
        saldo.put("Zofia", 1000.0);
        saldo.put("Andrzej", 2500.0);
        saldo.put("Beata", 1500.0);
        // Klucze będą posortowane alfabetycznie
        for (String name : saldo.keySet()) {
            System.out.println(name + " ma saldo: " + saldo.get(name));
        }
    }
    public void trzeci(){
        LinkedHashMap<Integer, String> kolejka = new LinkedHashMap<>();
        kolejka.put(1, "Piotr");
        kolejka.put(2, "Maria");
        kolejka.put(3, "Kuba");
        for (Integer nr : kolejka.keySet()) {
            System.out.println("Numer " + nr + ": " + kolejka.get(nr));
        }
    }
    public void testowe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = scanner.nextLine();
        text = text.toLowerCase().replaceAll("[.,!;:]", "");
        char[] litery = text.toCharArray();
        ///String[] litery = text.split("");
        HashMap<Character, Integer> literaMap = new HashMap<>();
        for (Character l: litery){
            literaMap.put(l, literaMap.getOrDefault(l, 0)+1);
        }
        System.out.println("odp: ");
        for (Map.Entry<Character, Integer> l : literaMap.entrySet()){
            System.out.println(l.getKey() + " -> " + l.getValue());
        }
    }

}
