package basics.function;

import java.util.List;

public class User {

    private String firstname;
    private int age;
    private List<String> colors;

    User(final String firstname, final int age, final List<String> colors) {
        this.age = age;
        this.colors = colors;
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public List<String> getColors() {
        return colors;
    }

}
