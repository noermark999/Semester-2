package Opgave5;

public class Opgave5 {
    public static void main(String[] args) {
        System.out.println(sfd(50,125));
    }
    public static int sfd(int a, int b) {
        if (b<=a && a%b == 0) {
            return b;
        } else if (a<b) {
            return sfd(b,a);
        } else {
            return sfd(b,a % b);
        }
    }
}
