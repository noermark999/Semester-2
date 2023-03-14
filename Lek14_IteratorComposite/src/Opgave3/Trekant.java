package Opgave3;

public class Trekant extends Figur {
    private String navn;
    private double height;
    private double width;

    public Trekant(String navn, double height, double width) {
        this.navn = navn;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getAreal() {
        return 0.5 * height * width;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String str) {
        this.navn = str;
    }
    @Override
    public void tegn() {
        System.out.println("Trekant");
    }
}
