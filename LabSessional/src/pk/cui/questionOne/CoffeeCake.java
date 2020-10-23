package pk.cui.questionOne;

public class CoffeeCake implements Cake {
	int price = 250;

	@Override
	public void bake() {
		System.out.println("CoffeeCake:250");

	}

	public int getPrice() {
		return price;
	}

}