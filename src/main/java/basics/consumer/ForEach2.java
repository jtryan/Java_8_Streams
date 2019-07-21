package basics.consumer;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ForEach2 {

    private static final String[] colors = {"Red", "Red", "Orange" ,"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Brown" ,"Grey"};

    public static void main(String[] args) {
        // consumer functional interface
        AtomicInteger count = new AtomicInteger();

        Arrays.asList(colors).stream()
                .forEach(color -> count.addAndGet(color.length()));

        System.out.println(count.get());
    }
}
