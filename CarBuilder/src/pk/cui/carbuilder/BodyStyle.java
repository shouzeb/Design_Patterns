package pk.cui.carbuilder;

public class BodyStyle {
private double overallLength, width,height,wheelbase,frontTrack,rearTrack,curbToCurbTurningCicle;

public BodyStyle(double overallLength, double width, double height, double wheelbase, double frontTrack,
		double rearTrack, double curbToCurbTurningCicle) {
	super();
	this.overallLength = overallLength;
	this.width = width;
	this.height = height;
	this.wheelbase = wheelbase;
	this.frontTrack = frontTrack;
	this.rearTrack = rearTrack;
	this.curbToCurbTurningCicle = curbToCurbTurningCicle;
}

public double getCurbToCurbTurningCicle() {
	return curbToCurbTurningCicle;
}

public void setCurbToCurbTurningCicle(double curbToCurbTurningCicle) {
	this.curbToCurbTurningCicle = curbToCurbTurningCicle;
}

public double getOverallLength() {
	return overallLength;
}

public double getWidth() {
	return width;
}

public double getHeight() {
	return height;
}

public double getWheelbase() {
	return wheelbase;
}

public double getFrontTrack() {
	return frontTrack;
}

public double getRearTrack() {
	return rearTrack;
}

}
