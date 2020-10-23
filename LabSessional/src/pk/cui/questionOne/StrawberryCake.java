package pk.cui.questionOne;


public class StrawberryCake implements Cake{
	 int price=350;
		@Override
		public void bake() {
		System.out.println("Strawberrycake: 350");
			
		}
		@Override
		public int getPrice() {
			return this.price;
		}

	}
