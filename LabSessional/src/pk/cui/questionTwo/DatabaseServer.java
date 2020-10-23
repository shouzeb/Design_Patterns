package pk.cui.questionTwo;

public class DatabaseServer implements facadeInterface{

	public void boot() {
	System.out.println("Database server is booting");
}
	public void startConnections() {
		System.out.println("Database server is starting the connections");
	}
	
	public void destroyConnections() {
		System.out.println("Database server is destroying the connections");
	}
	
	public void shutdown() {
		System.out.println("Database server is shutting down");
	}
}
