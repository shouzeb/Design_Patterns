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
		return ("\n\n-------"+this.type+"-------\nBody: External dimensions: overall length (inches): "+bodyStyle.getOverallLength()+", overall width (inches): "+bodyStyle.getWidth()+", \noverall height (inches): "+bodyStyle.getHeight() +", wheelbase (inches): "+bodyStyle.getWheelbase() +", \nfront track (inches): "+ bodyStyle.getFrontTrack()+", rear track (inches): "+ bodyStyle.getRearTrack()+" \nand curb to curb turning circle (feet): "+bodyStyle.getCurbToCurbTurningCicle()+"\r\n"
				+ " \nPower: 285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm\r\n"
				+ " \nEngine: 3.5L Duramax V 6 DOHC\r\n"
				+ " \nBreaks: Four-wheel disc brakes: two ventilated. Electronic brake distribution\r\n"
				+ " \nSeats: Front seat center armrest.Rear seat center armrest.Split-folding rear seats\r\n"
				+ " \nWindows: Laminated side windows.Fixed rear window with defroster\r\n"
				+ " \nFuel Type: Gasoline "+fuelType.getCity()+" MPG city, "+fuelType.getHighway()+" MPG highway, "+fuelType.getCombined()+" MPG combined and "+fuelType.getRange()+" mi. range");
	}
	
	

}
