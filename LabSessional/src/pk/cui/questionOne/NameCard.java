package pk.cui.questionOne;

public class NameCard extends Decorator {
	int price = 75;

	NameCard(Cake c) {
		super(c);
	}

	@Override
	public void bake() {
		System.out.println("Name card: "+getPrice());
	}

	@Override
	public int getPrice() {
		return this.price;
	}

}