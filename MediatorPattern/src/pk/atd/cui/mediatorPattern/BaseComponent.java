package pk.atd.cui.mediatorPattern;

public abstract class BaseComponent {

	protected Mediator mediator;
	public void setMediator(Mediator m) {
		this.mediator = m;
	}
}
