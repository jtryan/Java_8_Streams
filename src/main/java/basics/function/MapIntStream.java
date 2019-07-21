package basics.function;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapIntStream {
    private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};

    public static void main(String[] args) {

        IntStream intStream = Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream()
                .mapToInt(user -> user.getAge());

        System.out.println(intStream.summaryStatistics());
    }
}
