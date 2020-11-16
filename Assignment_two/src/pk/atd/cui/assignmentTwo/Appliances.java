package pk.atd.cui.assignmentTwo;

public class Appliances{
	private String name;
	private String id;

	public Appliances(String id, String email) {
		this.id=id;
		this.name=email;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Appliances [name=" + name + ", id=" + id + "]";
	}
	

}
