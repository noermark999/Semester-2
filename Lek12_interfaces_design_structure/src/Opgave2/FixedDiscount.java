package Opgave2;

public class FixedDiscount implements Discount{
    private int fixedDiscount;
    private int discountLimit;
    public FixedDiscount(int fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = 1000;
    }

    public int getFixedDiscount() {
        return fixedDiscount;
    }

    public int getDiscountLimit() {
        return discountLimit;
    }

    public void setDiscountLimit(int discountLimit) {
        this.discountLimit = discountLimit;
    }

    public void setFixedDiscount(int fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }

    @Override
    public double getDiscount(double price) {
        if (price>discountLimit) {
            return price -= fixedDiscount;
        }
        return price;
    }
}
