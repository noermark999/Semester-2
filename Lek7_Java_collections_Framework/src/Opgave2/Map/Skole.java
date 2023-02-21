package Opgave2.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Skole {
    private String navn;

    private Map<Integer, Studerende> studerende = new HashMap<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        this.studerende.put(studerende.getStudieNr(),studerende);
    }

    public void removeStuderende(Studerende studerende) {
        this.studerende.remove(studerende.getStudieNr());
    }

    public double gennemsnit() {
        double result = 0;
        double antal = 0;
        for (Map.Entry<Integer, Studerende> entry : studerende.entrySet()) {
            for (Integer i : entry.getValue().getKarakterer()) {
                result += i;
                antal++;
            }
        }
        return result / antal;
    }

    public Studerende findStudernde(int studieNr) {
        for (Map.Entry<Integer, Studerende> entry : studerende.entrySet()) {
            if (entry.getValue().getStudieNr() == studieNr) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return navn + " med " + studerende.size() + " studerende";
    }
}
