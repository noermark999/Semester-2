package Opgave2;

import java.util.ArrayList;
import java.util.List;

/**
 * Models an Order with OrderLines and an order number. 
 */
public class Order {
    private final int number;
    private final List<OrderLine> orderLines = new ArrayList<OrderLine>();
    
    /**
     * Create the order.
     * @param number a sequential number given to each Order in the system. 
     */
    public Order(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
    
    /**
     * Create a new order line with the given product.
     * @param count the amount of products in this line. Must be >= 1.
     * @param product the product ordered.
     */
    public void createOrderLine(int count, Product product) {
        OrderLine line = new OrderLine(orderLines.size() + 1, count, product);
        orderLines.add(line);
    }
    
    public List<OrderLine> getOrderLines() {
        return new ArrayList<OrderLine>(orderLines);
    }

    public double getOrderPrice() {
        double sum = 0;
        for (OrderLine orderLine : orderLines) {
            sum += orderLine.getOrderLinePrice();
        }
        return sum;
    }
    
}
