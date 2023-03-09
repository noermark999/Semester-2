package Opgave2;

public class Counter {
    private static Counter counterInstance;
    private int value;

    private Counter() {
        value = 0;
    }

    public static Counter getInstance() {
        if (counterInstance == null) {
            counterInstance = new Counter();
        }
        return counterInstance;
    }

    public void count() {
        value++;
    }

    public void times2() {
        value = value*2;
    }

    public void zero() {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
