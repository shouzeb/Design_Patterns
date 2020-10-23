package pk.cui.questionTwo;


public class APIFacade {
private static APIFacade instance;
private WebServer webServer = new WebServer();
private NetworkServer networkServer = new NetworkServer();
private DatabaseServer databaseServer = new DatabaseServer();
private APIFacade() {
	
}
public static APIFacade getInstance() {
	if(instance == null){
		instance = new APIFacade();
	}
	return instance;
}
public void init() {
	System.out.println("API is running the init sequence ");
	networkServer.boot();
	networkServer.readSystemConfiguration();
	databaseServer.boot();
	databaseServer.startConnections();
	webServer.boot();
	webServer.startContext();
}
public void doTask() {
	System.out.println("Doing user's Tasks");
}

public void shutdown() {
	
	System.out.println(" API is running the shutdown sequence");
	webServer.destroyContext();
	webServer.shutdown();
	databaseServer.destroyConnections();
	databaseServer.shutdown();
	networkServer.saveSystemConfiguration();
	networkServer.shutdown();
	System.out.println("API has successfully shut down");
}
}
