package pk.cui.questionOne;


public class Demo {

	public static void main(String[] args) {
		Cake c=new CoffeeCake();
		System.out.println("ORDER 1");
		Cake cream=new WhippedCreamFrosting(c);
		Cake card=new NameCard(cream);
		System.out.print("You have ordered:");
		card.bake();
		cream.bake();
		c.bake();
		System.out.println("Total Bill:"+(c.getPrice()+cream.getPrice()+card.getPrice()));
		System.out.println("ORDER 2");
		Cake c2=new StrawberryCake();
		System.out.print("You have ordered:");
		c2.bake();
		System.out.print("Total Bill:"+c2.getPrice());
		
	}

}
