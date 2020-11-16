package pk.atd.cui.assignmentTwo;

public class TurnOnCommand implements Command{
private KitchenApplianceReceiver receiver;

public TurnOnCommand(KitchenApplianceReceiver receiver) {
	
	this.receiver = receiver;
}

@Override
public void execute() {
	receiver.turnOn();
	
}

}
