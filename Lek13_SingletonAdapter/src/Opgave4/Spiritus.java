package Opgave4;

public class Spiritus {
    private int prisen;
    private String betegnelse;

    public Spiritus(int prisen, String betegnelse) {
        this.prisen = prisen;
        this.betegnelse = betegnelse;
    }

    public int getPrisen() {
        return prisen;
    }

    public void setPrisen(int prisen) {
        this.prisen = prisen;
    }

    public String getBetegnelse() {
        return betegnelse;
    }

    public void setBetegnelse(String betegnelse) {
        this.betegnelse = betegnelse;
    }

    double hentMoms() {
        if (prisen <= 90) {
            return prisen*0.8;
        }
        return prisen*1.2;
    }

}
