package pk.cui.questionTwo;

public class WebServer {

	public void boot() {
		System.out.println("Web server server is booting.");
	}

	public void startContext() {
		System.out.println("Web server is starting the web context.");

	}

	public void destroyContext() {
		System.out.println("Web server is destroying the web context.");

	}
	public void shutdown() {
		System.out.println("Web server is shutting down");
	}
	
}
