package cui.atd.objectPoolTask;
import java.util.UUID;

public class ExpensiveResourcePool<T> extends ObjectPool<T> {

	public ExpensiveResourcePool(int size) {
		super(size);
	}

	@Override
	public T createNew() {
		//return an object with random name
		return (T) new ExpensiveResource(UUID.randomUUID().toString());
	}
	
}
