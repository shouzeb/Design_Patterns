
public class RoundHole {
private double radius;

public RoundHole(double radius) {
	super();
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public boolean fits(RoundPeg roundPeg) {
	//boolean result;
	if(roundPeg.getRadius()<=this.radius)
	{
		return true;
	}
	return false;
}

}
