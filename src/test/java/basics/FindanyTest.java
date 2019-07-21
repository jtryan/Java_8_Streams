package basics;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindanyTest {

    @Test
    public void terminal_operation_count() {

        long count = Stream.of("one").count();

        assertEquals(1, count);
    }

}