package pk.cui.atd.observerPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WhiteShirt shirt = new WhiteShirt();
Person s=new Person("shouzeb");
Person k=new Person("khu");
Person m = new Person("waleed");
shirt.subscribe(s);
shirt.subscribe(k);
//shirt.subscribe(m);
shirt.setInStock(true);
shirt.setInStock(false);
shirt.unsubscribe(s);
shirt.setInStock(true);
	}

}
