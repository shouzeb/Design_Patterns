package pk.cui.observerPattern2;

public class Demo {
	public static void main(String[] args) {
Commentary commentary = new Commentary();
Subscriber subscriber = new SMSSubscriber("Ahmed ALi [Abbottabad]");
commentary.subscribe(subscriber);

	}
}
