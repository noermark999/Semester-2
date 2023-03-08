package Opgave4;

public class Indkoeber implements Observer{
    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        BogTitel bogTitel = (BogTitel) s;
        if (bogTitel.getAntal() < 6) {
            System.out.println("Der skal bestilles 10 bøger mere af " + bogTitel.getTitel());
            bogTitel.indkoebTilLager(10);
            System.out.println();
        }
    }
}
