package basics.comparator;

import basics.function.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/**
 * Create a stream from our User list.
 *
 * Return the min number of chars in the firstname field across all users.
 * Expected:
 * 3
 *
 * Return the max number of chars in the firstname field across all users.
 * Expected:
 * 6
 *
 * Sort the Users in to age order.  Print out their names.
 * Expected:
 * Ben
 * Mark
 * Jane
 * Claire
 * Tony
 * Sarah
 */

public class Demo {

    public static void main(String[] args) {
        Optional<Integer> min  = Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream()
                .map(user -> user.getFirstname().length())
                .min(Comparator.naturalOrder());

        min.ifPresent(minVal -> System.out.println(minVal));

        System.out.printf("%n");

        Optional<Integer> max  = Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream()
                .map(user -> user.getFirstname().length())
                .max(Comparator.naturalOrder());

        max.ifPresent(maxVal -> System.out.println(maxVal));
        System.out.printf("%n");

        Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream()
                .sorted(Comparator.comparing(User::getAge))
                .forEach(user -> System.out.println(user.getFirstname()));
    }
}
