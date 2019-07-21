package basics.reduce;

import basics.function.User;

import java.util.Arrays;

/**
 * Create a stream from our Users.
 *
 * Filter to keep only those under the age of 40.
 * Get a total length of all of the String color values for each user - we'll need flatMapToInt for this.
 * Return a sum of the total for all of these values across all users - we'll need reduce for this.
 *
 * Output should be:
 * 57
 */

public class Demo {

    public static void main(String[] args) {
        int reduce = Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream()
                .filter(user -> user.getAge() < 40)
                .flatMapToInt(user -> user.getColors().stream()
                        .mapToInt(color -> color.length()))
                .reduce(0, (subTotal, element) -> subTotal + element);

        System.out.println(reduce);
    }
}
