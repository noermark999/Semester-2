package Opgave2.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Skole {
    private String navn;

    private Set<Studerende> studerende = new HashSet<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        this.studerende.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
        this.studerende.remove(studerende);
    }

    public double gennemsnit() {
        double result = 0;
        double antal = 0;
        for (Studerende s : studerende) {
            for (Integer i : s.getKarakterer()) {
                result += i;
                antal++;
            }
        }
        return result / antal;
    }

    public Studerende findStudernde(int studieNr) {
        for (Studerende s : studerende) {
            if (s.getStudieNr() == studieNr) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return navn + " med " + studerende.size() + " studerende";
    }
}
