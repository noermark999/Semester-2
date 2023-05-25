package Opgave1;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Bil> biler = new HashSet<>();
        biler.add(new Bil("BT 78 821", "Audi", "A3", "Sort"));
        biler.add(new Bil("AB 13 567", "Opel", "O3", "Blå"));
        biler.add(new Bil("YD 83 201", "Peugeot", "203", "Grå"));
        biler.add(new Bil("BT 78 821", "Audi", "A3", "Sort"));

        for (Bil bil : biler) {
            System.out.println(bil);
        }
        //Inden ændringer i Bil klassen var der to objekter med samme attributter i hashsetet
        //Efter at override equals og hashcode er der kun en

    }
}
