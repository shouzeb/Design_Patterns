package pk.cui.questionOne;

public class StrawberryCake extends Decorator {
	public StrawberryCake(Cake c) {
		super(c);
		
	}

	int price = 350;

	@Override
	public void bake() { 
		System.out.println("Strawberrycake: 350");

	}

	@Override
	public int getPrice() {
		return  this.price;
	}

}
