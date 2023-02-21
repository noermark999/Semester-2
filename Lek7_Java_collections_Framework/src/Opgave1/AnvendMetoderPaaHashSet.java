package Opgave1;

import java.util.HashSet;
import java.util.Set;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        HashSet<Integer> heltal = new HashSet<>();
        heltal.add(34);
        heltal.add(12);
        heltal.add(23);
        heltal.add(45);
        heltal.add(67);
        heltal.add(34);
        heltal.add(98);
        System.out.println(heltal);

        heltal.add(23);
        System.out.println(heltal);
        heltal.remove(67);
        System.out.println(heltal);
        System.out.println(heltal.size());
    }
}
