package basics;

import java.util.stream.Stream;


public class Colors {

    private static final String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

    public static void main(String[] args) {
        long count = Stream.of(colors).count();
        System.out.println(count);

        Stream<String> newColors = Stream.of(colors);
        Stream<String> colors1 = Stream.concat(newColors, Stream.of("Cyan", "Purple"));

//        long count1 = colors1.count();
//        System.out.println(count1);

        colors1.forEach((s -> System.out.println(s)));

        // Same thing just different approach
        // long count = Arrays.asList(colors).stream().count();

//        Long count = Stream.of(colors).count();


    }
}
