package pk.atd.cui.strategyPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ShoppingCart cart = new ShoppingCart();
Item i1=new Item("code", 120);
Item i2=new Item("coddsde", 1120);
cart.addItem(i1);
cart.addItem(i2);
cart.setStrategy(new Paypal("myemail@sh.cm","asas"));
	cart.checkout();
	
	cart.setStrategy(new CreditCard("shouzeb", "cardNumber", "pin", "dateOfExpiry"));
    cart.checkout();
	}

}
