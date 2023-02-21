package Opgave4;

import Opgave2.Map.Studerende;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class filmKarakter {
    public static void main(String[] args) {
        udskrivGennemsnit("filmtest");
    }

    public static void udskrivGennemsnit(String filnavn) {
        File file = new File("Lek7_Java_collections_Framework/res/" + filnavn);
        try (Scanner scanner = new Scanner(file)) {
            HashMap<String, Double> film = new HashMap<>();
            HashMap<String, Double> filmAntalKarakter = new HashMap<>();
            // Lav et map mere med samme key men istedet for karakter som value så antal af karakterer som value
            double antalKarakterer = Double.parseDouble(scanner.nextLine());
            for (int i = 0; i < antalKarakterer; i++) {
                String filmNavn = scanner.nextLine();
                double karakter = Double.parseDouble(scanner.nextLine());
                double antalKarakter = 1;
                if (film.containsKey(filmNavn)) {
                    karakter += film.get(filmNavn);
                }
                if (filmAntalKarakter.containsKey(filmNavn)) {
                    antalKarakter += filmAntalKarakter.get(filmNavn);
                }
                film.put(filmNavn, karakter);
                filmAntalKarakter.put(filmNavn,antalKarakter);
            }
            //System.out.println(film);
            //System.out.println(filmAntalKarakter);
            for (Map.Entry<String, Double > entry : film.entrySet()) {
                System.out.println(entry.getKey() + ": " + filmAntalKarakter.get(entry.getKey()) + " karakterer" +
                        " gennemsnit: " + entry.getValue()/filmAntalKarakter.get(entry.getKey()));
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
