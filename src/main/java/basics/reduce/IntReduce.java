package basics.reduce;

import java.util.Arrays;

public class IntReduce {

    public static void main(String[] args) {
        Integer reduce = Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter(number -> number > 2)
                .reduce(0, (subTotal, element) -> subTotal + element);

        System.out.println(reduce);
    }


}
