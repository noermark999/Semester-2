package Opgave5;

import java.util.HashSet;
import java.util.Set;

public interface Subject {
    Set<Observer> OBSERVERS = new HashSet<>();
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
}
