package Opgave5;

import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        Bag bag = new ObservableBag();
        MyObserver myObserver = new MyObserver("StenSaksPapir");
        bag.registerObserver(myObserver);

        bag.addString("Sten");
        bag.addString("Papir");
        bag.addString("Saks");
        bag.addString("Sten");
        System.out.println();

        bag.removeString("Sten");
        System.out.println();
        System.out.println();

        for (String key : new ObservableBag()) {
            int value = bag.getCount(key);
            System.out.println(key + ": " + value);
        }
    }
}
