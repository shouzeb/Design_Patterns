
public class SquarePegAdapter extends RoundPeg{
	private SquarePeg squarePeg;

	public SquarePegAdapter( SquarePeg squarePeg) {
		this.squarePeg = squarePeg;
	}
	
	@Override
	public double getRadius() {
		System.out.println("square peg adapter getRadius called");
		return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
	}

}
