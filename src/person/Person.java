package person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    List<Long> list = new ArrayList<>();
    private String fName;
    private String lName;
    private String email;
    private long phoneNumber;

    @Override
    public int compareTo(Person person) {
        return fName.compareTo(person.fName);
    }
}
