package pk.atd.cui.assignmentTwo;

public class TurnOffCommand implements Command{
	private KitchenApplianceReceiver receiver;
	
	
	public TurnOffCommand(KitchenApplianceReceiver receiver) {
		
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		 this.receiver.turnOff();
		
	}

}
