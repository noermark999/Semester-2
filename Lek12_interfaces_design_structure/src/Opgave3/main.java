package Opgave3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Comparator<Kunde> nameComp = new sortName();
        Comparator<Kunde> numberComp = new sortNumber();

        List<Kunde> list = new ArrayList<>(List.of(new Kunde("Peter", 3), new Kunde("Lars", 2),
                new Kunde("Laura", 1), new Kunde("Bo", 5), new Kunde("Hanne", 4)));

        System.out.println(list);
        System.out.println();

        for (Kunde k : list) {
            k.setKundeComparator(nameComp);
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        for (Kunde k : list) {
            k.setKundeComparator(numberComp);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
