package basics.streamOps;

import java.util.stream.Stream;

public class Of {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,4,3,2,1).forEach(System.out::println);
        System.out.printf("%n");
        Stream.of(1,2,3,4,5,4,3,2,1).sorted().forEach(System.out::println);
    }
}
