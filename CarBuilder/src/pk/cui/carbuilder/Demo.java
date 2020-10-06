package pk.cui.carbuilder;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		 CarBuilder builder = new CarBuilder();
	     director.createSedanCar(builder);
	     Car car = builder.getResult();
	     System.out.println(car);
	}

}
