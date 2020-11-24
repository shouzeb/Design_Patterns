package pk.atd.cui.mediatorPattern;

public class ConcreteMediator implements Mediator{

	private Component1 com1;
	private Component2 com2;
	
	public ConcreteMediator(Component1 com1, Component2 com2) {
		
		this.com1 = com1;
		com1.setMediator(this);
		this.com2 = com2;
		com2.setMediator(this);
	}
	
	@Override
	public void notify(Object sender, String event) {
		if(event.equals("A")) {
			System.out.println("Mediator reacts on A and trigers following operations:");
		com2.doC();
		}
		if (event.equals("D")){
        	System.out.println("Mediator reacts on D and triggers following operations:");
            com1.doB();
            com2.doC();
        }
		
		
	}
	
}
