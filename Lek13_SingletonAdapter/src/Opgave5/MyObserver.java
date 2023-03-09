package Opgave5;

public class MyObserver implements Observer{
    private String navn;

    public MyObserver(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(String s, int antal) {
        System.out.println(s + ": " + antal);
    }
}
