package atd.cui.facade;

public class ShopKeeper {
	private MobileShop iphone;  
	private MobileShop samsung;  
	private MobileShop blackberry;  

	public ShopKeeper(){  
		iphone= new IPhone();  
		samsung= new Samsung();  
		blackberry=new Blackberry();  
	}  
	public void sellIPhone(){  
		iphone.modelNo();  
		iphone.price();  
	}  
	public void sellSamsung(){  
		samsung.modelNo();  
		samsung.price();  
	}  
	public void sellBlackberry(){  
		blackberry.modelNo();  
		blackberry.price();  
	}  
}  
