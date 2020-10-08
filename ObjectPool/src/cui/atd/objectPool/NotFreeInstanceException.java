package cui.atd.objectPool;

public class NotFreeInstanceException extends Exception {
private static final long serialVersionUID = 2L;
public NotFreeInstanceException() {
	super("No Free Reusable is available");
	// TODO Auto-generated constructor stub
}

}
