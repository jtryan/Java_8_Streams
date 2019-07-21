package basics;

import java.util.Arrays;

public class Ex2 {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};

    public static void main(String[] args) {
        Arrays.asList(colors).stream()
                .distinct()
                .skip(5)
                .limit(2)
                .forEach(System.out::println);
    }

}