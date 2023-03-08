package Opgave4;

import java.util.ArrayList;

public class Saelger implements Observer{
    private String navn;

    public Saelger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        BogTitel bogTitel = (BogTitel) s;
        ArrayList<BogTitel> result = new ArrayList<>();
        for (Kunde k : bogTitel.getKunder()) {
            for (BogTitel b : k.getBogTitels()) {
                if (!b.equals(bogTitel) && !result.contains(b)) {
                    result.add(b);
                }
            }
        }
        System.out.println("Her er alle bøger kunder som har købt denne bog også har købt:");
        System.out.println(result);
        System.out.println();
    }
}
