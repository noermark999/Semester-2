package Opgave4;

import java.util.HashSet;
import java.util.Set;

public class BogTitel implements Subject {
    private String titel;
    private int antal;
    private Set<Observer> observers;

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        observers = new HashSet<>();
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    @Override
    public void addObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    public void indkoebTilLager(int antal) {
        // TODO: 07/03/2023
    }

    public void etKoeb(Kunde k) {
        // TODO: 07/03/2023
    }

    private void notifyObservers() {
        // TODO: 07/03/2023
    }

}
