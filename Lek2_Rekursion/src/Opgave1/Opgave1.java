package Opgave1;

import java.util.ArrayList;

public class Opgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(3);
        test.add(5);
        test.add(8);
        test.add(10);
        test.add(19);
        System.out.println(ligeTal(test));
        System.out.println(ligeTal1(test));
    }

    public static int ligeTal(ArrayList<Integer> list) {
        return ligeTal(list, 0);
    }

    private static int ligeTal(ArrayList<Integer> list, int index) {
        int result = 0;
        if (index == list.size()) {
            return 0;
        } else {
            if (list.get(index) % 2 == 0) {
                result++;
            }
            result += ligeTal(list,index+1);
        }
        return result;
    }

    private static int ligeTal1(ArrayList<Integer> list) {
        int result = 0;
        if (list.isEmpty()) {
            return 0;
        } else {
            if (list.get(0) % 2 == 0) {
                result++;
            }
            list.remove(0);
            result += ligeTal1(list);
        }
        return result;
    }
}
