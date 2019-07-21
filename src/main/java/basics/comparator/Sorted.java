package basics.comparator;

import basics.function.User;

import java.util.Arrays;
import java.util.Comparator;

public class Sorted {

    public static void main(String[] args) {
        Arrays.asList(13, 24, 1, 4, 8, 45, 7, 11).stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.printf("%n%n");

        Arrays.asList(13, 24, 1, 4, 8, 45, 7, 11).stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.printf("%n%n");

        Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream()
                .sorted(Comparator.comparing(User::getFirstname))
                .forEach(user -> System.out.println(user.getFirstname()));
//


    }
}
