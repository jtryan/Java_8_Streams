package basics.comparator;

import basics.function.User;

import java.util.Arrays;
import java.util.Optional;

public class Max {

    public static void main(String[] args) {
//        OptionalInt max = Arrays.asList(13, 24, 1, 4, 8, 45, 7, 11).stream()
//                .mapToInt(value -> value)
//                .max();
//        OptionalInt max = IntStream.of(13, 24, 1, 4, 8, 45, 7, 11).max();
//        max.ifPresent(maxval -> System.out.println(maxval));

//        Optional<User> max = Arrays.asList(
//                new User("Tony", 45, Arrays.asList("Red", "Green")),
//                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
//                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
//                new User("Claire", 37, Arrays.asList("White", "Black")),
//                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
//                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
//        ).stream().max(Comparator.comparing(User::getAge));
//
//        max.ifPresent(maxAge -> System.out.println(maxAge.getFirstname()));

        Optional<User> max = Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream().max((value1, value2) -> value1.getColors().size() < value2.getColors().size() ? -1 :
                value1.getColors().size() > value2.getColors().size() ? 1 : 0);

        max.ifPresent(value -> System.out.println(value.getFirstname()));


    }
}
