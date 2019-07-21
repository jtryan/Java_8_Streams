package basics.predicate;

import java.util.Arrays;

public class Filter {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};

    public static void main(String[] args) {
        Arrays.asList(colors).stream()
                .filter(color -> color.length() < 5)
                .forEach(System.out::println);

        long count = Arrays.asList(colors).stream()
                .filter(color -> color.length() < 5)
                .count();

        System.out.println(count);
    }
}
