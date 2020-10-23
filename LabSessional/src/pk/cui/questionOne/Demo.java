package pk.cui.questionOne;

public class Demo {

	public static void main(String[] args) {
		Cake cake = new CoffeeCake();
		System.out.println("ORDER 1");
		Cake cream = new WhippedCreamFrosting(cake);
		Cake card = new NameCard(cream);
		System.out.print("You have ordered: ");
		card.bake();
		cream.bake();
		cake.bake();
		System.out.println("Total Bill: " + (cake.getPrice() + cream.getPrice() + card.getPrice()));
		System.out.println("ORDER 2");
		Cake cake2 = new StrawberryCake();
		System.out.print("You have ordered: ");
		cake2.bake();
		System.out.print("Total Bill: " + cake2.getPrice());

	}

}
