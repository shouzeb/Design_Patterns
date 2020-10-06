package pk.cui.carbuilder;

public class CarBuilder implements Builder{
	private BodyStyle bodyStyle;
	private BreakType breakType;
	private FuelType fuelType;
	private PowerType powerType;
	private SeatType seatType;
	private  Type type;
	private WindowType windowType;
	private Engine engine;
	
	@Override
	public void setCarType(Type type) {
		this.type = type;
		
	}
	@Override
	public void setBodyStyle(BodyStyle bodyStyle) {
		this.bodyStyle = bodyStyle;
		
	}
	@Override
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
		
	}
	@Override
	public void setPowerType(PowerType powerType) {
		this.powerType = powerType;
		
	}
	@Override
	public void setBreakType(BreakType breakType) {
		this.breakType = breakType;
		
	}
	@Override
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
		
	}
	@Override
	public void setWindowType(WindowType windowType) {
		this.windowType = windowType;
		
	}
	public Car getResult()
	{
		return new Car(bodyStyle, breakType, fuelType, powerType, seatType, type, windowType);
	}
	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
		
	}
}
