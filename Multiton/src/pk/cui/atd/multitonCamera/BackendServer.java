package pk.cui.atd.multitonCamera;

import java.util.HashMap;

public class BackendServer {
private String ip;
private HashMap<String, BackendServer> map;
private static BackendServer instance;

private BackendServer(String ip) {
	this.ip = ip;
}
public String getIp() {
	return ip;
}
private BackendServer() {
	map = new HashMap<String, BackendServer>();
	BackendServer backendServer1 = new BackendServer("192.168.1.1");
	map.put("server1", backendServer1);
	BackendServer backendServer2 = new BackendServer("192.168.1.2");
	map.put("server2", backendServer2);
}
	public static BackendServer getInstance(String server) {
		if(instance == null) {
			instance = new BackendServer();
		}
		if(instance.map.containsKey(server.toLowerCase()))
			{
			return instance.map.get(server.toLowerCase());
			}
			
		return null;
}
	@Override
	public String toString(){
	return "Backend Server: "+getIp();
	}
		
	}

