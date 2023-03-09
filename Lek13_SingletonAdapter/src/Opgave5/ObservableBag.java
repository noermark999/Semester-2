package Opgave5;

import java.util.*;

public class ObservableBag implements Bag, Iterable<String>{
    private Map<String, Integer> map;
    private Set<Observer> observers;


    public ObservableBag() {
        map = new HashMap<>();
        observers = new HashSet<>();
    }

    @Override
    public void addString(String s) {
        if (map.containsKey(s)) {
            map.put(s,getCount(s) + 1);
        } else {
            map.put(s, 1);
        }
        notifyObservers(s,getCount(s));
    }

    @Override
    public void removeString(String s) {
        if (getCount(s) > 1) {
            map.put(s,getCount(s)-1);
        } else {
            map.remove(s);
        }
        notifyObservers(s,getCount(s));
    }

    @Override
    public int getCount(String s) {
        return map.get(s);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    private void notifyObservers(String s, int antal) {
        for (Observer o : observers) {
            o.update(s, antal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }
}
