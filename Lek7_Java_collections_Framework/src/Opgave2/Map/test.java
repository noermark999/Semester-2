package Opgave2.Map;

import Opgave2.List.StuderendeComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Skole skole = new Skole("Harboøre Skole");

        List<Integer> karakterer = new ArrayList<>();
        karakterer.add(7);
        karakterer.add(10);
        karakterer.add(0);
        karakterer.add(10);
        Studerende studerende = new Studerende(1,"Jakob", karakterer);

        List<Integer> karakterer1 = new ArrayList<>();
        karakterer.add(4);
        karakterer.add(12);
        karakterer.add(0);
        karakterer.add(4);
        Studerende studerende1 = new Studerende(2,"Line", karakterer1);

        List<Integer> karakterer2 = new ArrayList<>();
        karakterer.add(2);
        karakterer.add(4);
        karakterer.add(0);
        karakterer.add(7);
        Studerende studerende2 = new Studerende(3,"Rasmus", karakterer2);

        skole.addStuderende(studerende);
        skole.addStuderende(studerende1);
        skole.addStuderende(studerende2);

        System.out.println(skole);
        System.out.println(skole.gennemsnit());

    }
}
