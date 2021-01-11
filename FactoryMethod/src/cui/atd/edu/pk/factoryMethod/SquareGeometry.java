package cui.atd.edu.pk.factoryMethod;

public class SquareGeometry extends Geometery{

	@Override
	
	public Shape createShape() {
	
		return new Square();
	
	}

}
