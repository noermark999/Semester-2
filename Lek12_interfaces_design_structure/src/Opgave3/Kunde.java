package Opgave3;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {
    private String name;
    private int number;
    private Comparator<Kunde> kundeComparator;


    public Kunde(String name, int number) {
        this.name = name;
        this.number = number;
        kundeComparator = new sortName();
    }

    public void setKundeComparator(Comparator<Kunde> kundeComparator) {
        this.kundeComparator = kundeComparator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + ": " + name;
    }

    @Override
    public int compareTo(Kunde o) {
        return kundeComparator.compare(this,o);
    }
}
