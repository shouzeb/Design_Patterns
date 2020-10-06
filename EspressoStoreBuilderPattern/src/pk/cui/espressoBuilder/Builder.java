package pk.cui.espressoBuilder;

public interface Builder {

	void setSize(Size size);
	void setLength(Length length);
	void setExitTemperature(double exitTemperature);
	void setRoastLevel(Roast roast);
	Espresso getResult();
	void setType(Type type);
}
