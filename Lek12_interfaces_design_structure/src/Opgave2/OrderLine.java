package Opgave2;

/**
 * Models an OrderLine in an Order.
 */
public class OrderLine {
    private final int lineNumber;
    private final int count;
    private final Product product;

    /**
     * An line on the Order
     * 
     * @param lineNumber
     *            the line number. Must be >= 1 and sequential.
     * @param count
     *            the number of products in this line.
     * @param product
     *            the ordered product.
     */
    OrderLine(int lineNumber, int count, Product product) {
        this.lineNumber = lineNumber;
        this.count = count;
        this.product = product;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public int getCount() {
        return this.count;
    }

    public Product getProduct() {
        return product;
    }

    public double getOrderLinePrice() {
        return product.getUnitPrice() * count;
    }

}
