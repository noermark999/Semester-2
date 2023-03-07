package Opgave4;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private ArrayList<BogTitel> bogTitels = new ArrayList<>();

    public Kunde(String navn) {
        this.navn = navn;
    }

    public void addBogTitel(BogTitel bogTitel) {
        if (!bogTitels.contains(bogTitel)) {
            bogTitels.add(bogTitel);
        }
    }

    public ArrayList<BogTitel> getBogTitels() {
        return bogTitels;
    }
}
