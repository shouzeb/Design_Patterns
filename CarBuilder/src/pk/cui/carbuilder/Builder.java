package pk.cui.carbuilder;


public interface Builder {
	void setCarType(Type type);
	void setBodyStyle(BodyStyle bodyStyle);
	void setFuelType(FuelType fuelType);
	void setPowerType(PowerType powerType);
	void setBreakType(BreakType breakType);
	void setSeatType(SeatType seatType);
	void setWindowType(WindowType windowType);
	void setEngine(Engine engine);
}