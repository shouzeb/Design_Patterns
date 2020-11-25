package pk.atd.cui.strategyPattern;

public class CreditCard implements PaymentStrategy{
private String name;
private String cardNumber;
private String pin;
private String dateOfExpiry;

	public CreditCard(String name, String cardNumber, String pin, String dateOfExpiry) {
	super();
	this.name = name;
	this.cardNumber = cardNumber;
	this.pin = pin;
	this.dateOfExpiry = dateOfExpiry;
}

	@Override
	public void pay(int amount) {
		System.out.println(amount+" has been paid from credit card having number"+cardNumber);
	}

}
