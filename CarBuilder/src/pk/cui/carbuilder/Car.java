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
	
	@Override
    public String toString(){
		return ("-------"+this.type+"-------\nBody: External dimensions: overall length (inches): "+bodyStyle.getOverallLength()+", overall width (inches): "+bodyStyle.getWidth()+", overall height (inches): "+bodyStyle.getHeight() +", wheelbase (inches): "+bodyStyle.getWheelbase() +", front track (inches): "+ bodyStyle.getFrontTrack()+", rear track (inches): "+ bodyStyle.getRearTrack()+" and curb to curb turning circle (feet): "+bodyStyle.getCurbToCurbTurningCicle()+"\r\n"
				+ " Power: 285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm\r\n"
				+ " Engine: 3.5L Duramax V 6 DOHC\r\n"
				+ " Breaks: Four-wheel disc brakes: two ventilated. Electronic brake distribution\r\n"
				+ " Seats: Front seat center armrest.Rear seat center armrest.Split-folding rear seats\r\n"
				+ " Windows: Laminated side windows.Fixed rear window with defroster\r\n"
				+ " Fuel Type: Gasoline "+fuelType.getCity()+" MPG city, "+fuelType.getHighway()+" MPG highway, "+fuelType.getCombined()+" MPG combined and "+fuelType.getRange()+" mi. range");
	}
	
	

}
