package pk.cui.espressoBuilder;

public class StoreWorker {
private String name;

public StoreWorker(String name) {
	super();
	this.name = name;
}
public Espresso  makeEspresso(Builder builder) {
	builder.setType(Type.Espresso);
	builder.setSize(Size.Single);
	builder.setLength(Length.Normale);
	builder.setRoastLevel(Roast.Medium);
	builder.setExitTemperature(70.0);
	return builder.getResult();
}
public Espresso makeCaffeFreddo(Builder builder) {
	builder.setType(Type.CaffeFreddo);
	builder.setSize(Size.Single);
	builder.setLength(Length.Lungo);
	builder.setRoastLevel(Roast.Ligth);
	builder.setExitTemperature(-4.0);
	return builder.getResult();
}
public String getName() {
	return name;
}

}
