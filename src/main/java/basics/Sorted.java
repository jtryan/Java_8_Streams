package basics;

import java.util.Arrays;

public class Sorted {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};
    private static final Integer[] numbers = {1, 33,  2, 34, 3, 5, 7, 11, 13, 86, 23, 24 };
    public static void main(String[] args) {
//         Arrays.asList(colors).stream()
//                .sorted()
//                .forEach(System.out::println);

        Arrays.asList(numbers).stream()
                .forEach(System.out::println);

        System.out.printf("%n%n");

        Arrays.asList(numbers).stream()
                .sorted()
                .forEach(System.out::println);
    }
}
