package basics;

import java.util.Arrays;
import java.util.Optional;

public class Findany {
    private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown", "Grey"};

    public static void main(String[] args) {

        Optional<String> any = Arrays.asList(colors).stream()
                .skip(6)
                .findAny();

        if (any.isPresent()) {
            System.out.println(any.get());
        }
    }
}
