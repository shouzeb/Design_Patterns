package cui.atd.edu.pk.factoryMethod;

public class CricleGeometry extends Geometery{

	
	@Override
	public Shape createShape() {
		return new Circle();
	}

}
