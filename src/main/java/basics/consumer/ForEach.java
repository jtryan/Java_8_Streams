package basics.consumer;

import java.util.Arrays;

public class ForEach {

    private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};

    public static void main(String[] args) {
        // consumer functional interface
        Arrays.asList(colors).stream()
                .forEach(System.out::println);
    }
}
