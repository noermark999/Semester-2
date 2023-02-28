package Opgave3;

import java.util.Arrays;

public class Opgave3 {
    public static void main(String[] args) {
        int[] test = {5, 10, 5, 6, 4, 9, 8};
        System.out.println(Arrays.toString(prefixAverage(test)));
    }

    public static double[] prefixAverage(int[] inputTal) {
        double[] result = new double[inputTal.length];
        double sum = inputTal[0];
        result[0] = inputTal[0];
        for (int i = 1; i < inputTal.length; i++) {
            sum += inputTal[i];
            result[i] = sum / (i+1);
        }
        return result;
    }
}
