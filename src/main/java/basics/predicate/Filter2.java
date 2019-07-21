package basics.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class Filter2 {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};

    public static void main(String[] args) {
        long count = Arrays.asList(colors).stream()
                .filter(isLengthThreeChars)
                .count();

        System.out.println(count);

    }

    private static Predicate<String> isLengthThreeChars = color -> color.length() == 3;
}
