package pk.cui.atd.observerPattern;

public interface Publisher {
void subscribe(Subscriber s);
void unsubscribe(Subscriber s);
}
