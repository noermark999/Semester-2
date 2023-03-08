package Opgave4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BogTitel implements Subject {
    private String titel;
    private int antal;
    private Set<Observer> observers;
    private ArrayList<Kunde> kunder;

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        observers = new HashSet<>();
        kunder = new ArrayList<>();
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    public void etKoeb(Kunde k) {
        k.addBogTitel(this);
        kunder.add(k);
        antal--;
        notifyObservers();
    }

    private void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer o = iterator.next();
            o.update(this);
        }
    }

    @Override
    public String toString() {
        return titel;
    }
}
