package basics.consumer;

import java.util.Arrays;

/**
 * Create a stream from the colors below:
 *
 * private static final String[] colors = {"Red", "Red", "Orange", "Orange" , "Yellow", "Green", "Blue", "Indigo", "Violet"};
 *
 * Filter colors to only keep those with a length greater than four.
 *
 * Use peek to output to the console values which have been filtered.
 *
 * Map each remaining color to lowerCase.
 *
 * Peek to output the values to the console.
 *
 * Print all of the colors out to the console.
 */

public class Demo {

    private static final String[] colors = {"Red", "Red", "Orange", "Orange" , "Yellow", "Green", "Blue", "Indigo", "Violet"};

    public static void main(String[] args) {
        Arrays.asList(colors).stream()
                .filter(color -> color.length() > 4)
                .peek(color -> System.out.println("Filter color = " + color))
                .map(color -> color.toLowerCase())
                .peek(color -> System.out.println("Lowercase = " + color))
                .forEach(System.out::println);

    }
}
