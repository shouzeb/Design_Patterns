package pk.atd.cui.stateDesignPattern;

public class Demo {
	public static void main(String[] args) {
	Offstate of = new Offstate();
	TV tv = new TV(of);
	
	State on = new OnState();
	tv.changeState(on);
	
}
}
