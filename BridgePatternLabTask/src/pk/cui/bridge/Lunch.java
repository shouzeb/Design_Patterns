package pk.cui.bridge;

public class Lunch extends Meal {
	public Lunch(String type) {
		super(type);
	}
    public void getLunch() {
        imp.getSandwich();
        imp.getBeverage();
    }
}


