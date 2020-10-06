package pk.cui.carbuilder;

public class CarBuilder implements Builder{
	private BodyStyle bodyStyle;
	private BreakType breakType;
	private FuelType fuelType;
	private PowerType powerType;
	private SeatType seatType;
	private  Type type;
	private WindowType windowType;
	@Override
	public void setCarType(Type type) {
		// TODO Auto-generated method stub
		
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
}
