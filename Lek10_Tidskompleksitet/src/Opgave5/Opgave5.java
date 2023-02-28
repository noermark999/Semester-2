package Opgave5;

public class Opgave5 {
    public static void main(String[] args) {
        char[] test = { 'G', 'R', 'S', 'G', 'G', 'R', 'S', 'R', 'G', 'G', 'R', 'S', 'G' };
        System.out.println(test);
        belgisk_flag(test);
        System.out.println(test);
    }
    public static void belgisk_flag(char[] belgisk_flag) {
        int countS = 0;
        int countG = 0;
        int countR = 0;
        for (char c : belgisk_flag) {
            if (c == 'S') {
                countS++;
            } else if (c == 'G') {
                countG++;
            } else {
                countR++;
            }
        }
        for (int i = 0; i < countS; i++) {
            belgisk_flag[i] = 'S';
        }
        for (int i = countS; i < countG+countS; i++) {
            belgisk_flag[i] = 'G';
        }
        for (int i = countS+countG; i < countR+countG+countS; i++) {
            belgisk_flag[i] = 'R';
        }
    }
}
