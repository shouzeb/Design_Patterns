package pk.cui.observerPattern2;

import java.util.ArrayList;

public class Commentary implements Publisher{
 ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
 
	private String desc;
 
 @Override
	public void subscribe(Subscriber s) {
		if(!subscribers.contains(s)) {
			subscribers.add(s);
		}
	}

	@Override
	public void unSubscribe(Subscriber s) {
		if(subscribers.contains(s)) {
			subscribers.remove(s);
		}
	}

	@Override
	public void notifySubsribers() {
		for(Subscriber s: subscribers) {
			s.update(desc);
		}
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}
