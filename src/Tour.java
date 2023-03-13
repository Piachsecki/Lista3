import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, String> countriesAndCapitols = new HashMap<>();
        countriesAndCapitols.put("Poland", "Warsaw");
        countriesAndCapitols.put("Germany", "Berlin");
        countriesAndCapitols.put("Hungary", "Budapest");
        countriesAndCapitols.put("UK", "London");
        countriesAndCapitols.put("Russia", "Moscow");
        countriesAndCapitols.put("Austria", "Vienna");

//        List


        printMap(countriesAndCapitols);
    }

    private static void printMap(Map<String, String> countriesAndCapitols) {
        for (Map.Entry<String, String> result : countriesAndCapitols.entrySet()) {
            System.out.println(result);
        }

        System.out.println(countriesAndCapitols);
    }
}