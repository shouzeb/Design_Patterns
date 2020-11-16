package pk.atd.cui.assignmentTwo;



public class Invoker implements Command{

	public Command command; 
	
	public Invoker(Command command) {
		super();
		this.command = command;
	}

	@Override
	public void execute() {
		this.command.execute();
		
	}

}
