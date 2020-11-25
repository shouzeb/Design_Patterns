package pk.atd.cui.strategyPattern;

public class Paypal implements PaymentStrategy{
    private String email;
    private String pwd;
    
    
	public Paypal(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
	}


	@Override
	public void pay(int amount) {
		System.out.println(amount+" pkr has been paid from "+email);
	}

}
