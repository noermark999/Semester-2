package Opgave5;

import java.util.ArrayList;
import java.util.List;

public class Opgave5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Jan Jensen", "Jens Hansen", "Leo Hansen", "Jens Jensen", "Jensine Larsen"));
        System.out.println(countDelStrengIt(list, "Jens"));
        System.out.println(countDelStrengrec(list, "Jens"));
    }

    public static int countDelStrengIt(List<String> list, String sub) {
        int counter = 0;
        for (String s : list) {
            counter += countString(s,sub);
        }
        return counter;
    }

    public static int countDelStrengrec(List<String> list, String sub) {
        return countDelStrengrec(list,sub,0);
    }
    public static int countDelStrengrec(List<String> list, String sub, int i) {
        int counter = 0;
        if (list.size() > i) {
            counter += countStringRecursive(list.get(i),sub,0);
            counter += countDelStrengrec(list,sub,i+1);
        }
        return counter;
    }

    public static int countString(String s, String sub) {
        int i = 0;
        int counter = 0;
        int subLength = sub.length();
        while (i < s.length()-subLength) {
            if (s.substring(i,subLength+i).equals(sub)) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    public static int countStringRecursive(String s, String sub, int i) {
        int counter = 0;
        int subLength = sub.length();
        if (i < s.length()-subLength) {
            if (s.substring(i, subLength + i).equals(sub)) {
                counter++;
            }
            counter += countStringRecursive(s,sub,i+1);
        }

        return counter;
    }
}
