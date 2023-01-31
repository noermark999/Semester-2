package Opgave3;

public class Opgave3 {
    public static void main(String[] args) {
        System.out.println("19*3, burde give 57: " + product(19,3));
        System.out.println(antalBeregninger1);

        System.out.println("19*3, burde give 57: " + productRus(19,3));
        System.out.println(antalBeregninger2);

    }

    private static int antalBeregninger1 = 0;
    private static int antalBeregninger2 = 0;

    public static int product(int a, int b) {
        antalBeregninger1++;
        if (a == 0) {
            return 0;
        } else {
            return b+product(a-1,b);
        }
    }

    public static int productRus(int a, int b) {
        antalBeregninger2++;
        if (a == 0) {
            return 0;
        } else if (a % 2 != 0) {
            return b+productRus(a-1,b);
        } else {
            return productRus(a/2, 2*b);
        }
    }
}
