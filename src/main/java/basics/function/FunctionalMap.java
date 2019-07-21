package basics.function;

import java.util.Arrays;
import java.util.stream.Stream;

public class FunctionalMap {
    private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};

    public static void main(String[] args) {

        Stream.of(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        )
                .filter(user -> user.getAge() > 30)
                .peek(username -> System.out.println("Over 30 is " + username.getFirstname()))
                .map(user -> user.getFirstname())
                .peek(username -> System.out.println("Mapped to String " + username))
                .distinct()
                .forEach(System.out::println);

    }

}
