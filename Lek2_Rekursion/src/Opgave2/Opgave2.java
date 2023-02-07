package Opgave2;

public class Opgave2 {
    public static void main(String[] args) {
        System.out.println(palindrom("racecar"));
    }

    public static boolean palindrom(String tekst) {
        return palindrom(tekst, 0);
    }
    public static boolean palindrom(String tekst, int index) {
        if (tekst.length()/2 == index) {
            return true;
        } else {
            if (tekst.charAt(index) == tekst.charAt(tekst.length()-index-1)) {
                palindrom(tekst,index+1);
            } else {
                return false;
            }
        }
        return true;
    }
}
