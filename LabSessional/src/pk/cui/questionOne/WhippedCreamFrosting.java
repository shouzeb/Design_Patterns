package pk.cui.questionOne;

public class WhippedCreamFrosting extends Decorator {
	private int price = 100;

	WhippedCreamFrosting(Cake c) {
		super(c);
	}

	@Override
	public void bake() {
		System.out.println("WhippedCreamFrosting: 100");
	}

	public int getPrice() {
		return price;
	}

}
