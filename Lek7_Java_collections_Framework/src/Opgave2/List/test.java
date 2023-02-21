package Opgave2.List;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Skole skole = new Skole("Harboøre Skole");

        Studerende studerende = new Studerende(2,"Rasmus");
        studerende.addKarakter(7);
        studerende.addKarakter(10);
        studerende.addKarakter(12);
        studerende.addKarakter(7);

        Studerende studerende1 = new Studerende(1,"Jakob");
        studerende1.addKarakter(2);
        studerende1.addKarakter(4);
        studerende1.addKarakter(7);
        studerende1.addKarakter(0);

        List<Integer> karakterer2 = new ArrayList<>();
        Studerende studerende2 = new Studerende(3,"Line");
        studerende2.addKarakter(4);
        studerende2.addKarakter(7);
        studerende2.addKarakter(10);
        studerende2.addKarakter(7);

        skole.addStuderende(studerende);
        skole.addStuderende(studerende1);
        skole.addStuderende(studerende2);

        System.out.println(skole);
        System.out.println(skole.gennemsnit());

        TreeSet<Studerende> studenter = new TreeSet<>(new StuderendeComparator());
        studenter.add(studerende);
        studenter.add(studerende1);
        studenter.add(studerende2);
        System.out.println(studenter);

        TreeSet<Studerende> studenter1 = new TreeSet<>();
        studenter1.add(studerende);
        studenter1.add(studerende1);
        studenter1.add(studerende2);
        System.out.println(studenter1);
    }
}
