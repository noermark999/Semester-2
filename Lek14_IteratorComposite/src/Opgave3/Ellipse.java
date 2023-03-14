package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class Ellipse extends Figur{
    private String navn;
    private double radius1;
    private double radius2;

    public Ellipse(String navn, double radius1, double radius2) {
        this.navn = navn;
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double getAreal() {
        return Math.PI * radius1 * radius2;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String str) {
        this.navn = str;
    }
    @Override
    public void tegn() {
        System.out.println("Ellipse");
    }

}
