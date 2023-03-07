package Opgave3;

import java.util.Comparator;

public class sortNumber implements Comparator<Kunde> {

    @Override
    public int compare(Kunde o1, Kunde o2) {
        return o1.getNumber()- o2.getNumber();
    }
}
