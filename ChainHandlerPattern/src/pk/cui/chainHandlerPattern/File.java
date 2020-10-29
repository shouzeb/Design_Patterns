package pk.cui.chainHandlerPattern;

public class File {
private String name;
private String path;
private Type type;
public File(String name, String path, Type type) {
	super();
	this.name = name;
	this.path = path;
	this.type = type;
}
public String getName() {
	return name;
}
public String getPath() {
	return path;
}
public Type getType() {
	return type;
}

}
