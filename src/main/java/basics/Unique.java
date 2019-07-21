package basics;

import java.util.Arrays;

public class Unique {

    private static final String[] colors = {"Red", "Red", "Yellow", "Yellow", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Purple", "Cyan"};

    public static void main(String[] args) {

        long count = Arrays.asList(colors).stream()
                .count();

        System.out.printf("Count is %s.%n", Long.toString(count));

        long count1 = Arrays.asList(colors).stream()
                .distinct()
                .count();

        System.out.printf("Unique count is %s.%n", Long.toString(count1));

        // print distinct values
        Arrays.asList(colors).stream()
                .distinct()
                .forEach(System.out::println);

    }

}
