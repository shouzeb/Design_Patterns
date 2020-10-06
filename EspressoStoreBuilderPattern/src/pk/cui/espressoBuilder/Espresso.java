package pk.cui.espressoBuilder;

public class Espresso {
private double exitTemperature;
private Type type;
private Roast roast;
private Size size;
private Length length;
public Espresso(Type type, Size size, Length length, Roast roast,double exitTemperature) {
	
	super();
	//System.out.println(this.type);
	this.length = length;
	this.type = type;
	this.size = size;
	this.roast = roast;
	this.exitTemperature = exitTemperature;
}

public double getExitTemperature() {
	return exitTemperature;
}


public Type getType() {
	return type;
}

public Roast getRoast() {
	return roast;
}

public Size getSize() {
	return size;
}

public Length getLength() {
	return length;
}

@Override
public String toString() {
	return ""+getType()+"[size:"+getSize()+", length:"+getLength()+", roast:"+getRoast()+", temp:"+getExitTemperature()+"]";
}
}
