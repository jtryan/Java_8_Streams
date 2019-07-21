package basics.function;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class  FlatMapDouble {

    private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};

    public static void main(String[] args) {

        OptionalDouble average = Stream.of(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        )
                .flatMapToDouble(user -> DoubleStream.of(user.getColors().stream()
                        .mapToDouble(color -> color.length()).sum()))
                .peek(val -> System.out.println("val = " + val))
                .average();

        average.ifPresent(ave -> System.out.println("Average is " + ave));

    }
}

