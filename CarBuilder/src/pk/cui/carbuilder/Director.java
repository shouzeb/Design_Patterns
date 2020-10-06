package pk.cui.carbuilder;

public class Director {
	
public void createSedanCar(Builder builder) {
	builder.setCarType(Type.Sedan);
	builder.setBodyStyle(new BodyStyle(202.9, 76.2, 60.7, 112.9, 65.3, 65.5, 39.5));
	builder.setBreakType(new BreakType("Four-wheel disc brakes: two ventilated. Electronic brake distribution"));
	builder.setPowerType(new PowerType("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm"));
	builder.setFuelType(new FuelType(19, 29, 23, 437));
	builder.setSeatType(new SeatType("Front seat center armrest.Rear seat center armrest.Split-folding rear seats"));
	builder.setEngine(new Engine("3.5L Duramax V 6 DOHC"));

}
public void createSportsCar(Builder builder) {
	builder.setCarType(Type.Sports);
	builder.setBodyStyle(new BodyStyle(192.3, 75.5, 54.2, 112.3, 63.7, 64.1, 37.7));
	builder.setBreakType(new BreakType("Four-wheel disc brakes: two ventilated. Electronic brake distribution"));
	builder.setPowerType(new PowerType("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm"));
	builder.setFuelType(new FuelType(17, 28, 20, 380));
	builder.setSeatType(new SeatType("Front seat center armrest.Rear seat center armrest.Split-folding rear seats"));
	builder.setEngine(new Engine("3.5L Duramax V 6 DOHC"));

}
}
