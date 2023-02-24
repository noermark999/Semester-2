package Opgave1;

import java.util.ArrayList;

public class SumRekursiv {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(7);
        test.add(9);
        test.add(2);
        System.out.println(sum(test,0, test.size()-1));
    }
    public static int sum(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int tal1 = sum(list, l, m);
            int tal2 = sum(list, m + 1, h);
            return tal1+tal2;
        }
    }
}
