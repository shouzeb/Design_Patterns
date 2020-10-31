package pk.cui.chainPattern;

public class DispenserChain {
Dispenser start;
	public DispenserChain() {
	start = new RupeesDispenser(5000);
	Dispenser d1 = new RupeesDispenser(1000);
	Dispenser d2 = new RupeesDispenser(500);

start.setNext(d1);
d1.setNext(d2);
	}
	public void Dispense(Currency amount) {
		start.dispense(amount);
	}
}
