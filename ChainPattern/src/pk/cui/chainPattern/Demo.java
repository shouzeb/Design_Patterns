package pk.cui.chainPattern;

public class Demo {

	public static void main(String[] args) {

		Currency amount = new Currency(3000);

		DispenserChain chain = new DispenserChain();
		chain.Dispense(amount);
	}

}
