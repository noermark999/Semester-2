package Opgave4;

public class main {
    public static void main(String[] args) {
        ElVare elVare = new ElVare(50,"Oplader");
        System.out.println(elVare.beregnMoms());

        FoedeVare foedeVare = new FoedeVare(10,"Appelsiner");
        System.out.println(foedeVare.beregnMoms());

        Spiritus spiritus = new Spiritus(100, "Whiskey");
        SpiritusVareAdapter sva = new SpiritusVareAdapter(spiritus);
        System.out.println(sva.beregnMoms());


    }
}
