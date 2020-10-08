
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RoundHole roundHole = new RoundHole(10);
RoundPeg roundPeg = new RoundPeg(10);
if(roundHole.fits(roundPeg)) {
	System.out.println("fitted successfully");
}
SquarePeg squarePeg = new SquarePeg(10);
//roundHole.fits(squarePeg);
SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
//System.out.println(squarePegAdapter.getClass().getName());
if(roundHole.fits(squarePegAdapter)) {
	System.out.println("fitted successfully");
}
	}

}
