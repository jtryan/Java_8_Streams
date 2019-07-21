package basics.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class NaneMatch {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};

    public static void main(String[] args) {

        // do *all* values match the predicate
        boolean isLengthTwo = Arrays.asList(colors).stream()
                .noneMatch(isLengthTwoChars);

        System.out.println(isLengthTwo);

    }

    private static Predicate<String> isLengthTwoChars = color -> color.length() == 2;
}


