package pk.cui.carbuilder;

public class FuelType{
	private int city,highway,combined,range;

	public FuelType(int city, int highway, int combined, int range) {
		super();
		this.city = city;
		this.highway = highway;
		this.combined = combined;
		this.range = range;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getHighway() {
		return highway;
	}

	public void setHighway(int highway) {
		this.highway = highway;
	}

	public int getCombined() {
		return combined;
	}

	public void setCombined(int combined) {
		this.combined = combined;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
}
