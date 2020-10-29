package pk.cui.chainHandlerPattern;

public abstract class BaseHandler implements Handler{
protected Handler next;
public void setNext(Handler next) {
	this.next = next;
}
	
}
