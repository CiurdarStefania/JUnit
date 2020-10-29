package ro.fasttrackit.mvnbase;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final Person person;

    public PersonService(Person person) {
        this.person = person;
    }


    public List<Person> getPersonsOlderThan(int age) {
        List<Person> result = new ArrayList<>();
        if (age > 120) {
       result.get(age);
        }
        return result;
    }


}
