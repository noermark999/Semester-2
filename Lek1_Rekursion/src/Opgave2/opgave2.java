package Opgave2;

public class opgave2 {
    public static void main(String[] args) {
        System.out.println("2^6, burde give 64: " + power(2,6));

        System.out.println("3^6, burde give 729: " + power2(3,6));
    }

    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return n*power(n,p-1);
        }
    }

    public static int power2(int n, int p) {
        if (p == 0) {
            return 1;
        } else if (p % 2 != 0){
            return n*power2(n,p-1);
        } else {
            return power2(n*n,p/2);
        }
    }
}
