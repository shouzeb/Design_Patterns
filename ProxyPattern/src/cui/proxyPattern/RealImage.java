package cui.proxyPattern;

public class RealImage implements Image{
String fileName;

public String getFileName() {
	return fileName;
}

public void setFileName(String fileName) {
	this.fileName = fileName;
}

public void display() {
	loadFromDisk();
	System.out.println("displaying"+fileName);
}
public RealImage(String fileName) {
	super();
	this.fileName = fileName;
}

public void loadFromDisk() {
	System.out.println("loading"+fileName);
}
}
