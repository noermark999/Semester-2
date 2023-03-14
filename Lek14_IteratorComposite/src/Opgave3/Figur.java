package Opgave3;

public abstract class Figur {
    public abstract double getAreal();
    public abstract void tegn();
    public void add(Figur figur) {
        throw new UnsupportedOperationException();
    }
    public void remove(Figur figur) {
        throw new UnsupportedOperationException();
    }
    public Figur getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
