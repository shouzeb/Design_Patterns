package pk.atd.cui.stateDesignPattern;

public class Offstate implements State{

	@Override
	public void doAction() {
		System.out.println("Tv is off");		
	}

}
