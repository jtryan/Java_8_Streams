package basics.streamOps;

import java.util.stream.Stream;

public class Concat {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(10, 9, 8, 7, 6);

        Stream.concat(stream1, stream2)
                .peek(val -> System.out.println(val))
                .sorted()
                .forEach(System.out::println);


    }
}
