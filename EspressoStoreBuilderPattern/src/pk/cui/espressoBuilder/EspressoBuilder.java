package pk.cui.espressoBuilder;

public class EspressoBuilder implements Builder{

	private double exitTemperature;
	private Type type;
	private Roast roast;
	private Size size;
	private Length length;
	
	@Override
	public void setSize(Size size) {
		this.size = size;
		
	}

	@Override
	public void setLength(Length length) {
		this.length = length;
		
	}

	@Override
	public void setExitTemperature(double exitTemperature) {
		this.exitTemperature = exitTemperature;
		
	}

	@Override
	public void setRoastLevel(Roast roast) {
		this.roast = roast;
		
	}

	@Override
	public Espresso getResult() {
	
		return new Espresso(type, size, length, roast, exitTemperature);
	}

	@Override
	public void setType(Type type) {
		this.type = type;
		
	}
	
}
