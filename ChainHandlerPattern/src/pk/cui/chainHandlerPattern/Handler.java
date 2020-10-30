package pk.cui.chainHandlerPattern;

public interface Handler {
void setNext(Handler next);
void handle(File file);
String getName();
}
