package pk.cui.questionOne;

public abstract class Decorator implements Cake {
	protected Cake decoratedCake;

	public Decorator(Cake c) {
		this.decoratedCake = c;
	}

}