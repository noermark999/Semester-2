package Opgave3;

import java.util.Comparator;

public class sortName implements Comparator<Kunde> {

    public int compare(Kunde o1, Kunde o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
