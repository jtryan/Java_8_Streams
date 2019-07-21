package basics;

import java.util.Arrays;

public class Limit {

    private static final String[] colors = {"Red", "Red", "Yellow", "Yellow", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Purple", "Cyan"};

    public static void main(String[] args) {
        long count = Arrays.asList(colors).stream()
                .limit(5)
                .count();

        System.out.println(count);
    }
}
