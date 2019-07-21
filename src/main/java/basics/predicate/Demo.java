package basics.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Create a Stream from the array provided:
 *
 * private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};
 *
 * Filter the stream to remove any color less than five char in length.
 *
 * Filter the stream again to remove any colors containing the char 'a'.
 *
 * Print to console if any results available.
 */


public class Demo {

    private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};
    private static Predicate<String> isLengthOverFiveChars = color -> color.length() > 5;
    private static Predicate<String> doesStringContainCharA = color -> !color.contains("a");
    private static Predicate<String> andOperation = isLengthOverFiveChars.and(doesStringContainCharA);

    public static void main(String[] args) {
//        Arrays.asList(colors).stream()
//                .filter(isLengthOverFiveChars)
//                .filter(doesStringContainCharA)
//                .forEach(System.out::println);
//    }

        // combining Predicates
        Arrays.asList(colors).stream()
                .filter(andOperation)
                .forEach(System.out::println);
    }



}
