package pk.cui.atd.observerPattern;

import java.util.ArrayList;

public class WhiteShirt implements Publisher{
private ArrayList<Subscriber> subscribers;
boolean inStock = false;	



public WhiteShirt() {
	subscribers = new ArrayList<Subscriber>();
}

public void setInStock(boolean inStock) {
	this.inStock = inStock;
	if(inStock) {
		notifySubscribers();
	}
}

@Override
	public void subscribe(Subscriber s) {
		if(!subscribers.contains(s)) {
			subscribers.add(s);
		}
	}

	@Override
	public void unsubscribe(Subscriber s) {
		if(subscribers.contains(s)) {
			subscribers.remove(s);
		}
	}
	
	public void notifySubscribers() {
		for(Subscriber s: subscribers) {
			s.update();
		}
	}

}
