package Opgave2;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();

        counter.count();
        counter.count();
        counter.count();
        System.out.println(counter.getValue());

        counter = Counter.getInstance();

        counter.times2();
        System.out.println(counter.getValue());
    }
}
