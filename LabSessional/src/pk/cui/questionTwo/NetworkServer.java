package pk.cui.questionTwo;

public class NetworkServer implements facadeInterface{
public void boot() {
	System.out.println("Network server is booting.");
}

public void readSystemConfiguration() {
	System.out.println("Network server is reading the system configuratoion.");

}

public void saveSystemConfiguration() {
	System.out.println("Network server is saving the system configurations");

}
public void shutdown() {
	System.out.println("Network server is shutting down");
}
}
