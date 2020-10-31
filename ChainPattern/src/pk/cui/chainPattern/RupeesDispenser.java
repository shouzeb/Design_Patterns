package pk.cui.chainPattern;

public class RupeesDispenser implements Dispenser{
    Dispenser next;
    int worth;
    
    
	public RupeesDispenser(int worth) {
		super();
		this.worth = worth;
	}

	@Override
	public void setNext(Dispenser next) {
		this.next= next;
	}

	@Override
	public void dispense(Currency amount) {
		if(amount.getAmount()>=worth) {
			int quotient = amount.getAmount()/worth;
			int remainder = amount.getAmount()%worth;
			System.out.println("I am rupees "+worth+" dispenser i am dispensing "+quotient);
			if((remainder!=0)&&(next!=null)) {
				next.dispense(new Currency(remainder));
			}
		}
		else if(next!=null) {
			next.dispense(amount);
		}
		else {
			System.out.println("cant be processed.");
		}
	}

}
