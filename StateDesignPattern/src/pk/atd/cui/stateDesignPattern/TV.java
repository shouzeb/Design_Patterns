package pk.atd.cui.stateDesignPattern;
//context
public class TV {
private State state;

public TV(State initialState) {
	this.state = initialState;
}

public void doAction() {
	state.doAction();
}

public void changeState(State newState) {
	this.state = newState;
}
}
