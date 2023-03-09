package Opgave4;

public class SpiritusVareAdapter extends Vare{
    private Spiritus spiritus;

    public SpiritusVareAdapter(Spiritus spiritus) {
        super(spiritus.getPrisen(), spiritus.getBetegnelse());
        this.spiritus = spiritus;
    }

    @Override
    public double beregnMoms() {
        return spiritus.hentMoms();
    }
}
