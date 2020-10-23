package pk.cui.questionOne;

public class NameCard extends Decorator {
	int price = 120;

	NameCard(Cake c) {
		super(c);
	}

	@Override
	public void bake() {
		System.out.println("Name card: 80");
	}

	@Override
	public int getPrice() {
		return this.price;
	}

}