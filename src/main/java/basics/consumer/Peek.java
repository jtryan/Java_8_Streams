package basics.consumer;

import java.util.Arrays;

public class Peek {

    private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};

    public static void main(String[] args) {
         long count = Arrays.asList(colors).stream()
                .filter(color -> color.length() > 5)
                .peek(color -> System.out.println("Filter value = " + color))
                .map(color -> color.toUpperCase())
                .peek(color -> System.out.println("Mapped value = " + color))
                .count();

        System.out.println(count);
    }
}
