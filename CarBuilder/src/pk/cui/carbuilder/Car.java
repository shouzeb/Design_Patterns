package pk.cui.carbuilder;

public class Car{
	private BodyStyle bodyStyle;
	private BreakType breakType;
	private FuelType fuelType;
	private PowerType powerType;
	private SeatType seatType;
	private  Type type;
	private WindowType windowType;
	public Car(BodyStyle bodyStyle, BreakType breakType, FuelType fuelType, PowerType powerType, SeatType seatType,
			Type type, WindowType windowType) {
		super();
		this.bodyStyle = bodyStyle;
		this.breakType = breakType;
		this.fuelType = fuelType;
		this.powerType = powerType;
		this.seatType = seatType;
		this.type = type;
		this.windowType = windowType;
	}
	public BodyStyle getBodyStyle() {
		return bodyStyle;
	}
	public BreakType getBreakType() {
		return breakType;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public PowerType getPowerType() {
		return powerType;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public Type getType() {
		return type;
	}
	public WindowType getWindowType() {
		return windowType;
	}
	
	

}
