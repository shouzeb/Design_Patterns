package pk.cui.atd.observerPattern;

public class Person implements Subscriber{
String name;

 public Person(String name) {
this.name = name;
}
	@Override
	public void update() {
		
		System.out.println("In stock"+name+" is in stock.");
	}

}
