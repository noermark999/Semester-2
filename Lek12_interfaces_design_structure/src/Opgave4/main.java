package Opgave4;

public class main {
    public static void main(String[] args) {
        Observer hansen = new Saelger("Hansen");
        Observer jensen = new Indkoeber("Jensen");
        BogTitel aAnd = new BogTitel("Anders And", 6);
        BogTitel java = new BogTitel("Java", 8);
        Kunde kunde1 = new Kunde("Læsehest1");
        Kunde kunde2 = new Kunde("Læsehest2");
        Kunde kunde3 = new Kunde("Læsehest3");

        aAnd.addObserver(hansen);
        aAnd.addObserver(jensen);
        java.addObserver(hansen);
        java.addObserver(jensen);

        java.etKoeb(kunde1);
        java.etKoeb(kunde2);
        java.etKoeb(kunde3);
        aAnd.etKoeb(kunde1);
        aAnd.etKoeb(kunde2);
        aAnd.etKoeb(kunde3);

        System.out.println(java.getAntal());
        System.out.println(aAnd.getAntal());
    }
}
