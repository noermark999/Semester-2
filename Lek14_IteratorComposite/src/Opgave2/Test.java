package Opgave2;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Lars");
        Person person2 = new Person("Søren");
        Person person3 = new Person("Line");
        Person person4 = new Person("Pernille");
        PersonCollection personCollection = new PersonCollection();
        personCollection.add(person1);
        personCollection.add(person2);
        personCollection.add(person3);
        personCollection.add(person4);

        System.out.println(personCollection);

        for (Person person : personCollection) {
            System.out.println(person);
        }
    }
}
