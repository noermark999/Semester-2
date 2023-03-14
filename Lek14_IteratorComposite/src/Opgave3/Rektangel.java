package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class Rektangel extends Figur {
    private String navn;
    private double length;
    private double width;

    public Rektangel(String navn, double length, double width) {
        this.navn = navn;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getAreal() {
        return length * width;
    }
    public String getNavn() {
        return navn;
    }

    public void setNavn(String str) {
        this.navn = str;
    }
    @Override
    public void tegn() {
        System.out.println("Rektangel");
    }
}
