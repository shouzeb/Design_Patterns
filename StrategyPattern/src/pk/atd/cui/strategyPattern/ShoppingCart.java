package pk.atd.cui.strategyPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
private ArrayList<Item> items = new ArrayList<Item>();
private PaymentStrategy strategy;

public void setStrategy(PaymentStrategy strategy) {
	this.strategy = strategy;
}

public void checkout() {
	int total = calculateTotalAmount();
	this.strategy.pay(total);
}

public void addItem(Item item) {
	this.items.add(item);
}
public int calculateTotalAmount() {
	Iterator<Item> iterator = items.iterator();
	int total = 0;
	while(iterator.hasNext()) {
		total+=iterator.next().getPrice();
	}
	return total;
}
}
