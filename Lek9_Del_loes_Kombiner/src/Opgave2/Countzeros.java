package Opgave2;

import java.util.ArrayList;

public class Countzeros {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(0);
        test.add(9);
        test.add(0);
        test.add(5);
        test.add(0);
        System.out.println(zero(test,0, test.size()-1));
    }
    public static int zero(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            }
            return 0;
        } else {
            int m = (l + h) / 2;
            int tal1 = zero(list, l, m);
            int tal2 = zero(list, m + 1, h);
            return tal1+tal2;
        }
    }
}
