package pk.cui.observerPattern2;

public interface Publisher {
void subscribe(Subscriber s);
void unSubscribe(Subscriber s);
void notifySubsribers();
}
