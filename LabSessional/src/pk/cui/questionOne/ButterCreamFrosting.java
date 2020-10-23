package pk.cui.questionOne;

public class ButterCreamFrosting extends CakeDecorator{
	int price=120;
	ButterCreamFrosting(Cake c) {
		super(c);
	}

	public int getPrice() {
		return price;
	}
	@Override
	public void bake() {
		System.out.println("ButterFrosting: 100");
	}


	

}