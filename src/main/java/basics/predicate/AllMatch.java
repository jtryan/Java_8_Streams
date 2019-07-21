package basics.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class AllMatch {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};

    public static void main(String[] args) {

        // do *all* values match the predicate
        boolean isLengthThree = Arrays.asList(colors).stream()
                .allMatch(isLengthThreeChars);

        System.out.println(isLengthThree);

        boolean isLengthGreaterTwo = Arrays.asList(colors).stream()
                .allMatch(isLengthGreaterThanTwo);

        System.out.println(isLengthGreaterTwo);
    }

    private static Predicate<String> isLengthThreeChars = color -> color.length() == 3;
    private static Predicate<String> isLengthGreaterThanTwo = color -> color.length() > 2;
}
