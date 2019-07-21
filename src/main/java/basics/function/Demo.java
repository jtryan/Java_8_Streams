package basics.function;

import java.util.Arrays;

/**
 * Filter our users to keep only those between the ages of 20 and 40.
 * Map the users to ages, and print out a list of those ages.
 *
 * Using the same list lets filter our users again to keep only those aged over 35.
 * Now print out a list of all of the colors for those users but each users colors should be in alphabetical order and limited to no more than two colors each user.
 */

public class Demo {

    private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};

    public static void main(String[] args) {

        Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream()
//                .filter(user -> user.getAge() > 20 && user.getAge() < 40)
//                .mapToInt(user -> user.getAge())
//                .distinct()
//                .forEach(System.out::println);
                .filter(user -> user.getAge() > 35)
                .flatMap(user -> user.getColors().stream().sorted().limit(2))
                .forEach(System.out::println);
    }
}

