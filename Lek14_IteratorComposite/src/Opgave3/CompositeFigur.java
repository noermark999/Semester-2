package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class CompositeFigur extends Figur {
    List<Figur> figurs = new ArrayList<Figur>();

    public CompositeFigur() {
    }

    @Override
    public double getAreal() {
        double result = 0;
        for (Figur figur : figurs) {
            result += figur.getAreal();
        }
        return result;
    }

    @Override
    public void tegn() {
        for (Figur figur : figurs) {
            figur.tegn();
        }
    }
    @Override
    public void add(Figur figur) {
        figurs.add(figur);
    }
    @Override
    public void remove(Figur figur) {
        figurs.remove(figur);
    }
    @Override
    public Figur getChild(int i) {
        return figurs.get(i);
    }
}
