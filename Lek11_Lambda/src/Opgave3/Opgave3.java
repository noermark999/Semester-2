package Opgave3;

import java.util.*;

public class Opgave3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(154);
        list.add(30);
        list.add(64);
        list.add(432);
        list.add(12);
        list.add(8);
        list.add(54);

        // a)
        System.out.println("Opgave a: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // b)
        System.out.println();
        System.out.println("Opgave b: ");
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2,4);
        map.put(3,9);
        map.put(4,16);
        map.put(5,25);
        map.put(6,36);

        // En måde
        System.out.println("Iterator på Integer");
        Iterator<Integer> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()) {
            int key = iterator1.next();
            int value = map.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println();

        // En anden måde
        System.out.println("Iterator på map entry");
        Iterator<Map.Entry<Integer, Integer>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
