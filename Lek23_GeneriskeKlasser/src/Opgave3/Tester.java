package Opgave3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        Person<Navn> person1 = new Person<>(new Navn("Lars", "Jespersen"));
        System.out.println(person1.getNavn().getFornavn() + " " + person1.getNavn().getEfternavn());

        Person<String> person2 = new Person<>("Ole Gunnersgård");
        System.out.println(person2.getNavn());

        ArrayList<Person<Navn>> personer = new ArrayList<>();
        personer.add(person1);

        Person<Navn> person3 = new Person<>(new Navn("Anker", "Larsen"));
        Person<Navn> person4 = new Person<>(new Navn("Gertrud", "Jensen"));
        Person<Navn> person5 = new Person<>(new Navn("Sigurd", "Gotfridson"));
        personer.add(person3);
        personer.add(person4);
        personer.add(person5);
        System.out.println();
        System.out.println("Før sortering");
        for (Person<Navn> p : personer) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Efter sortering:");
        Collections.sort(personer);
        for (Person<Navn> p : personer) {
            System.out.println(p);
        }
    }
}
