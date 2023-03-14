package Opgave3;

public class main {
    public static void main(String[] args) {
        Figur trekant = new Trekant("Trekant",10,10);
        Figur ellipse = new Ellipse("Ellipse", 15,10);
        CompositeFigur compositeFigur = new CompositeFigur();
        compositeFigur.add(ellipse);
        compositeFigur.add(trekant);

        System.out.println(compositeFigur.getAreal());
        compositeFigur.tegn();
    }
}
