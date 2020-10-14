package cui.proxyPattern;

public class ProxyImage implements Image{
	String fileName;
	Image service;
	
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}


	public String getFileName() {
		return fileName;
	}


	@Override
	public void display() {
		 service = new RealImage(fileName);
		 service.display();
	}
	

}
