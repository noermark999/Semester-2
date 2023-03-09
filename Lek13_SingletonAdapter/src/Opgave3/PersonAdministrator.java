package Opgave3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {
    private static PersonAdministrator instance;
    private Set<Person> personSet;

    private PersonAdministrator() {
        personSet = new HashSet<>();
    }

    public static PersonAdministrator getInstance() {
        if (instance == null) {
            instance = new PersonAdministrator();
        }
        return instance;
    }

    public void addPerson(Person person) {
        personSet.add(person);
    }

    public Set<Person> getPersoner() {
        return personSet;
    }

    public void removePerson(Person person) {
        personSet.remove(person);
    }

}
