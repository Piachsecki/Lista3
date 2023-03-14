package zad3_1;

import java.util.*;

public class Tour {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, String> countriesAndCapitols = new HashMap<>();
        countriesAndCapitols.put("Poland", "Warsaw");
        countriesAndCapitols.put("Germany", "Berlin");
        countriesAndCapitols.put("Hungary", "Budapest");
        countriesAndCapitols.put("UK", "London");
        countriesAndCapitols.put("Russia", "Moscow");
        countriesAndCapitols.put("Austria", "Vienna");
        countriesAndCapitols.put("Sweden", "Stockholm");


        // the cities can be duplicated - ArrayList
        List<String> citiesVisited = new ArrayList<>();
        citiesVisited.add("Zurich");
        citiesVisited.add("Warsaw");
        citiesVisited.add("Warsaw");
        citiesVisited.add("Warsaw");
        citiesVisited.add("Cracow");
        citiesVisited.add("Berlin");
        citiesVisited.add("Budapest");
        citiesVisited.add("Budapest");
        citiesVisited.add("Moscow");
        citiesVisited.add("London");
        citiesVisited.add("London");
        citiesVisited.add("Mielno");
//        citiesVisited.add("Paris");

        // cities cannot be duplicated - Set- filters duplicated data
        Set<String> collectionC = new HashSet<>();

        collectionC.add("Zurich");
        collectionC.add("Zurich");
        collectionC.add("Warsaw");
        collectionC.add("Cracow");
        collectionC.add("Berlin");
        collectionC.add("Berlin");
        collectionC.add("Budapest");
        collectionC.add("Rome");
        collectionC.add("Moscow");
        collectionC.add("London");
        collectionC.add("London");
        collectionC.add("Mielno");


        printMap(countriesAndCapitols);
        System.out.println();
        printList(citiesVisited);
        System.out.println();
        printList(collectionC);

        System.out.println();
        int size1 = printSizeOfMap(countriesAndCapitols);
        int size2 = printSizeOfTheCollection(citiesVisited);
        int size3 = printSizeOfTheCollection(collectionC);
        System.out.println("Map size: " + size1);
        System.out.println("List size: " + size2);
        System.out.println("Set size: " + size3);

        System.out.println();

        System.out.println("Collection A has 'Sweden': " + countriesAndCapitols.containsKey("Sweden"));
        System.out.println("Collection B has 'Paris': " + citiesVisited.contains("Paris"));
        System.out.println("Collection B has 'Rome': " + collectionC.contains("Rome"));
    }

    private static int printSizeOfTheCollection(Collection<String> collection) {
        return collection.size();
    }

    private static int printSizeOfMap(Map<String, String> countriesAndCapitols) {
        return countriesAndCapitols.size();
    }

    private static void printList(Collection<String> collection) {
        System.out.println("Collection: " + collection);
    }

    private static void printMap(Map<String, String> countriesAndCapitols) {
//        for (Map.Entry<String, String> result : countriesAndCapitols.entrySet()) {
//            System.out.println(result);
//        }

        System.out.println("Map :" +countriesAndCapitols);
    }
}