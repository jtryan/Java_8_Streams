package basics.collectors;

import basics.function.User;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {


    public static void main(String[] args) {

        Map<String, Integer> usersUnder30 = Arrays.asList(
                new User("Tony", 45, Arrays.asList("Red", "Green")),
                new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
                new User("Ben", 19, Arrays.asList("Green", "Violet", "Purple", "Grey")),
                new User("Claire", 37, Arrays.asList("White", "Black")),
                new User("Sarah", 49, Arrays.asList("Red", "Green", "Blue")),
                new User("Jane", 21, Arrays.asList("Red", "Green", "Blue"))
        ).stream()
                .filter(user -> user.getAge() < 46)
                .collect(Collectors.toMap(User::getFirstname, User::getAge));

        System.out.println(usersUnder30);
    }

}
