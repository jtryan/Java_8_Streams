package basics.comparator;

import basics.function.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Min {

    public static void main(String[] args) {
        Optional<User> min = Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream().min(Comparator.comparing(User::getAge));

        min.ifPresent(minAge -> System.out.println(minAge.getFirstname()));

    }
}
