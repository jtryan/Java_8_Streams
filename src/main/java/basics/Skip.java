package basics;

import java.util.Arrays;

public class Skip {

    private static final String[] colors = {"Red", "Red", "Yellow", "Yellow", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Purple", "Cyan"};

    public static void main(String[] args) {
        Arrays.asList(colors).stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
