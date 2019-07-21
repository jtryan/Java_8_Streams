package basics.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class AnyMatch {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};

    public static void main(String[] args) {

        // do *all* values match the predicate
        boolean isLengthFive = Arrays.asList(colors).stream()
                .anyMatch(isLengthFiveChars);

        System.out.println(isLengthFive);

    }

    private static Predicate<String> isLengthFiveChars = color -> color.length() == 5;
}
