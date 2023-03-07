package Opgave2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Models a Customer with Orders.
 */
public class Customer {
	private String name;
	private final LocalDate birthday;
	private final List<Order> orders = new ArrayList<Order>();
	private Discount discount;

	/**
	 * Create a new Customer.
	 * 
	 * @param name     the name.
	 * @param birthday birthday of the customer.
	 */
	public Customer(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return this.birthday;
	}

	public List<Order> getOrders() {
		return new ArrayList<Order>(orders);
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void addOrder(Order order) {
		if (!orders.contains(order)) {
			orders.add(order);
		}
	}

	public void removeOrder(Order order) {
        orders.remove(order);
	}

	public double totalBuy() {
		double sum = 0;
		for (Order order : orders) {
			sum += order.getOrderPrice();
		}
		return sum;
	}

	public double totalBuyWithDiscount() {
		if (discount != null) {
			return discount.getDiscount(totalBuy());
		} else {
			return totalBuy();
		}
	}

}
