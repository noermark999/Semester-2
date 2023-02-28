package Opgave2;

public class Opgave2 {
    public static void main(String[] args) {
        System.out.println(method1(1000000));
    }

    //N*log(n)
    public static int method1(int n){
        int result = 0;
        for (int i = 0; i<n ; i++){
            for (int j = 1; j < n; j = j*2){
                result++;
            }
        }
        return result;
    }
}
