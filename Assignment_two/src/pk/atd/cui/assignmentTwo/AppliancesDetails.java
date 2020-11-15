package pk.atd.cui.assignmentTwo;

public class AppliancesDetails {
	private String name;
	private String id;

	public AppliancesDetails(String id, String email) {
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
		String str= "Profile[id = "+getId()+", email= "+getName()+"]";
		return str;
	
}}
