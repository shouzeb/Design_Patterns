package pk.atd.cui.assignmentTwo;

public class Fuser implements KitchenApplianceReceiver{

	@Override
	public void turnOn() {
		System.out.println("Fuser is turned on.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Fuser is turned Off.");
		
	}

}
