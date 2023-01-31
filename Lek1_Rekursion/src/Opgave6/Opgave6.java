package Opgave6;

public class Opgave6 {
    public static void main(String[] args) {
        System.out.println(domino(6));
    }
    public static int domino(int n){
        if (n <= 1) {
            return 1;
        } else {
            return domino(n - 1) + domino(n - 2);
        }
    }
}
