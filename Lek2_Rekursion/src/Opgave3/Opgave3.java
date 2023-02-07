package Opgave3;

import java.util.ArrayList;

public class Opgave3 {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(6);
        test.add(10);
        test.add(29);
        test.add(50);
        test.add(78);
        test.add(99);
        test.add(103);
        System.out.println(findesTal(test,199));
    }

    public static boolean findesTal(ArrayList<Integer> list, int tal) {
        return findesTal(list, tal, 0, list.size()-1);
    }

    private static boolean findesTal(ArrayList<Integer> list, int tal, int low, int high) {
        int mid = low  + ((high - low) / 2);
        if (high < low) {
            return false;
        }

        if (list.get(mid) == tal ) {
            return true;
        } else if (list.get(mid) > tal) {
            return findesTal(list,tal, low,mid-1);
        } else {
            return findesTal(list,tal, mid+1,high);
        }
    }
}
