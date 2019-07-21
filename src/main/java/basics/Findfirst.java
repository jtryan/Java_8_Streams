package basics;

import java.util.Arrays;
import java.util.Optional;

public class Findfirst {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};

    public static void main(String[] args) {

        Optional<String> first = Arrays.asList(colors).stream()
                .distinct()
                .skip(6)
                .findFirst();

        if(first.isPresent()) {
            System.out.println(first);
        } else {
            System.out.println("Not present.");
        }

    }
}
