package pk.cui.sc.mediator.hw;

public enum Action {
	DRAW("draws his sword", "use his Shield"),
	GOLD("found gold", "fights for his share of the gold."),
	SPELL("casted a spell", "sees in estonishment"),
	NONE("", "");

	private String title;
	private String description;

	Action(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String toString() {
		return title;
	}
}
